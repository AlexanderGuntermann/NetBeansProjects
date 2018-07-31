/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vertexmaker;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.Stack;

/**
 *
 * @author alexguntermann
 */
public class Graph {

    public static ArrayList<VertexList> vList;      //= new ArrayList<VertexList>(vCount);
    private boolean[] visited;
    private Scanner in = new Scanner(System.in);
    private StringBuilder b = new StringBuilder();

    public Graph() {
        int vCount = 0;

        vCount = readInteger("Number of Vertices", 1);

        vList = new ArrayList<VertexList>(vCount + 1);

        int i;

        for (i = 1; i < vCount + 1; i++) {
            // Add vertex with label number, start with #1
            vList.add(i - 1, new VertexList("" + i));

            int nCount = readInteger("Number of neighbors for vertex # " + i, 0);

            ArrayList<Vertex> neibs = new ArrayList<Vertex>(nCount);

            for (int k = 0; k < nCount; k++) {
                int vertexNum = readInteger("Enter neighbor # " + (k + 1) + " for vertex # " + i, 1);
                neibs.add(new Vertex("" + vertexNum));
            }

            vList.get(i - 1).setNeibs(neibs);
        }

    }

    public Graph(String file) throws FileNotFoundException {

        Scanner inFile = new Scanner(new FileReader("graphfile.txt"));

        int vCount = 0;
        vCount = inFile.nextInt();
        String trash = inFile.nextLine();
        vList = new ArrayList<VertexList>(vCount);
        int i = 0;

        for (i = 1; i < vCount + 1; i++) {
            vList.add(i - 1, new VertexList("" + 1));
            String neibslist = inFile.nextLine();
            String[] neibsArray = neibslist.split(" ");
            int[] neibsArray1 = new int[neibsArray.length];

            for (int j = 0; j < neibsArray.length; j++) {
                neibsArray1[j] = Integer.parseInt(neibsArray[j]);
            }

            ArrayList<Vertex> neibs = new ArrayList<Vertex>(neibsArray.length);
            for (int k = 0; k < neibsArray.length; k++) {
                int vertexNum = Integer.parseInt(neibsArray[k]);
                neibs.add(new Vertex("" + vertexNum));
            }
            vList.get(i - 1).setNeibs(neibs);

        }
        inFile.close();
    }

    public void display() {

        for (int i = 1; i < vList.size() + 1; i++) {
            ArrayList<Vertex> neibs = vList.get(i - 1).getNeibs();

            System.out.print("neibs = ");
            Iterator<Vertex> it = neibs.iterator();

            System.out.print("[");

            while (it.hasNext()) {
                System.out.print(it.next());
                if (it.hasNext()) {
                    System.out.print(", ");
                }
            }

            System.out.print("]");

            System.out.println();

        }
    }

    private int readInteger(String prompt, int min) {

        int val = 0;

        do {
            String ans = JOptionPane.showInputDialog(null, prompt, "");

            try {
                val = Integer.parseInt(ans);
            } catch (NumberFormatException nfe) {
                val = 0;
            }
        } while (val < min);

        return val;

    }

   

    public void DFS(ArrayList vList) {

        System.out.println("Please input the starting vertex: ");

        int index = in.nextInt();
        int count = vList.size();
        visited = new boolean[count];

        DFSx((VertexList) vList.get(index - 1));
        b.deleteCharAt(b.length() - 2);
        System.out.println(b.toString());
        b.delete(0, b.length());
//        for (int i = 0; i < vList.get(v).getNeibs().size(); i++){
//            String neibs = vList.get(i).getNeibs().get(v);
//             int neib = Integer.parseInt(neibs);
//             if(visited[neib] == false)
//                 DFS(neib);

    }

    public void DFSx(VertexList vertexList) {
        b.append(vertexList.getName()).append(", ");
        int vert = Integer.parseInt(vertexList.getName());
        visited[vert - 1] = true;
        for (int i = 0; i < vertexList.getNeibs().size(); i++) {
            int neibVertName = Integer.parseInt(vertexList.getNeibs().get(i).toString());
            if (visited[neibVertName - 1] == false) {
                DFSx(vList.get(neibVertName - 1));
            }

        }

    }
     public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        Graph graph = null;
        System.out.println("Please input whether you would like "
                + "to run from a file or input vertex's manually" + "\n" + "Press 1 for manual and"
                + " 2 for file");
        int choose = input.nextInt();
        if (choose == 1) {
            graph = new Graph();
        } else if (choose == 2) {
           
            graph = new Graph("file");
        }
        
        System.out.println("Please input whether you would like to DFS or BFS the graph: "
                + "1 = BFS"
                + "2 = DFS");
        int searchChoice = input.nextInt();
        if (searchChoice == 1){
            
        }
        if (searchChoice == 2){
            
        }
        
        graph.display();
    }

}

// Make sure that a user enters the number of vertices
// do...while repeates until a successful number entry

