/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spellchecker;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author alexguntermann
 */
public class SpellChecker {

    static String[] dictionary = new String[72875];
    static int count = 0;
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        readDictionary();
        readGetty();

        // TODO code application logic here
    }

    public static void readDictionary() throws FileNotFoundException {

        int i = 0;
        Scanner wordList = new Scanner(new FileReader("words.txt"));
        while (wordList.hasNext()) {
            dictionary[i] = wordList.nextLine();
            i++;
        }

    }

    public static void readGetty() throws FileNotFoundException {
        int index = 0;
        int i = 0;
        Scanner test = new Scanner(new FileReader("gettysburg.txt"));

        while (test.hasNextLine()) {
            String line = test.nextLine();
            String[] split = line.split(" ");
            count++;

            for (int j = 0; j < split.length; j++) {

                String word = "not";
                if (split[j].length() == 1) {
                    if (Character.isLetter(split[j].charAt(0))) {
                        word = split[j];

                    }
                } else if (!Character.isLetter(split[j].charAt(split[j].length() - 1))) {
                    word = split[j].substring(0, split[j].length() - 1);
                    

                } else {
                    word = split[j];
                }

                if (dictionaryChecker(word) == false) {
                    System.out.println(count+": "+line);
                    System.out.println("");
                   
                    
                    for(int b = 0; b < line.indexOf(word)+3; b++){
                        System.out.print(" ");
                    }
                    
                    for(int c = 0; c < word.length(); c++){
                        System.out.print("^");
                        
                    }
                    System.out.println(" ");
                    
                    
                    
                }

            }
        }
        //String[] getty = new String[];
    }

    public static boolean dictionaryChecker(String wordCheck) {
        for (int i = 0; i < dictionary.length; i++) {
            if (dictionary[i].equalsIgnoreCase(wordCheck)) {
                return true;
            }

        }
        return false;
    }
    public static void missSpelled(){
        
        
    }
}
