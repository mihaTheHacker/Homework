package DataTypesExercises;

import org.testng.annotations.Test;

//Write a program that converts a lowercase letter to uppercase and vice versa.
// This exercise does not use conditional statements, so you'll need to use two predefined characters.
public class CharacterConversionTest {

    @Test
    public static void CharacterConversion() {

        char myLowerCaseChar = 'a';
        char myUpperCaseChar = 'Z';

        char convertedToUpper = Character.toUpperCase(myLowerCaseChar);
        char convertedToLower = Character.toLowerCase(myUpperCaseChar);
        System.out.println("Lowercase 'a' converted to uppercase: " + convertedToUpper);
        System.out.println("Uppercase 'Z' converted to lowercase: " + convertedToLower);

    }
}
