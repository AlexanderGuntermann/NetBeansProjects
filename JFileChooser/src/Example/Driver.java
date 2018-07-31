/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Example;

import java.io.*;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import java.util.Scanner;

/**
 *
 * @author alexguntermann
 */
public class Driver {

// public static void main(String[] args) {
//        File file = null;
//       JFileChooser chooser = new JFileChooser();
//       int result = chooser.showOpenDialog(null);
//       if (result == JFileChooser.APPROVE_OPTION)
//         file = chooser.getSelectedFile();
//       else
//       {
//           JOptionPane.showMessageDialog(null, "No file selected");
//           System.exit(1);
//       }   
//    
//}
// }
    public static void main(String[] args) throws IOException {
//        problemOne();
//        problemTwo();
//        problemThree();
        problemFour();
        //problemFive();
        //problemSix();
        //problemSeven();
    } 
    public static void problemOne() throws IOException {
        // Use file dialog to select file.
        JFileChooser chooser = new JFileChooser();
        int result = chooser.showOpenDialog(null);
        // This assumes user pressed Open
        // Get the file from the file 
        File file = chooser.getSelectedFile();
        // Open the file
        FileReader reader = new FileReader(file);

        // Use read, which returns an int
        int i = reader.read();
        String upper = " ";
        while (i != -1) {
            // Convert to char and print

            char ch = (char) (i);
            upper = upper + ch;

            // Get next  from read()
            i = reader.read();
        }
        System.out.println(upper.toUpperCase());
        reader.close();
    }

    public static void problemTwo() throws IOException {

        // Use file dialog to select file.
        JFileChooser chooser = new JFileChooser();
        int result = chooser.showOpenDialog(null);
        // This assumes user pressed Open
        // Get the file from the file 
        File file = chooser.getSelectedFile();
        // Open the file
        FileReader reader = new FileReader(file);

        // Use read, which returns an int
        int i = reader.read();
        String upper = " ";
        while (i != -1) {
            // Convert to char and print

            char ch = (char) (i);
            upper = upper + ch;

            // Get next  from read()
            i = reader.read();
        }
        System.out.println(upper.length());
        reader.close();

    }

    public static void problemThree() throws IOException {
        // Use file dialog to select file.
        JFileChooser chooser = new JFileChooser();
        int result = chooser.showOpenDialog(null);
        // This assumes user pressed Open
        // Get the file from the file 
        File file = chooser.getSelectedFile();
        // Open the file
        FileReader reader = new FileReader(file);

        Scanner sc = new Scanner(file);

        while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());

            System.out.println("");
            System.out.println("");

        }
          reader.close();
    }

    public static void problemFour() throws IOException {

        JFileChooser chooser = new JFileChooser();
        int result = chooser.showOpenDialog(null);
        int counter = 0;

        File file = chooser.getSelectedFile();

        FileReader reader = new FileReader(file);

        Scanner sc = new Scanner(file);
        while (sc.hasNextLine()) {
            counter++;
            
            
        }
        System.out.println(counter);
          reader.close();
    }
    public static void problemFive() throws IOException {
        
        
        JFileChooser chooser = new JFileChooser();
        int result = chooser.showOpenDialog(null);
        
        File file = chooser.getSelectedFile();
        
        int wordCounter = 0;
        int lineCounter = 0;
        FileReader reader = new FileReader(file);
        
        Scanner sc = new Scanner(file);
        
        while (sc.hasNext()){
            wordCounter++;
            
        }
        while (sc.hasNextLine()) {
            while (sc.hasNext()) {
                lineCounter++;
            }
                
        }
        System.out.println(wordCounter + lineCounter);
         reader.close();
    }
    public static void problemSix() throws IOException {
        
        JFileChooser chooser = new JFileChooser();
        int result = chooser.showOpenDialog(null);
        
        File file = chooser.getSelectedFile();
        
        int counter = 0;
        
        FileReader reader = new FileReader(file);
        
        Scanner sc = new Scanner(file);
        
        while (sc.hasNext()){
            counter ++;
        }
        System.out.println(counter);
         reader.close();      
    }

    public static void problemSeven() throws IOException {

        JFileChooser chooser = new JFileChooser();
        int result = chooser.showOpenDialog(null);

        File file = chooser.getSelectedFile();
        FileReader reader = new FileReader(file);

        Scanner sc = new Scanner(file);

        int sum = 0;
        while (sc.hasNextInt()) {
           sum += sc.nextInt();
       }
        System.out.println(sum);
//try {
//            JFileChooser chooser = new JFileChooser(".\\");
//            int result = chooser.showOpenDialog(null);
//            if(result == JFileChooser.APPROVE_OPTION){
//                File f = chooser.getSelectedFile();
//                FileReader reader = new FileReader(f);
//                Scanner in = new Scanner(reader);
//                int sum=0;
//                while(in.hasNextInt()){
//                    sum+= in.nextInt();
//                }
//                System.out.println("sum: " + sum);
//            }
//        }catch(FileNotFoundException e){
//            System.err.println("File not found. please try again.");
//        }
    }
}
