package com.packages;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        char operator;
        Double number1, number2, result;
        Scanner input = new Scanner(System.in);

        // Choose an operator for mathematical operation
        System.out.print("Choose an operator (Addition(+), Subtraction(-), Multiplication(*), Division(/), Percentage(%)):- ");
        operator = input.next().charAt(0);

        // Enter two numbers from the user
        System.out.print("Enter first number:- ");
        number1 = input.nextDouble();

        System.out.print("Enter second number:- ");
        number2 = input.nextDouble();

        switch (operator) {

                //addition
            case '+':
                result = number1 + number2;
                System.out.println(number1 + " + " + number2 + " = " + result);
                break;

                //Subtract
            case '-':
                result = number1 - number2;
                System.out.println(number1 + " - " + number2 + " = " + result);
                break;

                //Multiplication
            case '*':
                result = number1 * number2;
                System.out.println(number1 + " * " + number2 + " = " + result);
                break;

                //division
            case '/':
                result = number1 / number2;
                System.out.println(number1 + " / " + number2 + " = " + result);
                break;

            //Percentage
            case '%':
                result = (number1 / number2) *100;
                System.out.println(number1 + " % " + number2 + " = " + result + "%");
                break;

            //Reject an invalid operator
        default:
            System.out.println("Invalid operator!");
            break;
        }

        input.close();
    }
}

