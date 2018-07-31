/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vertexmaker;

import java.util.*;
import javax.swing.*;

public class VertexMaker {

    public VertexMaker(){

// Make sure that a user enters the number of vertices
// do...while repeates until a successful number entry
        int vCount = 0;

        vCount = readInteger("Number of Vertices", 1);

        ArrayList<VertexList> vList = new ArrayList<VertexList>(vCount);

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

        for (i = 1; i < vCount + 1; i++) {
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

// This method reads an integer from a dialog, 
// not allowing bad input, < min or a String
    private static int readInteger(String prompt, int min) {

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

}
