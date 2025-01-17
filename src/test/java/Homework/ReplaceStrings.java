package Homework;

import org.testng.annotations.Test;

public class ReplaceStrings {

    public String myString = "I love Christmas!";
    public String oldString = "Christmas";
    public String newString = "Easter";
    public String updatedString = myString.replace(oldString, newString);

    @Test
    public void replaceStrings() {
        System.out.println("Original string is: " + myString);
        System.out.println("Updated string is: " + updatedString);
        System.out.println(myString.replace(oldString, newString));
    }


}
