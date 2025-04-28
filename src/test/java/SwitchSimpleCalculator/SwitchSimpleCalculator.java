package SwitchSimpleCalculator;
//Create a Java program that acts as a simple calculator.
// The program should take three inputs: two numbers and an operator (+, -, *, /)
// and perform the operation using a switch statement.

import java.util.Scanner;

public class SwitchSimpleCalculator {

    public static void main(String[] args) {
        double num1 = getNumber("Enter the first number: ");
        double num2 = getNumber("Enter the second number: ");
        char operator = getOperator();
        double result = performCalculation(num1, num2, operator);
        displayResult(result);
    }

    // Method to get a number from the user
    public static double getNumber(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextDouble();
    }

    // Method to get an operator from the user
    public static char getOperator() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an operator (+, -, *, /): ");
        return scanner.next().charAt(0);
    }

    // Method to perform the calculation based on the operator
    public static double performCalculation(double num1, double num2, char operator) {
        double result = 0;
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero.");
                }
                break;
            default:
                System.out.println("Invalid operator.");
        }
        return result;
    }

    // Method to display the result
    public static void displayResult(double result) {
        System.out.println("Result: " + result);
    }
}