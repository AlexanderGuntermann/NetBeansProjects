/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vertexmaker;

import java.util.*;

public class VertexList {

    private String name;
    private ArrayList<Vertex> neibs;

    public VertexList(String name) {
        this.name = new String(name);
    }

    public String toString() {
        return name + " " + neibs;
    }

    public ArrayList<Vertex> getNeibs() {
        return neibs;

    }

    public void setNeibs(ArrayList<Vertex> neibs) {
        this.neibs = neibs;
    }
    public String getName(){
        return name;
    }

}
