package hangman;

import java.io.*;
import java.util.*;
import java.util.Random;

/**
 *
 * @author alexguntermann
 */
public class HangMan {

    static String[] words = new String[181975]; //new array with length of 181975
static Scanner input2 = new Scanner(System.in); 

    public static void main(String[] args) throws IOException {

        System.out.println("Welcome to Hangman");

        PlayGame play = new PlayGame();
        int again = 1;
        while(again==1){
        play.play();
            System.out.println("Do you want to play again? If so, press (1) Yes or (2) No.");
            again=input2.nextInt();
            
        
        
        
        

    }
    
}
}

//    public static void PlayGame() throws IOException {
//
//        Scanner input = new Scanner(System.in);
//
//        Scanner wordList = new Scanner(new FileReader("DicAll.txt"));
//
//        System.out.print("Input a number to select a word length: ");
//        int wordLength = input.nextInt();
//
//        for (int i = 0; wordList.hasNext(); i++) {
//            words[i] = wordList.next();
//        }
//        System.out.print("Input a number to select your number of guesses: ");
//
//        int guessAmount = input.nextInt();
//        for (int j = 0; j < guessAmount; j++){
//            
//        }
//
//        String goal = getWords(wordLength).toLowerCase();
//
//        char [] blankWord = new char[goal.length()];
//
//        for (int i = 0; i < goal.length(); i++) {
//            blankWord [i] = '_';
//
//        }
//        System.out.println("Your word is: " + goal); //cheat
//for (int i = 0; i < blankWord.length; i++) {
//            
//        
//        System.out.print(blankWord[i]+" ");
//}
//        System.out.println("");
//        
//        int guessCount = 0;
//while(guessAmount != guessCount){
//        System.out.println("Guess a letter: ");
//
//        char guess1 = input.next().toLowerCase().charAt(0);
//        
//        for (int i = 0; i < goal.length(); i++) {
//           
//            if (guess1 == goal.charAt(i)) {
//                blankWord[i]=guess1;
//                guessCount++;
//            }
//        
//        }
//        for (int i = 0; i < blankWord.length; i++) {
//            
//        
//        System.out.print(blankWord[i]+" ");
//}
//        System.out.println("");
//
//        if(checkWin(blankWord)==true){
//            System.out.println("You won in: " +guessCount);
//            System.exit(0);
//        }
//        
//        
//        }
//                System.out.println("You have used all of your guesses. You lose. "
//                        + "Thanks for playing");
//                System.exit(0);
//            }
//    
//    public static boolean checkWin(char[] array){
//        boolean guessed = true;
//        for(int i = 0; i < array.length;i++){
//            if(array[i] == '_'){
//                guessed =false;
//                break;
//            }
//        }
//               return guessed;
//    }
//
//    
//
//    public static String getWords(int wordLength) {
//        int count=0;
//        Random rand = new Random();
//        
//        for (int i = 0; i < words.length; i++) {
//            if (words[i].length() == wordLength) {
//                count++;
//               
//
//            }
//            
//        }
//        int counter2 = 0;
//          String [] correctLenth = new String [count];
//             for (int i = 0; i < words.length; i++) {
//            if (words[i].length() == wordLength) {
//                correctLenth[counter2]=words[i];
//                counter2++;
//
//    }
//}
//             int randomPos = rand.nextInt(correctLenth.length);
//            
//    
//    return correctLenth[randomPos];
//
//            
//            
//            }}