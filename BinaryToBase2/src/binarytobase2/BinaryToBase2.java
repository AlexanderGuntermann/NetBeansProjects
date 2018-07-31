/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarytobase2;

import java.time.DayOfWeek;
import java.time.temporal.TemporalAdjusters;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author alexguntermann
 */
public class BinaryToBase2 {

    static boolean test = false;
    static int[] binNum = new int[8];
    static int numero;
    static int convertD = 0;
    static String convertB;
    static char userinput;

    // int num = 0;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("Welcome to the binary number system converter!" + "\n");

        do {

            menuOptions();
        } while (userinput != 'e');

        System.out.println("Now exiting. See ya!");
    }

    public static void menuOptions() {

        System.out.println("Would you like to convert a decimal or would you like to convert a binary number?"
                + "\n" + "\n"
                + "Please enter: \n'd' or 'd' to convert a decimal to binary\n'b' or 'B' to convert a binary string to a decimal\n"
                + "'e' or 'E' to exit the program:");

        Scanner input = new Scanner(System.in);

        char userinput = input.next().toLowerCase().charAt(0);

        if (userinput == 'b') {

            getDecimal();
            decimalToBinary(convertD);

        } else if (userinput == 'd') {

            getBinary();
            binaryToDecimal(convertB);

        } else if (userinput == 'e') {
            System.out.println("Thanks for being nerdy!");
            System.exit(0);
        }

        {

        }
    }

//        System.out.println(decimalToBinary(121));
//        //int[] b= {0,0,0,0,1,0,1,0};
//        System.out.println(binaryToDecimal("00001010"));
    public static void decimalToBinary(int num) {

        for (int i = 0; i < binNum.length; i++) {
            binNum[i] = 0;
        }

        for (int i = binNum.length - 1; i >= 0; i--) {

            binNum[i] = num % 2;
            num = num / 2;

        }

        System.out.println(Arrays.toString(binNum));
        System.out.println("");

    }

    public static void binaryToDecimal(String bin) {

        //double result = 0;
        for (int i = binNum.length - 1; i >= 0; i--) {

            binNum[i] = (int) bin.charAt(i);
        }

        //System.out.println(Arrays.toString(binNum));
        if (bin.length() < 8) {
            for (int i = 0; i < 8 - bin.length(); i++) {
                binNum[i] = 0;
            }

        }

        for (int i = 0; i < binNum.length; i++) {
            binNum[i] = Character.getNumericValue(bin.charAt(i));

        }

        double result = 0;

        System.out.println(Arrays.toString(binNum));
        for (int i = 0; i < binNum.length; i++) {

            result = result + (Math.pow(2, 8 - (i + 1)) * (binNum[i]));   // could use i - 7 if using the length

        }

//        for (int i = binNum.length - 1; i >= 0; i--) {
//            if (binNum[i] != 0 && binNum[i] != 1) {
//                System.out.println("Please input a valid binary number");
//                break;
//
//            } else {
//                result = result + (Math.pow(2, 7 - i) * (binNum[i]));
        System.out.println((int) result);
    }

    public static int getDecimal() {

        Scanner input1 = new Scanner(System.in);
        boolean check = false;

        do {

            System.out.println("Please input a decimal you would like to convert");


            boolean isValidNumber = false;
            do {
                try {
                    convertD = input1.nextInt();

                    isValidNumber = true;

                } catch (Exception ex) {
                    System.err.println("Not a number. Try again...");
                    isValidNumber = false;
                    input1.nextLine();
                }
            } while (!isValidNumber);

            if (convertD > 0 && convertD <= 255) {
                check = true;
            } else {
                check = false;
            }

        } while (!check);
        return convertD;

    }

    public static String getBinary() {

        Scanner input2 = new Scanner(System.in);

        boolean keepGoing = false;
        System.out.println("Enter your binary string");
        do {
            //System.out.println("Please input a string of 8 characters");
            convertB = input2.next();

            if (convertB.length() != 8) {
                keepGoing = true;
                System.out.println("Please enter a valid string of 8 characters");
            } else {
                for (int i = 0; i < convertB.length(); i++) {
                    if (convertB.charAt(i) == '0' || convertB.charAt(i) == '1') {
                        keepGoing = false;
                    } else {
                        keepGoing = true;
                    }

                }
                if (keepGoing == true) {
                    System.out.println("Please enter a valid string of only 0's and 1");
                }

            }

        } while (keepGoing);
        return convertB;

    }
}
