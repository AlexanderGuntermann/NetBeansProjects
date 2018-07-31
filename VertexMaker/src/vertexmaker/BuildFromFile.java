/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vertexmaker;

import java.io.*;
import java.util.*;

/**
 *
 * @author alexguntermann
 */
public class BuildFromFile {

    public BuildFromFile() throws FileNotFoundException{ 
        Scanner inFile = new Scanner(new FileReader("graphfile.txt"));

        int vCount = 0;
        String trash = inFile.nextLine();
        vCount = readInt(1);
        
        ArrayList<VertexList> vList = new ArrayList<VertexList>(vCount);
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
        int count = 0;
        for (i = 1; i < vCount+1; i++) {
            ArrayList<Vertex> neibs = vList.get(i - 1).getNeibs();

            System.out.print("vertex:" + count + " neigbs = ");
            Iterator<Vertex> it = neibs.iterator();

            System.out.print("[");

            while (it.hasNext()) {
                System.out.print(it.next());
                if (it.hasNext()) {
                    System.out.print(", ");
                count++;
                }
            }
            System.out.print("]");

            System.out.println("");

        }

    }

    private static int readInt(int min) throws FileNotFoundException {
        int val = 0;

        do {
            Scanner input = new Scanner(new FileReader("graphfile.txt"));
            String ans = input.nextLine();
            try {
                val = Integer.parseInt(ans);
                input.close();
                
            } catch (NumberFormatException nfe) {
                val = 0;
            }
        } while (val < min);

        return val;

    }
}
