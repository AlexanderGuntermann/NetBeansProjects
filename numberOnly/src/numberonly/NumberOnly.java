/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numberonly;

import java.util.Scanner;

/**
 *
 * @author alexguntermann
 */
public class NumberOnly {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int number;
        System.out.println("Enter a number:");

        Scanner input = new Scanner(System.in);
        do {

            try {

                number = input.nextInt();

            } catch (Exception e) {

                System.out.print("Please enter a number");

                input.nextLine();

            }

        } while (!input.hasNextInt());

        // TODO code application logic here
    }
}



//if(!in.puthasNextInt()){
//
//input.nextLine();
//
//}
//else{
//number=input.nextInt();
//}


