/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.util.Scanner;
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
public class ConsoleCalculator {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner input = new Scanner(System.in);

        String example = "2 + 10 + 50 ) * 20"; //1202
//        String[] blah = example.split(" ");
//        Calculator<String> blahblah = new Calculator(blah.length);
//        for (int i = 0; i < blah.length; i++) {
//            blahblah.push(blah[i]);
        Scanner reader = new Scanner(System.in);
        FileWriter writer = new FileWriter("output.txt");
        PrintWriter printer = new PrintWriter(writer);
        boolean check = false;
        
        do {

            try {
                System.out.println("Please input the name of the file you would like to read from");

                String nameOfInFile = input.next();

                reader = new Scanner(new FileReader(nameOfInFile));
                check = true;
            } catch (FileNotFoundException e) {
                System.out.println("The file does not exist");
            }
        } while (!check);

        do {

            try {

                System.out.println("Please input the name of the file you would like to write to");

                String nameOfOutFile = input.next();

                writer = new FileWriter(nameOfOutFile);
                printer = new PrintWriter(writer);
                check = true;
            } catch (FileNotFoundException e) {
                System.out.println("The file does not exist");
            }
        } while (!check);

        while (reader.hasNextLine()) {

            String infix = reader.nextLine();
            System.out.println("");
            System.out.println(infix);

            if (ExpressionTools.validateInfix(infix) && ExpressionTools.balancedBrace(infix)) {

//        System.out.println(blahblah);
                String res = ExpressionTools.convertToPostFix(infix);
                System.out.println("Infix String to be evaluated: "+ res);
                printer.println(res);

                int exam = ExpressionTools.evaluatePostFixExpression(res);
                System.out.println(exam);
                printer.println(exam);

            } else if (ExpressionTools.validateInfix(infix) == false) {

                try {
                    System.out.println("Sorry the string was invalid and the expression could not be reached");
                    printer.println("Sorry the string was invalid and the expression could not be reached");
                    throw new PostFixException("The PostFix expression is invalid");
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                    printer.println(ex.getMessage());
                }

            } else if (ExpressionTools.balancedBrace(infix) == false) {

                try {

                    System.out.println("Sorry the string did not contain balanced braces");
                    printer.println("Sorry the string was invalid and the expression could not be reached");
                    throw new PostFixException("The infix expression contains unbalanced braces");
                } catch (Exception ex) {
                    printer.println(ex.getMessage());

                }
            }

        }

        printer.close();
    }

}
