/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byteaddition;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author alexguntermann
 */
public class ByteAddition {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
//        // TODO code application logic here
//
//        char[] charArray1 = {'0', '1', '1', '1', '1', '1', '1', '1'};
//        char[] charArray2 = {'0', '1', '1', '1', '0', '0', '0', '0'};
//
//        Byte one = new Byte(charArray1);
//        Byte two = new Byte(charArray2);
//        
////        System.out.println(one);
////        one.add(two);
////        System.out.println(one.add(two));//
//        
//        
////        System.out.println(one.biasTo2sComplement());
//        
//        System.out.println(one);
//        
//       
//        System.out.println(one.magnitude());
        Scanner input = new Scanner(new FileReader("binary.txt"));
        
        FileWriter outputFile = new FileWriter("output.txt");
        PrintWriter output = new PrintWriter(outputFile);

        while (input.hasNext()) {

            String first = input.next();

            String second = input.next();

            char[] firstChar = new char[first.length()];
            char[] secondChar = new char[second.length()];
            
            

            for (int i = 0; i < first.length(); i++) {

                firstChar[i] = first.charAt(i);
            }

            for (int i = 0; i < secondChar.length; i++) {
                secondChar[i] = second.charAt(i);

            }

            Byte firstNum = new Byte(firstChar);

            Byte secondNum = new Byte(secondChar);

            secondNum = secondNum.biasTo2sComplement();
            
            

            String valueOne = String.format("%4s%25s%20d", " "+first, "Two's complement", firstNum.magnitude());

            String valueTwo = String.format("%4s%24s%21d", "+"+second, "Biased Notation",secondNum.magnitude());
           
            

            
            
            
            

           

//            
            String valueResult;
//            System.out.println(" " + first + "            " + "2's complement" + "        " + firstNum.magnitude());
//            System.out.println("+" + second + "         " + "Biased notation" + "       " + secondNum.magnitude());
            System.out.println(valueOne);
            System.out.println(valueTwo);
            System.out.println("" + " --------"+"                         "+"                 ----");
            output.println(valueOne);
            output.println(valueTwo);
            output.println("" + " --------"+"                         "+"                 ----");
            String sum = firstNum.add(secondNum).toString();
            // isoverflow
            // isunderflow

            int result = firstNum.magnitude() + secondNum.magnitude();
            
            
            
            if (isUnderFlow(result) == true) {
                sum = " underflow";

            }
            if (isOverFlow(result) == true) {
                sum = " overflow";
            }

            
            
            String formatUnder = String.format("%4s%44d",sum,result);
            String formatOver = String.format("%4s%45d", sum,result);
            
            
            
            valueResult = String.format("%4s%25s%20d"," "+sum, "Two's Complement",result);
            
            
        
            
            if(isOverFlow(result) == false && isUnderFlow(result)==false){
                System.out.println(valueResult);
            output.println(valueResult);
            }
            
            
            if(isUnderFlow(result) == true){    
                System.out.println(formatUnder);
                output.println(formatUnder);

            }
            if(isOverFlow(result) == true){
                System.out.println(formatOver);
                output.println(formatOver);

            }
            
        
            
           
            System.out.println("");
            output.println("");
           
           

            //System.out.println("" + sum + "          " + "2's complement" + "        " + result);

           // System.out.println("");
          

        }
       output.close();
    }

    public static boolean isUnderFlow(int magnitude) { //-128 is smallest number
        boolean underflow = false;
        if (magnitude < -128) {
            underflow = true;
        } else {
            underflow = false;
        }
        return underflow;
    }

    public static boolean isOverFlow(int magnitude) { //127 is the biggest number
        boolean overflow = false;
        if (magnitude > 127) {
            overflow = true;
        } else {
            overflow = false;
        }
        return overflow;
        
    }
    

}
    