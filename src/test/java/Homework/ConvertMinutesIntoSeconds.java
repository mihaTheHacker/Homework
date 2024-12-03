package Homework;

import org.testng.annotations.Test;

public class ConvertMinutesIntoSeconds {
    public Integer minutes;
    public Integer seconds;

@Test
    public void convertMinutesIntoSeconds() {
        minutes = 5;
        seconds = minutes * 60;
        System.out.println("The number of seconds in 5 minutes is: " + seconds);
    }

}
