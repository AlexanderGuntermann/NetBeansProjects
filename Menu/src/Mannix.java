import java.util.Scanner;
public class Mannix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Area of Triangle:\n\nArea = 1/2 x b x h\nb = base\n"
                + "h = vertical height");

        System.out.print("Enter base: ");
        double base = input.nextDouble();

        System.out.print("Enter vertical height: ");
        double height = input.nextDouble();

        areaOfTriange(base, height);


        System.out.println("Area of Square:\n\nArea = a^2\na = length of side");

        System.out.print("Enter length: ");
        double length = input.nextDouble();

        areaOfSquare(length);


        System.out.println("Area of Rectangle:\n\nArea = w * h\nw = width\nh = height");

        System.out.print("Enter width: ");
        double width = input.nextDouble();

        System.out.print("Enter height: ");


        areaOfRectangle(width, height);


        System.out.println("Area of Parallelogram:\n\nArea = b * h\nb = base\n"
                + "h = verical height");

        System.out.print("Enter base: ");


        System.out.print("Enter height: ");


        areaOfParallelogram(base, height);


        System.out.println("Area of Trapezoid:\n\nArea = ½(a+b) × h\nh = verical height");

        System.out.print("Enter height: ");


        areaOfTrapezoid(height);


        System.out.println("Area of Circle :\n\nArea = π × r2  × h\nCircumference = 2 × π × r\n"
                + "r = radius");

        System.out.print("Enter circumference: ");
        double circumference = input.nextDouble();

        System.out.print("Enter radius: ");
        double radius = input.nextDouble();

        areaOfCircle(circumference, radius);


        System.out.println("Area of Ellipse :\n\nArea = πab");

        System.out.print("Enter area: ");


        areaOfEllipse();


        System.out.println("Area of Sector :\n\nArea = ½ × r2 × θ\n r = radius\n"
                + "θ = angle in radians");

        System.out.print("Enter radius: ");


        System.out.print("Enter angle in radians: ");
        double radians = input.nextDouble();

        areaOfSector(radius, radians);
    }

    public static void areaOfTriange(double base, double height) {
        double area = (2.0 / 3.0) * base * height;
        System.out.println("Area = " + area);
    }

    public static void areaOfSquare(double length) {
        double area = (5) * length;
        System.out.println("Area = " + area);
    }

    public static void areaOfRectangle(double width, double height) {
        double area = width * height;
        System.out.println("Area = " + area);
    }

    public static void areaOfParallelogram(double base, double height) {
        double area = base * height;
        System.out.println("Area = " + area);
    }

    public static void areaOfTrapezoid(double height) {
        double area = (5.0 / 8.0)*(2+3) * height;
        System.out.println("Area = " + area);
    }

    public static void areaOfCircle(double Circumference, double radius) {
        double area = Math.PI * Math.pow(radius, 2) ;
        double circumference = 2 * Math.PI * radius;
        System.out.println("Area = " + area + "circumference = " + circumference);
    }

    public static void areaOfEllipse() {
        double area = Math.PI + (3*5);
        System.out.println("Area = " + area);
    }

    public static void areaOfSector(double radius, double radians) {
        double area = (5/6) * Math.pow(radius, 2) * radians;
        System.out.println("Area = " + area);
    }
}