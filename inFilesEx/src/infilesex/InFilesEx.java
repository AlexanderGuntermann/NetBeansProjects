/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infilesex;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author alexguntermann
 */
public class InFilesEx {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        try{
            Scanner inFile = new Scanner(new FileReader("input.txt"));
            int num = inFile.nextInt();
            
        } catch (FileNotFoundException fnfe){
            System.err.println("File does not exist");
          
        }
    }
    
}
