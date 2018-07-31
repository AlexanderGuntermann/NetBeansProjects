
/**************************************************
 * Title:   Print a menu to add, subtract,        *
 *          multiply, and divide.              *
 *                                           *
 * Author:  Mannix Lopez                      *
 * Date:    February 11, 2018
 * Homework 2: Void and Value-returning methods
 **************************************************/

import java.util.Scanner;
public class Menu {

    public static void main(String[] args) {
        displayMenu();
        Add(2,10);
        calculateSum();     // I removed double from here because you just want to call the method.




    }

    public static void displayMenu() {
        System.out.println("1:Add 2 numbers \n2:Subtract 2 numbers \n3:Multiply 2 numbers \n4:Divide 2 numbers");

        // here you want to take input from the user and based on what they input, choose which method to call (test your
        // methods in the main, but you can also call one method from another method)
    }

    public static void Add(float number1, float number2) {
        float sum = number1 + number2;

        System.out.println("Sum of " + number1 + " and " + number2 + " is " + sum);
    }
        public static void calculateSum() {                      // you want the return type to be double

            Scanner input = new Scanner(System.in);
            System.out.print("Number1:");
            double number1 = input.nextDouble();
            System.out.print("Number2:");
            double number2 = input.nextDouble();
            double result = number1 + number2;

            System.out.println("The sum of the two numbers is" + result);
        }

    }

