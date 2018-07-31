/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 *
 * @author alexguntermann
 */
public class Quadratic {

    public static void main(String[] args) {
//The following commented code asks the user for imput to solve quadratic equations
       Scanner input = new Scanner(System.in);
        System.out.print("Input value A:");
        double number1 = input.nextDouble();
        System.out.println("");

        System.out.print("Input value B:");
        double number2 = input.nextDouble();
        System.out.println("");
        
        System.out.print("Input value C:");
        double number3 = input.nextDouble();
        System.out.println("");
        
        double result1= Math.sqrt(Math.pow(number2, 2) - 4*number1*number3);
        double root1=((-1)*number2-result1)/(2*number1); 
        double root2=((-1)*number2+result1)/(2*number1);
        System.out.println("root1 is "+root1);
        System.out.println("root2 is "+root2);

//        myMethod(1, 2, -15);
//        myMethod(2, -10, 3);
//        myMethod(1, -6, 13);
//        myMethod(1,-10,25);
//        myMethod(1,-4,23)
    }
    
//    public static void myMethod(double a, double b, double c){
//        
//        
//        
//        
//        double result1= Math.sqrt(Math.pow(b, 2)- (4*a*c));
//        double root1= ((-1)*b-result1)/(2*a);
//        double root2=((-1)*b+result1)/(2*a);
//        System.out.println("The roots of the Quadratic Equation "+ a +"x^2 +" + b+"x" +  c+ " are "+root1+" and "+root2);
//
//    
}
    
    
  


