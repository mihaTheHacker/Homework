package Homework;

import org.testng.annotations.Test;

public class ReplaceDigits {

    String digitString = "123456789";
    char oldChar = '1';
    char newChar = '0';

    @Test
    public void replaceDigits() {
        System.out.println(digitString.replace(oldChar, newChar));
    }
}
