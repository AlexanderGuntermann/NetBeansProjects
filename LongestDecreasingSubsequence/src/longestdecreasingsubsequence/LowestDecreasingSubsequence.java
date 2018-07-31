/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package longestdecreasingsubsequence;

/**
 *
 * @author alexguntermann
 */
import java.util.*;

public class LowestDecreasingSubsequence {

    static int size = 10;
    static int[][] T = new int[size + 1][size + 1];

    public static void LDS(int m, int n, int[] x, int[] y) {
        for (int i = 0; i < n; i++) {
            T[i][0] = 0;
        }
        for (int j = 0; j < m; j++) {
            T[0][j] = 0;
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (x[i - 1] == y[j - 1]) {
                    T[i][j] = 1 + T[i - 1][j - 1];
                } else {
                    T[i][j] = Math.max(T[i - 1][j], T[i][j - 1]);
                }
            }
        }
    }

    public static void main(String[] args) {
        

        int[] arr = new int[size];
        
        Random rand = new Random();
        
        for (int i = 0; i < size; i++) {
            
            arr[i] = rand.nextInt(128);
            
        }
        //System.out.println(Arrays.toString(arr));

        int[] originalArr = Arrays.copyOf(arr, size);
        
        System.out.println("Original Array: " + Arrays.toString(originalArr));
        
        selectionSort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
        LDS(size + 1, size + 1, originalArr, arr);
        System.out.println("Table: ");
        System.out.println("  " + Arrays.toString(originalArr));
        for (int i = 0; i < size + 1; i++) {
            System.out.printf("%3s::", ((i == 0) ? " " : arr[i - 1]));
            System.out.println(Arrays.toString(T[i]));
        }
    }

     public static void selectionSort(int[] arr) {
        for (int i = 0; i < size - 1; i++) {
            int index = i;
            for (int j = i + 1; j < size; j++) {
                if (arr[j] > arr[index]) {
                    
                }
                index = j;
            }
            int temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }
        //Code for selection sort taken from: http://www.java2novice.com/java-sorting-algorithms/selection-sort/#sthash.yKDS7AwV.dpuf

       //return arr;
    }
}
