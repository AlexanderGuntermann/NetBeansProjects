/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicuserimput;

import java.util.Scanner;
/**
 *
 * @author alexguntermann
 */
public class Basicuserimput {
     
    
  
          
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a #:");
        
        int number = input.nextInt();
        String result = "You entered: " + number;
        System.out.println("result = " + result);
input.nextLine();
        System.out.println("Enter your name: ");
        String name = input.nextLine();
       
        
        String result2 = "You entered: " + name;
        System.out.println(result2);
        
        
        
        
        
        
        
        
    }
    
}
