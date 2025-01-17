package DataTypesExercises;

import org.testng.annotations.Test;

public class CalculateTheHypotenuseOfARightAngledTriangle {

    public double sideA;
    public double sideB;
    public double hypotenuse;

    @Test
    public void calculateTheHypotenuseOfArightAngledTriangle() {
        sideA = 7;
        sideB = 24;

        hypotenuse = Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2));
        System.out.println("The hypotenuse of a right-angled triangle is: " + hypotenuse);

    }


}
