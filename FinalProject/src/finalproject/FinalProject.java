/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

/**
 *
 * @author alexguntermann
 */
public class FinalProject<T> {

    private T xcoordinate;
    private T ycoordinate;

    public FinalProject() {

        this.xcoordinate = null;
        this.ycoordinate = null;
    }

    public FinalProject(T xcoordinate, T ycoordinate) {
        this.xcoordinate = xcoordinate;
        this.ycoordinate = ycoordinate;
    }

    public T getXcoordinate() {
        return xcoordinate;
    }

    public T getYcoordinate() {
        return ycoordinate;
    }

    public void setXcoordinate(T xcoordinate) {
        this.xcoordinate = xcoordinate;
    }

    public void setYcoordinate(T ycoordinate) {
        this.ycoordinate = ycoordinate;
    }

    public String toString() {
        return "X coordinate of Point: " + this.xcoordinate + "\n" + "Y coordinate of Point: " + this.ycoordinate + "\n" + "Point: "
                + "[" + this.xcoordinate + " , " + this.ycoordinate + "]";
    }

}
