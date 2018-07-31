/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gravitycalculator;

/**
 *
 * @author alexguntermann
 */
public class GravityCalculator {

    public static void main(String[] args) {
        double gravity = -9.81; // Earth's gravity in m/s^2
        double initialVelocity = 0.0;
        double fallingTime = 10.0;
        double initialPosition = 0.0;
        double finalPosition = 0.0;
        finalPosition = distance(gravity, fallingTime, initialVelocity,
                initialPosition);
        System.out.println("The object's position after " + fallingTime
                + " seconds is " + finalPosition + " m.");
        
        
        
    }
    
    public static double distance(double a, double t, double v, double x) {

        double d = 0.5 * (Math.pow(t, 2) * a) + (v * t) + x;
        return d;
    }
}
//The object's position after 10.0 seconds is -490.5 m.


