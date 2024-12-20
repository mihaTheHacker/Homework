package Homework;

import org.testng.annotations.Test;

public class TheAreaOfASquare {
    public Integer side;

    @Test
    public void calculateTheAreaOfASquare(){
        side = 5;
        Integer area = side * side;
        System.out.println("The area of the square is: " + area);
        System.out.println("The square side is: " + side);
    }

}
