package OperatorsIfBlocksAndSwitchBreakAndContinueExercises;
//Write a Java program to check whether a year (input from the user) is a leap year or not. Remember, a leap year is divisible by 4 but not by 100 unless it's also divisible by 400.

import java.util.Scanner;
import org.testng.annotations.Test;

public class LeapYearChecker {


    public static void main(String[] args) {
        LeapYearChecker leapYearChecker = new LeapYearChecker();
        leapYearChecker.leapYearChecker();
    }

    public void leapYearChecker() {

        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a year
        System.out.println("Enter a year: ");
        int year = scanner.nextInt();

        // Check if the year is a leap year
        if (isLeapYear(year)) {
            System.out.println(year + " is a leap year.");

        } else {

            System.out.println(year + " is not a leap year");
        }
//close the scanner
        scanner.close();
    }

    //method to check if the year is a leap year
    public boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            } else {
                return true;
            }
        }
        return false;
    }

}
