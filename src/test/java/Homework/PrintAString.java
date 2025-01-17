package Homework;

//Print a String
//Write a program that initializes a String variable with a value and prints it.

import org.testng.annotations.Test;

public class PrintAString {

    public String myString = "Hello, World!";

    @Test
    public void printAString() {
        System.out.println(myString);
    }


}
