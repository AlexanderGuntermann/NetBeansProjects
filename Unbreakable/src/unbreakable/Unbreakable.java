/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unbreakable;

import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alexguntermann
 */
public class Unbreakable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {

        FileWriter writer = null;
        try {
            writer = new FileWriter("output.txt");
        } catch (IOException ex) {
            Logger.getLogger(Unbreakable.class.getName()).log(Level.SEVERE, null, ex);
        }
        PrintWriter print = new PrintWriter(writer);

        Scanner reader = new Scanner(new FileReader("nums.txt"));

        String words = null;

        while (reader.hasNextLine()) {
            
            words = reader.nextLine();
            
            print.println(words);


        }
        

        print.close();

        //   print.close()/
    }
}
