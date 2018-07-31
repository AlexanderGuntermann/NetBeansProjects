/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

/**
 *
 * @author alexguntermann
 */
public class Driver {
    
    public static void main(String[] args) {
        
        
        
        
        
        FinalProject  defaultCoordinates = new FinalProject();
        
        System.out.println("Points from Default constructor");
        
        System.out.println(defaultCoordinates);
        
        
        System.out.println("");
        
        FinalProject <Integer> intCoordinates = new FinalProject(10,20);
        System.out.println("New Integer Points");
        System.out.println(intCoordinates);
        System.out.println("");
        
        FinalProject <Double> doubleCoordinates = new FinalProject(10.0,20.0);
        System.out.println("New Double Points");
        System.out.println(doubleCoordinates);
        System.out.println("");
        
        
        FinalProject <Float> floatCoordinates = new FinalProject(3.33,4.44);
        System.out.println("New FloatPoints");
        System.out.println(floatCoordinates);
        
        
        
        
        
    }
    
    
    
    
    
    
    
}
