package DataTypesExercises;

import org.testng.annotations.Test;

public class BooleanValueAssignmentAndPrinting {
    //Create a program that declares a boolean variable, assigns a value to it, and then prints it.

    boolean myBoolean = true;

    @Test
    public void booleanValueAssignmentAndPrinting() {
        System.out.println("The boolean value is: " + myBoolean);
    }

}
