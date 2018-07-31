/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dummydriver;

/**
 *
 * @author alexguntermann
 */
public class DummyDriver {
static char pop;
    static int result;
    static String input;
    static String postFix = "";
    //if open paren push onto the stack

//    public static boolean yesOperator(String op) {
//
//        return op.equals("+") || op.equals("-") || op.equals("/") || op.equals("*");
//
//    }
//
//    public static boolean yesParen(String par) {
//        return par == "(" || par == ")";
//    }
    //if the operands is equal to the operators -1 then the string is valid and can be converted to postfix
    public static boolean validateInfix(String infix) {
        int operator = 0;
        int operand = 0;
        String[] infixSplit = infix.split(" ");
        //loop through the string 
        for (int i = 0; i < infixSplit.length; i++) {
            
            System.out.println("Count is: " + i);
            //if an operator exits, increment the operator integer
             if (!infixSplit[i].equals("+") && !infixSplit[i].equals("-") && !infixSplit[i].equals("*")
                    && !infixSplit[i].equals("/") && !infixSplit[i].equals("(") && !infixSplit[i].equals(")")) {
         operand++;
                System.out.println("Number of operands: " + operand);
            }
             else operator++;
            }
        

        return (operand - 1) == operator;
    }
//    //check if a is equal or greater than b, return true, if a is less than b in presecende return false;
//
//    private static int getPrecedence(String operator) {
//
//        switch (operator) {
//            case "+":
//            case "-":
//                return 1;
//
//            case "*":
//            case "/":
//                return 2;
//
//        }
//        return -1;
//
//    }
//
//    public static boolean balancedBrace(String infix) {
//
//        String[] balanced = infix.split(" ");
//
//        Calculator<String> theStack = new Calculator(balanced.length);
//
//        boolean balancedSoFar = true;
//
//        int i = 0;
//
//        while (balancedSoFar) {
//            String ch = balanced[i];
//            i++;
//            if (ch.equals("(")) {
//                theStack.push(ch);
//
//            } else if (ch.equals(")")) {
//                if (!theStack.isEmpty()) {
//                    theStack.pop();
//
//                } else {
//                    balancedSoFar = false;
//                }
//
//                if (balancedSoFar && theStack.isEmpty()) {
//                    return balancedSoFar;
//                } else {
//                    return balancedSoFar;
//                }
//
//            }
//        }
//        return balancedSoFar;
//    }
//
//    public static String convertToPostFix(String input) {
//        String[] splitString = input.split(" ");
//        Calculator<String> myStack = new Calculator();
//
//        //loop through entire string
//        for (int i = 0; i < splitString.length; i++) {
//            System.out.println("The current index is: " + i + "\n" + postFix);
//            //if a left/open parethesis, push it onto the stack
//            if (splitString[i].equals("(")) {
//                myStack.push(splitString[i]);
//                System.out.println("This is the stack: \n" + myStack);
//            } //if the position is a right brace, while the stack is not empty, and if the top value is not a left brace, 
//            //then pop the stack and append it to the postFix string, else pop the left brace, discard, and break
//            else if (splitString[i].equals(")")) {
//                while (!myStack.peek().equals("(")) {
////                    if (!myStack.isEmpty()){
//                    postFix += myStack.pop() + " ";
//                    System.out.println("This is the stack: " + myStack);
//                }
//                myStack.pop();
//                System.out.println("This is the stack: " + myStack);
//
////                }
//            } // if operator and stack is empty, push onto stack. If stack is not empty, check if top of stack is greater or equal pres
//            else if (splitString[i].equals("+") || splitString[i].equals("*") || splitString[i].equals("/") || splitString[i].equals("-")) {
//
//                while (!myStack.isEmpty() && getPrecedence(splitString[i]) <= getPrecedence(myStack.peek())) {
//                    postFix += myStack.pop() + " ";
//                    System.out.println("This is the stack: " + myStack);
//                }
//                myStack.push(splitString[i]);
//
//                System.out.println("This is the stack: " + myStack);
//            } //if operand append to postfix str
//            else {// (!splitString[i].equals("+") && !splitString[i].equals("*") && !splitString[i].equals("/") && !splitString[i].equals("-")
////                    && !splitString[i].equals("(") && !splitString[i].equals(")")) {
//                postFix += splitString[i] + " ";
//            }
//
//        }
//        while (!myStack.isEmpty()) {
//            postFix += myStack.pop() + " ";
//        }
//        return postFix;
//
//    }
//
//    public static int evaluatePostFixExpression(String postfix) {
//
//        int num1;
//
//        int num2;
//
//        String[] splitPost = postfix.split(" ");
//        Calculator<Integer> postStack = new Calculator(splitPost.length);
//
//        for (int i = 0; i < splitPost.length; i++) {
//            //if the position is an operand, push its value onto the stack
//            if (!splitPost[i].equals("+") && !splitPost[i].equals("*") && !splitPost[i].equals("/") && !splitPost[i].equals("-")) {
//
//                postStack.push(Integer.parseInt(splitPost[i]));
//
//                System.out.println(postStack);
//                //if the position is an operator
//            } else if (splitPost[i].equals("+") || splitPost[i].equals("-") || splitPost[i].equals("*") || splitPost[i].equals("/")) {
////                if (!postStack.isEmpty()) {
//                num1 = (postStack.pop());
//                num2 = (postStack.pop());
//
//                if (splitPost[i].equals("+")) {
//                    postStack.push(num1 + num2);
//                    System.out.println(postStack);
//                } else if (splitPost[i].equals("-")) {
//                    postStack.push(num2 - num1);
//                    System.out.println(postStack);
//                } else if (splitPost[i].equals("*")) {
//                    postStack.push(num1 * num2);
//                    System.out.println(postStack);
//                } else {
//                    postStack.push(num2 / num1);
//                    System.out.println(postStack);
//                }
//            }
//        }
//
//        result = postStack.pop();
//
//        System.out.println(result);
//
////        }
//        return result;
//
//    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String na = "23 − 2 ∗ 5";
        
        if(validateInfix(na)){
            System.out.println("yay");
        } else
        System.out.println("poo");

    }
}
    
