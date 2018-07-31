/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rockpapersscissors;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alexguntermann
 */
public class RockPapersScissors {

    static final int ROCK = 0;
    static final int PAPER = 1;
    static final int SCISSORS = 2;

    static Scanner input = new Scanner(System.in);
    static int user1;
    static Random rand = new Random();

    public static void main(String[] args) {

        System.out.print("Welcome to a Game of Rock-Paper-Scissors\n\n");

        System.out.println("The winner is chosen based on the best of 5\n");

        letsPlay(input, user1);

    }

    public static void letsPlay(Scanner input, int user1) {
        int count = 0;
        double numP1wins = 0;
        double numP2wins = 0;
        double numTies = 0;
        double playAgain;

        System.out.print("Choose a move (0-2): ");
        System.out.print(
                "\n(0)  Rock\n"
                + "(1)  Paper\n"
                + "(2)  Scissors\n\n");

        for (int i = 0; i < 5; i++) {

            int guess1 = input.nextInt();
            count++;
            user1 = rand.nextInt(3);
            input = new Scanner(System.in);

            if (guess1 == ROCK && user1 == SCISSORS) {     //rock vs scissors = win
                System.out.println("You chose: " + guess1);
                System.out.println("The computer chose: " + user1);
                System.out.println("Rock beats Scissors");
                System.out.println("You win");
                numP1wins++;

            } else if (guess1 == SCISSORS && user1 == ROCK) { // scissors vs rock = lose
                System.out.println("You chose: " + guess1);
                System.out.println("The computer chose: " + user1);
                System.out.println("Rock beats Scissors");
                System.out.println("You lose");
                numP2wins++;

            } else if (guess1 == PAPER && user1 == ROCK) { //paper vs rock = win
                System.out.println("You chose: " + guess1);
                System.out.println("The computer chose: " + user1);
                System.out.println("Paper beats rock");
                System.out.println("You win.");
                numP1wins++;
            } else if (guess1 == ROCK && user1 == PAPER) { // rock vs paper = lose
                System.out.println("You chose: " + guess1);
                System.out.println("The computer chose: " + user1);
                System.out.println("Paper beats rock");
                System.out.println("You lose.");
                numP2wins++;
            } else if (guess1 == SCISSORS && user1 == PAPER) { //scisorrs vs paper = win
                System.out.println("You chose: " + guess1);
                System.out.println("The computer chose: " + user1);
                System.out.println("Scissors beats Paper");
                System.out.println("You win.");
                numP1wins++;
            } else if (guess1 == PAPER && user1 == SCISSORS) { // paper vs scissors = lose
                System.out.println("You chose: " + guess1);
                System.out.println("The computer chose: " + user1);
                System.out.println("Scissors beats Paper");
                System.out.println("You lose.");
                numP2wins++;
            } else if (guess1 == PAPER && user1 == PAPER) { // paper vs paper = tie
                System.out.println("You chose: " + guess1);
                System.out.println("The computer chose: " + user1);
                System.out.println("It's a tie");
                numTies++;

            } else if (guess1 == ROCK && user1 == ROCK) { //rock vs rock = tie
                System.out.println("You chose: " + guess1);
                System.out.println("The computer chose: " + user1);
                System.out.println("It's a tie");
                numTies++;
            } else if (guess1 == SCISSORS && user1 == SCISSORS) { // scissors vs scissors = tie
                System.out.println("You chose: " + guess1);
                System.out.println("The computer chose: " + user1);
                System.out.println("It's a tie");
                numTies++;

            }
            if (numP1wins == 3) { //if wins are 3, you win
                System.out.println("\n" + "You win");
                System.out.println("WINS: " + numP1wins + "" + "   LOSSES: " + numP2wins + " TIES:  " + numTies +  " GAMES PLAYED: " + count
                        + " PERCENTAGE WON: "
                        + numP1wins / 5 * 100 + "%" + "\n");
                break;
            } else if (numP2wins == 3) { // if computer wins 3 times, you lose
                System.out.println("\n" + "The computer wins, you lose");
                System.out.println("WINS: " + numP1wins + "" + "   LOSSES: " + numP2wins + " TIES:  " + numTies +  " GAMES PLAYED: " + count
                        + " PERCENTAGE WON: "
                        + numP1wins / 5 * 100 + "%" + "\n");
                break;
            } else if (numP1wins == 2 && numP2wins == 2 && numTies == 1) {
                System.out.println("Its a tie! You both lose!");
               System.out.println("WINS: " + numP1wins + "" + "   LOSSES: " + numP2wins + " TIES:  " + numTies +  " GAMES PLAYED: " + count
                        + " PERCENTAGE WON: "
                        + numP1wins / 5 * 100 + "%" + "\n");
                break;
            } else if (numTies == 3) {
                System.out.println("Tie game, no one wins");
                System.out.println("WINS: " + numP1wins + "" + "   LOSSES: " + numP2wins + " TIES:  " + numTies +  " GAMES PLAYED: " + count
                        + " PERCENTAGE WON: "
                        + numP1wins / 5 * 100 + "%" + "\n");
                break;
            } else if (numTies == 2 && numP2wins == 2) {
                System.out.println("The computer wins, you lose.");
               System.out.println("WINS: " + numP1wins + "" + "   LOSSES: " + numP2wins + " TIES:  " + numTies +  " GAMES PLAYED: " + count
                        + " PERCENTAGE WON: "
                        + numP1wins / 5 * 100 + "%" + "\n");
                break;
            } else if (numP1wins == 2 && numP2wins == 1 && numTies == 2) {
                System.out.println("You win");
                System.out.println("WINS: " + numP1wins + "" + "   LOSSES: " + numP2wins + " TIES:  " + numTies +  "GAMES PLAYED: " + count
                        + " PERCENTAGE WON: "
                        + numP1wins / 5 * 100 + "%" + "\n");
                break;

            }
        }

        System.out.println("\nDo you want to play again?\n" + "(1)  Yes" + "  (2)  No");
        playAgain = input.nextInt();

        if (playAgain == 1) {
            letsPlay(input, user1);
        } else if (playAgain == 0) {
            System.out.println("Thanks for playing!\n");
            System.out.println("Game Statistics\n");
//                    System.out.println("WINS: " + numP1wins + "   LOSSES: " + numP2wins + "GAMES PLAYED: 5"
//                            + "PERCENTAGE WON: "
//                            + numP1wins / numP2wins * 100 + "%");

            System.exit(0);
        }

    }
}
