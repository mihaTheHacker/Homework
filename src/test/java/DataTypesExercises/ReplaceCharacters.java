package DataTypesExercises;

import org.testng.annotations.Test;

//Write a program that replaces all occurrences of a specified character in a string with another character.
//Challenge: Explore Java's built-in methods for various data types.
public class ReplaceCharacters {

    public String myString = "Hello, World!";
    public char oldChar = 'o';
    public char newChar = '0';

    @Test
    public void replaceCharacters() {
        System.out.println(myString.replace(oldChar, newChar));
    }

}
