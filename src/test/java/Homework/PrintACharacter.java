package Homework;

import org.testng.annotations.Test;

//Create a program that initializes a char variable with a letter, then prints this character.
public class PrintACharacter {

    public char myChar = 'A';

    @Test
    public void printACharacter() {
        System.out.println("The character is: " + myChar);
    }

}
