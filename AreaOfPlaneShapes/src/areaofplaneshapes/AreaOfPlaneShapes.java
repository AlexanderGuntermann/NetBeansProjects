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
        System.out.println("Area of Triangle:\nArea = 1/2 x b x h\nb = base\n" + "h = vertical height");
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
        areaOfRectangle(width1, height1);

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

        System.out.println("Area of Ellipse:\nArea = π*c*d");
        System.out.print("Enter c: ");
        double c = input.nextDouble();
        System.out.print("Enter d: ");
        double d = input.nextDouble();

        areaOfEllipse(c, d);

        System.out.println("");

        System.out.println("Area of Square:\nArea = g^2\n" + "g = length of side");
        System.out.print("Enter g: ");
        double g = input.nextDouble();
        areaOfSquare(g);

        System.out.println("");

        System.out.println("Area of Parallelogram:\nArea = 1/2 x j x y\n" + "j = base\n" + "y = height");
        System.out.print("Enter j: ");
        double j = input.nextDouble();
        System.out.print("Enter y: ");
        double y = input.nextDouble();

        areaOfParallelogram(j, y);

        System.out.println("");

        System.out.print("Area of Circle:\nArea = π x r^2\n" + "r = radius\n");
        System.out.print("Enter r: ");
        double radius = input.nextDouble();

        areaOfCircle(radius);

        System.out.println("");

        System.out.println("Area of Sector:\nArea = 1/2 * r^2 * θ\n" + "r = radius\n" + "θ = angle measure");
        System.out.print("Enter r: ");
        double radius1 = input.nextDouble();
        System.out.print("Enter θ: ");
        double angle = input.nextDouble();

        areaOfSector(radius1, angle);

        //couldn't really figure out how to use the same variable for different methods, but it still works.
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

    public static void areaOfEllipse(double c, double d) {
        double EllipseArea = Math.PI * (c * d);
        System.out.println("Area = " + EllipseArea);
    }

    public static void areaOfSquare(double g) {
        double SquareArea = Math.pow(g, 2);
        System.out.println("Area = " + SquareArea);

    }

    public static void areaOfParallelogram(double j, double y) {
        double ParallelogramArea = 1.0 / 2.0 * (j * y);
        System.out.println("Area = " + ParallelogramArea);
    }

    public static void areaOfCircle(double radius) {
        double CircleArea = Math.PI * Math.pow(radius, 2);
        System.out.println("Area = " + CircleArea);
    }

    public static void areaOfSector(double radius1, double angle) {
        double areaOfSector = 1.0 / 2.0 * Math.pow(radius1, 2) * angle;
        System.out.println("Area = " + areaOfSector);
    }
}
