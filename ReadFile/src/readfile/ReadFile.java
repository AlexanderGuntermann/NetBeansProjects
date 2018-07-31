/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readfile;

import java.io.IOException;
import java.util.Scanner;

public class ReadFile {
//    public static void main (String args []) throws IOException{
//        int count = 0;
//        Scanner in = new Scanner (new FileReader("BP"));
//        int thisBP;
//        System.out.println("Blood pressure on file BP: ");
//                //Assumption: There are atleast 10 values
//         while (count <=10){
//             thisBP = in.nextInt();
//             System.out.println(thisBP + " ");
//             count++;
//         }
//         System.out.println();
//         in.close();

//public static void main (String args []) throws IOException{
//
//Scanner in = new Scanner (new FileReader("BP"));
//int thisBP;
//System.out.println("Blood pressures on file BP: ");
//while (in.hasNextInt()){
//thisBP = in.nextInt();
//System.out.print(thisBP + " ");
//}
//System.out.println();
//in.close();
//}
//    }
    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        Scanner in = new Scanner(new FileReader("BP"));
        int thisBP;
        boolean flag = in.hasNextInt();
        while (flag) {
            thisBP = in.nextInt();
            flag = thisBP < 200 && in.hasNextInt();
            if (flag) {
                System.out.println(thisBP + " ");
            }
        }
        System.out.println();
        in.close();
    }
}
