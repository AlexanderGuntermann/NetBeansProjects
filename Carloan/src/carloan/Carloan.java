/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carloan;


import java.util.Scanner;

/**
 *
 * @author alexguntermann
 */
public class Carloan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//        Scanner input = new Scanner(System.in);
//        System.out.println("Input P value");
//        double P = input.nextDouble();
//        System.out.println("");
//      
//        System.out.println("Input Y Value");
//        int Y = input.nextInt();
//        System.out.println("");
//        
//        
//        System.out.println("Input R Value");
//        double R = input.nextDouble();
//        System.out.println("");

//        
//        int n = (12*Y);
//        double r = (R/1200);
//        
//        
//        double result1 = (P*r);
//        double result2 = (1 - Math.pow((1+r), -n));
//        double monthlyPayment = result1/result2;
//        
        
//        double totalInterest = monthlyPayment * n - P;
//        System.out.println("The Total Interest is:"+totalInterest);
//        System.out.println("The monthly payment is:" + monthlyPayment);
//        
        
       

    theMethod(20000, 5, 6);
    theMethod(50000,6,7);
    theMethod(50000,2,6);
    theMethod(50000,3,3);
    
    
    
}
    
    public static void theMethod (double P, int Y, double R){
        
        Scanner input = new Scanner(System.in);
        System.out.println("Input P value");
        P = input.nextDouble();
        System.out.println("");
      
        System.out.println("Input Y Value");
        Y = input.nextInt();
        System.out.println("");
        
        
        System.out.println("Input R Value");
        R = input.nextDouble();
        System.out.println("");
        
        int n = (12*Y);
        double r = (R/1200);
        
        
        double result1 = (P*r);
        double result2 = (1 - Math.pow((1+r), -n));
        double monthlyPayment = result1/result2;
        
        double totalInterest = monthlyPayment * n - P;
        System.out.println("The Total Interest is:"+totalInterest);
        System.out.println("The Monthly payment is:" + monthlyPayment);
        
        
        
        
        
    }
    
    
    
}
    

    
