package DataTypesExercises;

import org.testng.annotations.Test;

//Calculate the Volume of a Cylinder
//Initialize two doubles radius and height for a cylinder.
// Calculate and print the volume of the cylinder (use Math.PI for π).
public class TheVolumeOfaCylinder {

    //Initialize two doubles for the radius and height of the cylinder
    public double radius;
    public double height;

    //Create a method to calculate the volume of the cylinder
    @Test
    public void calculateTheVolumeOfACylinder() {
        radius = 5;
        height = 10;
        double volume = Math.PI * radius * radius * height;
        System.out.println("The volume of the cylinder is: " + volume);
    }

}
