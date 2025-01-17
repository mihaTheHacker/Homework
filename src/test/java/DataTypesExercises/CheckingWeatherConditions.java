package DataTypesExercises;

//Write a program to decide if you should go out based on the weather conditions.
//The decision is based on three factors: if it's sunny, if there's a chance of rain, and if it's warm.
//If it's sunny and warm, you should go out.
//even if it's not sunny, you might still consider going out if it's warm but only if there's no chance of rain.
//Create three boolean variables: isSunny, isWarm, and isChanceOfRain.
//Use logical operators to evaluate the conditions under which you should go out.
//Store the result in a boolean variable named shouldGoOut.
//Print the value of shouldGoOut.

import org.testng.annotations.Test;

public class CheckingWeatherConditions {
@Test
    public static void main(String[] args) {
        boolean isSunny = true;
        boolean isWarm = true;
        boolean isChanceOfRain = false;
        boolean shouldGoOut = isSunny && isWarm || isWarm && !isChanceOfRain;
        System.out.println("Should I go out? " + shouldGoOut);
    }
}
