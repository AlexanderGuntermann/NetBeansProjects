/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GuessingGame;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alexguntermann
 */
public class GuessingGame {

    private static int counter = 1;

    /**
     * @param args the command line arguments
     */
    static Scanner input = new Scanner(System.in);
    static int number1;
    static Random rand = new Random();

    public static void main(String[] args) {
        System.out.print("Welcome to the guessing game.\n\n"
                + "I will choose a number between 1 and 100 ... and you try to guess it.\n\n"
                + "With each guess, I will tell you whether you are high or low.\n"
                + "The objective is to find the number using as few guesses as possible.\n"
                + "You have only six guesses. \n\n" + "Let's start!");
        System.out.println("I am thinking of a number between 1 and 100.");

        input = new Scanner(System.in);

        number1 = rand.nextInt(101);
        playGame(input, number1);

    }

    public static void playGame(Scanner input, int number1) {
        
        System.out.print("Enter guess (or 0 to quit): ");
        int guess1 = input.nextInt();

        if (counter == 6) {
            System.out.println("You didn't guess the number and the number was: " + number1);
            counter =1;
            ask();
        }
        if (guess1 == number1) {
            System.out.println("***Correct! You got it in " + counter + " Guesses(s)");
            counter = 1;
            ask();
        }
        if (guess1 == 0) {
            System.exit(0);
        } else if (guess1 > number1) {
            counter++;
            System.out.println("That's too high");
            playGame(input, number1);
        } else if (guess1 < number1) {
            counter++;
            System.out.println("That's too low");
            playGame(input, number1);

        }
    }

//        if (counter > 0) {
//            counter--;
//            playGame(input, number1);
//        } else if (counter == 0) {
//            System.out.println("You lose!");
//        }


public static void ask() {
        System.out.println("Do you want to play again? if so, type Yes, if not, type No");
        String askUser = input.next();
        if (askUser.equalsIgnoreCase("yes")) {
            number1 = rand.nextInt(101);
            playGame(input, number1);
        } else if (askUser.equalsIgnoreCase("no")) {
            System.out.println("Thanks for playing!");
            System.exit(0);
        }
    }

}
