/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finallab;

import java.util.Scanner;

/**
 *
 * @author alexguntermann
 */
public class FinalLab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter table size");

        int user = input.nextInt();

        System.out.println("------------");

        System.out.println(user + " " + "times table");

        System.out.println("------------");

        int[][] multi = new int[user][user];

        for (int i = 0, b = 0; i < user; i++, b++) {
            multi[i][b] = (i + 1) * (b + 1);

        }
        for (int i = 0; i < multi.length; i++) {
            for (int j = 0; j < multi.length; j++) {
                multi[i][j] = (i + 1) * (j + 1);

            }
        }
        for (int i = 0; i < multi.length; i++) {
            for (int j = 0; j < multi.length; j++) {
                System.out.printf("%5d * %d = %2d", i + 1, j + 1, multi[i][j]);
            }
            System.out.println();
        }

    }

}
