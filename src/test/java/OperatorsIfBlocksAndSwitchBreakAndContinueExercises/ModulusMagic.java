package OperatorsIfBlocksAndSwitchBreakAndContinueExercises;

import org.testng.annotations.Test;

// Write a Java program that checks if a number (input from the user) is even or odd without using any conditional statements (hint: use the modulus operator).

public class ModulusMagic {

    public int a = 50;
    public int b = 10;
    public int modulus = a % b;

    @Test
    public void modulusMagic() {
        System.out.println("The modulus of " + a + " and " + b + " is: " + modulus);
    }

}
