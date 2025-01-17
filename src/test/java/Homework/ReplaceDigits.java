package Homework;

import org.testng.annotations.Test;

public class ReplaceDigits {

    String digitString = "123456789";
    char oldChar = '1';
    char newChar = '0';
    String newDigitString = digitString.replace(oldChar, newChar);

    @Test
    public void replaceDigits() {
        System.out.println("Original digit string is: " + digitString);
        System.out.println("New digit string is: " + newDigitString);
        System.out.println(digitString.replace(oldChar, newChar));
    }
}
