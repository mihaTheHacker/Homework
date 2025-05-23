package SwitchMonthNameFinder;
//Create a Java program that asks the user to enter a month number (1-12)
// and then displays the name of the month using a switch statement.
// For example, if the user enters 1, the program should display "January".
// If the user enters 22 the program should display "Invalid month number".

import java.util.Scanner;

public class SwitchNameMonthFinder {

    public static void main(String[] args) {

        //create a scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        //ask the user to enter a month number between 1 and 12
        System.out.print("Enter a month number (1-12): ");
        int monthNumber = scanner.nextInt();

        //use a switch statement to determine the name of the month
        switch (monthNumber) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Invalid month number");
        }
//close scanner
        scanner.close();
    }
}