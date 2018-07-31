/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackmanipulator;

import java.util.Scanner;

/**
 *
 * @author alexguntermann
 */
public class TestStackManip {

    private static final int PUSH = 1, POP = 2, PEEK = 3, PRINT = 4, EXIT = 5; //push, pop, peek, print, exit 

    static StackManipulator<String> myStringStack;
    static StackManipulator<Integer> myIntStack;
    static StackManipulator<Character> myCharStack;

    static int stackSize;
    static String stackType;

    static int userChoice;

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        displayWelcome();
        getStackSize();
        getStackSizeAndType();
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
        System.out.println("Welcome to My Radical Stack Manipulator Program");
        System.out.println("");
    }

    public static void getStackSizeAndType() {

        System.out.println("Please input the type of Stack you would like to create" + "\n" + "Str = String, "
                + "Int = Integer, Char = Character");

        stackType = input.next();

        if (stackType.equalsIgnoreCase("str")) {

            myStringStack = new StackManipulator<>(stackSize);

        } else if (stackType.equalsIgnoreCase("int")) {

            myIntStack = new StackManipulator<>(stackSize);

        } else if (stackType.equalsIgnoreCase("char")) {

            myCharStack = new StackManipulator<>(stackSize);

        } else {
            getStackSizeAndType();
        }

    }

    public static void getStackSize() {
        System.out.println("Please input the size of the Stack you would like to create: ");

        stackSize = input.nextInt();
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
                boolean check = false;
                do {
                    try {

                        System.out.println("Please input the element you would like to PUSH");
                        if (stackType.equalsIgnoreCase("Str")) {

                            String pushString = input.next();

                            myStringStack.push(pushString);
                            check = true;

                        } else if (stackType.equalsIgnoreCase("Int")) {

                            int pushInt = input.nextInt();
                            myIntStack.push(pushInt);
                            check = true;

                        } else if (stackType.equalsIgnoreCase("Char")) {
                            String pushChar = input.next();
                            System.out.println(pushChar);
                            if (pushChar.length() >= 2) {
                                System.out.println("Please input a character of length 1");
                                check = false;
                            } else {
                                myCharStack.push(pushChar.charAt(0));
                                check = true;
                            }
                        }
                    } catch (ArithmeticException ex) {
                        System.err.println(ex.getLocalizedMessage());
                        System.err.println("Not a valid input. Try again...");
                        check = false;
                        String dummy = input.nextLine();

                    }
                } while (!check);

                break;
            //Option 2
            case POP:

                System.out.println("The stack type is: " + stackType);

                if (stackType.equals("str") && myStringStack.isEmpty()) {
                    System.out.println("Sorry! It's empty. Theres nothing to Pop");

                } else if (stackType.equalsIgnoreCase("str")) {

                    System.out.println("Here is what popped: ");

                    System.out.println(myStringStack.pop());

                }
                if (stackType.equalsIgnoreCase("int") && myIntStack.isEmpty()) {
                    System.out.println("Sorry! It's empty. Theres nothing to Pop");
                } else if (stackType.equalsIgnoreCase("int")) {
                    System.out.println("Here is what popped: ");

                    System.out.println(myIntStack.pop());
                }

                if (stackType.equalsIgnoreCase("char") && myCharStack.isEmpty()) {

                    System.out.println("Sorry! It's empty. Theres nothing to Pop");

                } else if (stackType.equalsIgnoreCase("char")) {
                    System.out.println("Here is what is popped: ");
                    System.out.println(myCharStack.pop());

                }
                break;

            //Option 3
            case PEEK:
                if (stackType.equals("str") && myStringStack.isEmpty()) {
                    System.out.println("Sorry! It's empty. Theres nothing to Peek at");

                } else if (stackType.equalsIgnoreCase("str")) {
                    System.out.println("Here is what you're peeking at: ");
                    System.out.println(myStringStack.peek());

                }
                if (stackType.equalsIgnoreCase("int") && myIntStack.isEmpty()) {
                    System.out.println("Sorry! It's empty. Theres nothing to Peek at");
                } else if (stackType.equalsIgnoreCase("int")) {
                    System.out.println("Here is what you're peeking at: ");

                    System.out.println(myIntStack.peek());
                }

                if (stackType.equalsIgnoreCase("char") && myCharStack.isEmpty()) {

                    System.out.println("Sorry! It's empty. Theres nothing to Peek at");

                } else if (stackType.equalsIgnoreCase("char")) {
                    System.out.println("Here is what you're peeking at: ");

                    System.out.println(myCharStack.peek());

                }

                break;
            //Option 4
            case PRINT:

                if (stackType.equalsIgnoreCase("Str")) {
                    System.out.println("Here is the String Stack Printed Out");
                    myStringStack.print();

                } else if (stackType.equalsIgnoreCase("Int")) {

                    System.out.println("Here is the Integer Stack Printed Out");

                    myIntStack.print();

                } else if (stackType.equalsIgnoreCase("Char")) {

                    System.out.println("Here is the Character Stack Printed Out");
                    myCharStack.print();

                }

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
