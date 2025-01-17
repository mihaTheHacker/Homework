package DataTypesExercises;

import org.testng.annotations.Test;

public class ConvertFahnrenheitToCelsius {

    public double fahrenheit;
    public double celsius;

    @Test
    public void convertFahrenheitToCelsius(){
        fahrenheit = -92;
        celsius = (fahrenheit - 32) * 5/9;
        System.out.println("The temperature in Fahrenheit is: " + fahrenheit);
        System.out.println("The temperature in Celsius is: " + celsius);

    }

}
