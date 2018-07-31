/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman;

import static hangman.HangMan.words;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alexguntermann
 */
public class PlayGame {

    char[] charUsed = new char[26];

    public void PlayGame() throws IOException {

    }

    public void play() throws FileNotFoundException {
        for (int i = 0; i < 26; i++) {
            charUsed[i] = ' ';
        }
        Scanner input = new Scanner(System.in);

        Scanner wordList = new Scanner(new FileReader("DicAll.txt")); // scanner is reading from DiCAll.txt

        System.out.print("Input a number to select a word length: "); // nextInt is the length of the word that is pulled
        int wordLength = input.nextInt();

        for (int i = 0; wordList.hasNext(); i++) {
            words[i] = wordList.next();
        }
        System.out.print("Input a number to select your number of guesses: ");

        int guessAmount = input.nextInt();

        String goal = getWords(wordLength).toLowerCase();

        char[] blankWord = new char[goal.length()];

        for (int i = 0; i < goal.length(); i++) {
            blankWord[i] = '_';

        }
        // System.out.println("Your word is: " + goal); //cheat
        for (int i = 0; i < blankWord.length; i++) {

            System.out.print(blankWord[i] + " ");
        }
        System.out.println("");

        int guessCount = 0;
        while (guessAmount != guessCount) {
            System.out.println("Guess # " + (guessCount + 1));
            System.out.print("Guesses so far are: ");
            for (int i = 0; i < charUsed.length; i++) {

                System.out.print(charUsed[i] + " ");
            }
            System.out.println("");
            System.out.println("Guess a letter: ");
            char guess1 = input.next().toLowerCase().charAt(0);

            if (arrayContainsGuess(guess1)) {
                continue;
            } else {
                charUsed[guessCount] = guess1;
            }

            for (int i = 0; i < goal.length(); i++) {

                if (guess1 == goal.charAt(i)) {
                    blankWord[i] = guess1;
                }

            }
            guessCount++;

            for (int i = 0; i < blankWord.length; i++) {

                System.out.print(blankWord[i] + " ");
            }
            System.out.println("");

            if (checkWin(blankWord) == true) {
                System.out.println("You won in: " + guessCount + " guesses");
                guessCount = guessAmount;
            }

        }
        if (checkWin(blankWord) == true) {
        } else {
            System.out.println("You have used all of your guesses. You lose. The right word was:  " + goal
                    + ". Thanks for playing");
        }
    }

    public static boolean checkWin(char[] array) {
        boolean guessed = true;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == '_') {
                guessed = false;
                break;
            }
        }
        return guessed;
    }

    public static String getWords(int wordLength) {
        int count = 0;
        Random rand = new Random();

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() == wordLength) {
                count++;

            }

        }
        int counter2 = 0;
        String[] correctLenth = new String[count];
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() == wordLength) {
                correctLenth[counter2] = words[i];
                counter2++;

            }
        }
        int randomPos = rand.nextInt(correctLenth.length);

        return correctLenth[randomPos];

    }

    public boolean arrayContainsGuess(char guess) {
        boolean contain = false;
        for (int i = 0; i < charUsed.length; i++) {
            if (charUsed[i] == guess) {
                System.out.println("You already guess this letter. Try another");
                contain = true;
                break;
            }
        }
        return contain;
    }
}
