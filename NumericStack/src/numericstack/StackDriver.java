/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numericstack;

import java.util.Scanner;

/**
 *
 * @author alexguntermann
 */
public class StackDriver {

    private static final int PUSH = 1, POP = 2, PEEK = 3, PRINT = 4, EXIT = 5; //push, pop, peek, print, exit 

    static int stackSize;

    static int userChoice;
    static NumericStack numStack;

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        displayWelcome();
        getStackSize();

        displayMenu();
        getUserInput();

    }

    private static void displayMenu() {
        System.out.println("Please choose from the menu below which corresponds "
                + "to the action that you would like to be excecuted" + "\n1. Push"
                + "\n2. Pop "
                + " \n3. Peek "
                + " \n4. Print" + "\n"
                + "5. Exit");
        System.out.println("");

    }

    private static void displayWelcome() {
        System.out.println("Welcome to my Numerical Stack Manipulator Program");
        System.out.println("");
    }

    public static void getStackSize() {
        System.out.println("Please input the size of the Stack you would like to create: ");

        stackSize = input.nextInt();
        numStack = new NumericStack(stackSize);

    }

    public static void getUserInput() {

        boolean isValidNumber = false;
        do {
            try {
                System.out.println("Which of the four options would you like to do?");
                userChoice = input.nextInt();

                isValidNumber = true;
            } catch (Exception ex) {
                System.err.println("Not a valid number. Please input a value from 1-5 "
                        + "Try again...");
                isValidNumber = false;
                input.nextLine();
            }
        } while (!isValidNumber);

        //  executeOptions();
        switch (userChoice) {
            // Option 1
            case PUSH:
//                boolean check = false;
//                do {
//                    try {
                    if(!numStack.isFull()){
                        System.out.println("Please input the element you would like to PUSH");

                        int pushInt = input.nextInt();
                        numStack.push(pushInt);
        } else {
            System.out.println("The stack is full. You can't push anything!");
                    }
//                        check = true;

//                    } catch (ArithmeticException ex) {
//                        System.err.println(ex.getLocalizedMessage());
//                        System.err.println("Not a valid input. Try again...");
//                        check = false;
//                        String dummy = input.nextLine();
//
//                    }
//                } while (!check);

                break;
            //Option 2
            case POP:
                
                if(numStack.isEmpty()){
                System.out.println("The stack is empty!");
        } else  {
                
                System.out.println("Here is what popped");
                System.out.println(numStack.pop());
                }
                
                break;

            //Option 3
            case PEEK:

                if (!numStack.isEmpty()) {
                
                    System.out.println("Here is what you're peeking at: ");

                    System.out.println(numStack.peek());
                }
                else 
                    System.out.println("The stack is empty!");
                    break;
                
            //Option 4
            case PRINT:

                System.out.println("Here is the Integer Stack Printed Out");

                System.out.println(numStack.toString());

                break;

            case EXIT:
                System.out.println("Thank you! Have a nice day!");
                return;
            default:
                System.out.println("That is not a valid option type. Please choose a number"
                        + "1-5");
                break;

        }

        getUserInput();
    }

}
