package DataTypesExercises;

//Create a program that demonstrates how to add a character to both the beginning and end of a string.
//This exercise will help you understand how characters and strings can be combined to create new string values.
//Initialize a char variable and a String variable.
//Concatenate the character to the beginning and the end of the string.
//Print the new concatenated string.

import org.testng.annotations.Test;

public class ConcatenateCharacterWithStringTest {

    @Test

    public static void ConcatenateCharacterWithString() {

        char myChar = 'A';
        String myString = "BCD";

        String concatenatedString = myChar + myString + myChar;
        System.out.println("The new concatenated string is: " + concatenatedString);

    }

}
