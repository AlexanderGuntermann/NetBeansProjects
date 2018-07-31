/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package longestdecreasingsubsequence;

import java.util.*;

/**
 *
 * @author alexguntermann
 */
public class LongestDecreasingSubsequence {

    static int size = 10;

    static int[][] T = new int[size + 1][size + 1];

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int array[] = new int[size];
        Random rand = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(40);

        }
        System.out.println(Arrays.toString(array));
        int[] originalArray = Arrays.copyOf(array, array.length);
        System.out.println(Arrays.toString(originalArray));
        doSelectionSort(array);
        System.out.println(Arrays.toString(array));
        LDS(size+1, size+1, array, originalArray);
        for(int [] a:T){
            System.out.println(Arrays.toString(a));
    }
    }

    public static void doSelectionSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[index]) {
                    index = j;
                }
            }

            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
        //return arr;
    }


    public static void LDS(int m, int n, int[] X, int[] Y) {
        for (int i = 0; i < n; i++) {
            T[i][0] = 0;
        }
        for (int j = 0; j < m; j++) {
            T[0][j] = 0;
        }
        for (int i = 1; i < n; i++) {

            for (int j = 1; j < m; j++) {
                if (X[i-1] == Y[j-1]) {
                    T[i][j] = 1 + T[i - 1][j - 1];
                } else {

                    T[i][j] = Math.max(T[i - 1][j], T[i][j - 1]);

                }

            }

        }

    }

}




    
    
//See more at: http://www.java2novice.com/java-sorting-algorithms/selection-sort/#sthash.yKDS7AwV.dpuf



// TODO code application logic here

