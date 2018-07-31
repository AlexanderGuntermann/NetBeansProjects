/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraymanipulator;

import java.io.FileReader;
import java.util.*;
import java.io.*;

/**
 *
 * @author alexguntermann
 */
public class TestArrayManip {

    private static final int INSERT = 1, SEARCH = 2, DELETE = 3, PRINT = 4, EXIT = 5;

    static ArrayManipulator myArray;
    static Scanner textA;

    static int searchNum;
    static int deleteNum;
    static int insertNum;
    static int userChoice;

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        displayWelcome();
        displayMenu();
        getArraySize();
        getUserImput();

    }

    private static void displayMenu() {
        System.out.println("Please choose from the menu below which corresponds "
                + "to the action that you would like to be excecuted" + "\n1. Insert"
                + "\n2. Search "
                + " \n3. Delete "
                + " \n4. Print" + "\n"
                + "5. Exit");
        System.out.println("");

    }

    private static void displayWelcome() {
        System.out.println("Welcome to my Awesome Array Manipulator Program");
        System.out.println("");
    }

    private static void getArraySize() {

        System.out.println("Please input size of the array: ");

        myArray = new ArrayManipulator(input.nextInt());

    }

    private static void getUserImput() {

        boolean isValidNumber = false;
        do {
            try {
                System.out.println("Which of the four options would you like to do?");
                userChoice = input.nextInt();

                isValidNumber = true;
            } catch (Exception ex) {
                System.err.println("Not a number. Try again...");
                isValidNumber = false;
                input.nextLine();
            }
        } while (!isValidNumber);

        //  executeOptions();
        switch (userChoice) {
            case PRINT:
                System.out.println("Here is the array displayed");
                myArray.display();
                break;
            case DELETE:
                if (myArray.isEmpty()) {
                    System.out.println("Sorry! It's empty. Theres nothing to delete");

                } else {
                    System.out.print("Please input what you would like to Delete: ");

                    deleteNum = input.nextInt();
                    myArray.delete(deleteNum);
                    myArray.display();
                }
                break;

            case INSERT:
                if (!myArray.isFull()) {
                    System.out.print("Please input what you would like to Insert: ");

                    insertNum = input.nextInt();
                    myArray.insert(insertNum);
                    myArray.display();
                } else {
                    System.out.println("The Array is full and you cannot input any new values");
                }

                break;
            case SEARCH:
                System.out.print("Please input what you would like to Search for: ");

                searchNum = input.nextInt();
                
                myArray.search(searchNum);
                
                System.out.println("The number you searched for exits. Look below to see where");
                
                myArray.display();

                break;
            case EXIT:
                System.out.println("Thank you! Have a nice day!");
                return;

        }
        getUserImput();
    }

// public static void executeOptions() {
//        if (userChoice == PRINT) { // 1 is print
//            myArray.display();
//        } else if (userChoice == DELETE) { // 2 delete
//            System.out.print("Please input what you would like to Delete: ");
//
//            deleteNum = input.nextInt();
//        } else if (userChoice == INSERT) { // 3 is insert
//            if (!myArray.isFull()) {
//                System.out.print("Please input what you would like to Insert: ");
//
//                insertNum = input.nextInt();
//            } else {
//                System.out.println("The Array is full and you cannot input any new values");
//            }
//
//        } else if (userChoice == SEARCH) { // 4 is search
//            System.out.print("Please input what you would like to Search for: ");
//
//            searchNum = input.nextInt();
//        }
//  }
}
