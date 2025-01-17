package DataTypesExercises;

import org.testng.annotations.Test;


public class ThePerimeterOfARectangle {

    public Integer length;
    public Integer width;


    @Test
    public void calculateThePerimeterOfARectangle() {

        length = 5;
        width = 2;
        Integer perimeter = (length + width) * 2;
        System.out.println("The perimeter of the rectangle is: " + perimeter);
        System.out.println("The rectangle perimeter length is: " + length);
        System.out.println("The rectangle perimeter width is: " + width);

    }
}