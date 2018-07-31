
/Users/alexguntermann/NetBeansProjects/AreaOfPlaneShapes/src/areaofplaneshapes/AreaOfPlaneShapes.java
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areaofplaneshapes;

import java.util.Scanner;

/**
 *
 * @author alexguntermann
 */
public class AreaOfPlaneShapes {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Area of Triangle:\n\nArea = 1/2 x b x h\nb = base\n"
                + "h = vertical height");
        System.out.print("Enter base: ");
        double base = input.nextDouble();
        System.out.print("Enter height: ");
        double height = input.nextDouble();
        areaOfTriangle(base, height);

        System.out.println("");
    

        System.out.println("Area of Rectangle:\nArea = w x h\nw = width\n" + "h = height");
        System.out.print("Enter width: ");
        double width1 = input.nextDouble();
        System.out.print("Enter height: ");
        double height1 = input.nextDouble();
        areaOfRectangle(width, height);
        System.out.println("");
    
        
        System.out.println("Area of Trapezoid:\nArea = 1/2(a+b) x h\n" + "h = height");
        System.out.print("Enter a: ");
        double a = input.nextDouble();
        System.out.print("Enter b: ");
        double b = input.nextDouble();
        System.out.print("Enter height: ");
        double h = input.nextDouble();
        areaOfTrapezoid(a, b, h);

        System.out.println("");

    
    }
    public static void areaOfTriangle(double base, double height) {
        double TriangleArea = (1.0 / 2.0) * base * height;
        System.out.println("Area = " + TriangleArea);

    }

    public static void areaOfRectangle(double width1, double height1) {
        double RectangleArea = width1 * height1;
        System.out.println("Area = " + RectangleArea);

    }

    public static void areaOfTrapezoid(double a, double b, double h) {
        double TrapezoidArea = (1.0 / 2.0) * (a + b) * h;
        System.out.println("Area = " + TrapezoidArea);
    }

    public static void areaOfEllipse(double PI, double c, double d) {
        double EllipseArea = Math.PI * (c * d);
        System.out.println("Area = " + EllipseArea);
    }

    public static void areaOfSquare(double A) {
        double SquareArea = Math.pow(A, 2);
        System.out.println("Area = " + SquareArea);

    }

    public static void areaOfParallelogram(double )
}
