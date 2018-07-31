/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraymanipulator;

import static arraymanipulator.TestArrayManip.myArray;
import java.io.*;
import java.util.Scanner;
import java.io.FileReader;
import java.io.FileWriter;

/**
 *
 * @author alexguntermann
 */
public class ArrayManipulatorText {

    static ArrayManipulator myArray;

    private static final int INSERT = 1, SEARCH = 2, DELETE = 3, PRINT = 4, EXIT = 5;

    static Scanner textA;

    static int searchNum;
    static int deleteNum;
    static int insertNum;
    static int userChoice;

    public static void main(String[] args) {

        Scanner input;
        myArray = new ArrayManipulator(100);

        try {

            input = new Scanner(new FileReader("array.txt"));
            ;

            while (input.hasNextInt()) {

                int command = input.nextInt();
                int insertedvalue = input.nextInt();
                System.out.println("***");
               // System.out.println(command + " " + insertedvalue);

                switch (command) {
                    case PRINT:
                        myArray.display();
                        break;
                    case DELETE:
                        if (myArray.isEmpty()) {
                            System.out.println("Sorry! It's empty. Theres nothing to delete");

                        } else {
                            

                            deleteNum = insertedvalue;
                            boolean found = myArray.delete(deleteNum);
                            if(found == true){
                                System.out.println("You deleted: " + insertedvalue);
                            }
                            if(found == false){
                                System.out.println("The value of: "+insertedvalue+" could not be deleted.");
                            }
                                
                            myArray.display();
                        }
                        break;

                    case INSERT:
                        if (!myArray.isFull()) {

                            insertNum = insertedvalue;
                            myArray.insert(insertNum);
                            myArray.display();
                        } else {
                            System.out.println("The Array is full and you cannot input any new values");
                        }

                        break;
                    case SEARCH:

                        searchNum = insertedvalue;
                        int found = myArray.search(searchNum);
                        if(found != -1){
                            System.out.println("You searched for a number. It was: "+insertedvalue);
                        }
                        // if -1 print the element
                        
                        if(found == -1){
                            System.out.println("That element was: "+insertedvalue);
                        }
                        myArray.display();

                        break;
                    case EXIT:
                        System.out.println("Thank you! Have a nice day!");
                        return;
                }
//                if(firstcommand == 1){
//                    myFile.insert(insertedvalue);
//                    myFile.display();
//                    
//                } else 
//                    return;
                }
                input.close();

            }catch (IOException e) {
            System.err.println("The file could not be found");
        }
    }
    
//        private static void getArraySize() {
//
//        System.out.println("Please input size of the array: ");
//
//        myArray = new ArrayManipulator(command);
//
//        }

    }
