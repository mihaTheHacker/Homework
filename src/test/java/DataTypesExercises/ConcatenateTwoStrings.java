package DataTypesExercises;

//Create a program that concatenates two strings and prints the result.

import org.testng.annotations.Test;

public class ConcatenateTwoStrings {

        public String firstString = "Hello, ";
        public String secondString = "World!";
  @Test
        public void concatenateTwoStrings() {
            System.out.println(firstString + secondString);
        }

}
