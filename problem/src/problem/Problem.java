/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem;

/**
 *
 * @author alexguntermann
 */
public class Problem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    public static boolean hasBad(String str) {
        int length = str.length();
        if (length == 0 || length == 1 || length == 2) {
            return false;
        } else if ((length==3 && str.substring(0, 3).equals("bad")) || length==4 && str.substring(1, 4).equals("bad")){
            return true;
            
        }else return false;
       

    }

}
