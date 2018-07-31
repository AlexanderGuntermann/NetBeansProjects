/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author alexguntermann
 */
public class ExpressionTools {

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

            if (infixSplit[i].equals("+") || infixSplit[i].equals("*") || infixSplit[i].equals("/") || infixSplit[i].equals("-")) {
                operator++;
            } else if (!infixSplit[i].equals("+") && !infixSplit[i].equals("-") && !infixSplit[i].equals("*") && !infixSplit[i].equals("/")
                    && !infixSplit[i].equals("(") && !infixSplit[i].equals(")")) {
                operand++;
            }

        }

        return (operand - 1) == operator;

    }
//    public static void main(String[] args) {
//        String na = "23 - 5 * 2";
//        
//        System.out.println(validateInfix(na));
//            System.out.println("yay");
//        
//    }

    //check if a is equal or greater than b, return true, if a is less than b in presecende return false;
    private static int getPrecedence(String operator) {

        switch (operator) {
            case "+":
            case "-":
                return 1;

            case "*":
            case "/":
                return 2;

        }
        return -1;

    }
    // ( 1 + 2) + 3
    // ()(
    public static boolean balancedBrace(String infix) {

        int leftBrace = 0;
        int rightBrace = 0;
        String[] balanced = infix.split(" ");

        for (int i = 0; i < balanced.length; i++) {
            if(balanced[i].equals("(")){
                leftBrace++;
                
            }
            
            else if(balanced[i].equals(")")){
                rightBrace++;
                
            
            
            }
        }
        return leftBrace == rightBrace;

        
    }
    public static String convertToPostFix(String input) {
        String[] splitString = input.split(" ");
        Calculator<String> myStack = new Calculator();

        //loop through entire string
        for (int i = 0; i < splitString.length; i++) {
            //if a left/open parethesis, push it onto the stack
            if (splitString[i].equals("(")) {
                myStack.push(splitString[i]);
            } //if the position is a right brace, while the stack is not empty, and if the top value is not a left brace, 
            //then pop the stack and append it to the postFix string, else pop the left brace, discard, and break
            else if (splitString[i].equals(")")) {
                while (!myStack.peek().equals("(")) {
//                    if (!myStack.isEmpty()){
                    postFix += myStack.pop() + " ";
                    System.out.println("This is the stack: " + myStack);
                }
                myStack.pop();
                System.out.println("This is the stack: " + myStack);

//                }
            } // if operator and stack is empty, push onto stack. If stack is not empty, check if top of stack is greater or equal pres
            else if (splitString[i].equals("+") || splitString[i].equals("*") || splitString[i].equals("/") || splitString[i].equals("-")) {

                while (!myStack.isEmpty() && getPrecedence(splitString[i]) <= getPrecedence(myStack.peek())) {
                    postFix += myStack.pop() + " ";
                    System.out.println("This is the stack: " + myStack);
                }
                myStack.push(splitString[i]);

                System.out.println("This is the stack: " + myStack);
            } //if operand append to postfix str
            else {// (!splitString[i].equals("+") && !splitString[i].equals("*") && !splitString[i].equals("/") && !splitString[i].equals("-")
//                    && !splitString[i].equals("(") && !splitString[i].equals(")")) {
                postFix += splitString[i] + " ";
            }

        }
        while (!myStack.isEmpty()) {
            postFix += myStack.pop() + " ";
        }
        return postFix;

    }

    public static int evaluatePostFixExpression(String postfix) {

        int num1;

        int num2;

        String[] splitPost = postfix.split(" ");
        Calculator<Integer> postStack = new Calculator(splitPost.length);

        for (int i = 0; i < splitPost.length; i++) {
            //if the position is an operand, push its value onto the stack
            if (!splitPost[i].equals("+") && !splitPost[i].equals("*") && !splitPost[i].equals("/") && !splitPost[i].equals("-")) {

                postStack.push(Integer.parseInt(splitPost[i]));

                System.out.println(postStack);
                //if the position is an operator
            } else if (splitPost[i].equals("+") || splitPost[i].equals("-") || splitPost[i].equals("*") || splitPost[i].equals("/")) {
//                if (!postStack.isEmpty()) {
                num1 = (postStack.pop());
                num2 = (postStack.pop());

                if (splitPost[i].equals("+")) {
                    postStack.push(num1 + num2);
                    System.out.println(postStack);
                } else if (splitPost[i].equals("-")) {
                    postStack.push(num2 - num1);
                    System.out.println(postStack);
                } else if (splitPost[i].equals("*")) {
                    postStack.push(num1 * num2);
                    System.out.println(postStack);
                } else {
                    postStack.push(num2 / num1);
                    System.out.println(postStack);
                }
            }
        }

        result = postStack.pop();

        System.out.println(result);

//        }
        return result;

    }
}

//            //check for parenthesis and push onto the stack
////            if (splitr[i].equals("(")) {
////                myStack.push("(");
////                count++;
////                System.out.println("Current string = " + postFix);
////                myStack.print();
////            }
//            //check for operands and push them onto the stack if empty if not then do it according to precedence
//            if (myStack.isEmpty()) {
//                if (splitr[i].equals("+") || splitr[i].equals("-") || splitr[i].equals("*") || splitr[i].equals("/")) {
//                    myStack.push(splitr[i]);
//                    count++;
//                    System.out.println("Current string = " + postFix);
//                    myStack.print();
//
//                } else {
//                    postFix += splitr[i];
//                    count++;
//                    System.out.println("Current string = " + postFix);
//                    myStack.print();
//                }
//
//            } else //                int plus = 1;
//            //                int minus = 1;
//            //                int times = 2;
//            //                int divi = 2;
//            //                int openP = 3;
//            //                int closeP = 3;
//            //            {
//             if ( !myStack.isEmpty() && splitr[i].equals("+")) {
//                    while(myStack.peek().equals("+") || myStack.peek().equals("-") || myStack.peek().equals("*") || myStack.peek().equals("/")) {
//                        postFix += myStack.pop() + " ";
//                    }
//                    myStack.push(splitr[i]);
//                    count++;
//                    System.out.println("Current string = " + postFix);
//                    myStack.print();
//
//                } else if (!myStack.isEmpty() && splitr[i].equals("-")) {
//                    while (myStack.peek().equals("+") || myStack.peek().equals("-") || myStack.peek().equals("*") || myStack.peek().equals("/")) {
//                        postFix += myStack.pop() + " ";
//
//                    }
//                    myStack.push(splitr[i]);
//                    count++;
//                    System.out.println("Current string = " + postFix);
//                    myStack.print();
//
//                } else if (!myStack.isEmpty() && splitr[i].equals("*")) {
//                    while (myStack.peek().equals("+") || myStack.peek().equals("-") || myStack.peek().equals("*") || myStack.peek().equals("/")) {
//                        postFix += myStack.pop() + " ";
//
//                    }
//                    myStack.push(splitr[i]);
//                    count++;
//                    System.out.println("Current string = " + postFix);
//                    myStack.print();
//
//                } else if (!myStack.isEmpty() && splitr[i].equals("/")) {
//                    while (myStack.peek().equals("+") || myStack.peek().equals("-") || myStack.peek().equals("*") || myStack.peek().equals("/")) {
//                        postFix += myStack.pop() + " ";
//
//                    }
//                    myStack.push(splitr[i]);
//                    count++;
//                    System.out.println("Current string = " + postFix);
//                    myStack.print();
//
//                } else if (splitr[i].equals(")")) {
//                    while (!myStack.peek().equals("(")) {
//                        postFix += myStack.pop();
//
//                    }
//                    myStack.pop();
//                    System.out.println("Current string = " + postFix);
//                    myStack.print();
//                } else if (!splitr[i].equals("*") && !splitr[i].equals("/") && !splitr[i].equals("+") && !splitr[i].equals("-")
//                        && !splitr[i].equals("(") && !splitr[i].equals(")")) {
//                    postFix += splitr[i];
//                    count++;
//                    System.out.println("Current string = " + postFix);
//                    myStack.print();
//
//                }
//        }
//        if (count == splitr.length) {
//            while (!myStack.isEmpty()) {
//                postFix += myStack.pop() + " ";

