package DataTypesExercises;

import org.testng.annotations.Test;

public class BooleanComparison {

    //Create a program that compares two integers using relational operations and stores the result in a boolean variable.
    //Then print the boolean variable.
    @Test
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        boolean result1 = a > b;
        boolean result2 = a < b;
        boolean result3 = a == b;
        boolean result4 = a != b;
        System.out.println("The result of the comparison is: " + result1);
        System.out.println("The result of the comparison is: " + result2);
        System.out.println("The result of the comparison is: " + result3);
        System.out.println("The result of the comparison is: " + result4);
    }

}
