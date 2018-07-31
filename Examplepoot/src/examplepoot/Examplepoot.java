/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examplepoot;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JFileChooser;

/**
 *
 * @author alexguntermann
 */
public class Examplepoot {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        problemSeven();
    }
    
    public static void problemSeven() throws IOException {

        JFileChooser chooser = new JFileChooser();
        int result = chooser.showOpenDialog(null);

        File file = chooser.getSelectedFile();
        FileReader reader = new FileReader(file);

        Scanner sc = new Scanner(reader);

        int sum = 0;
        while (sc.hasNextInt()) {
            sum += sc.nextInt();
        }
        System.out.println(sum);
}
}