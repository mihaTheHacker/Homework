package OperatorsIfBlocksAndSwitchBreakAndContinueExercises;

import org.testng.annotations.Test;

public class MultiplicationOfTwoIntegers {

    int a = 5;
    int b = 10;
    int product = a * b;

    @Test
    public void multiplicationOfTwoIntegers() {
        System.out.println("The product of " + a + " and " + b + " is: " + product);
    }

}
