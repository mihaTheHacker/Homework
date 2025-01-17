package OperatorsIfBlocksAndSwitchBreakAndContinueExercises;

import org.testng.annotations.Test;

public class DivisionOfTwoIntegers {

    public int a = 50;
    public int b = 10;
    public int quotient = a / b;

    @Test
    public void divisionOfTwoIntegers() {
        System.out.println("The quotient of " + a + " and " + b + " is: " + quotient);
    }

}
