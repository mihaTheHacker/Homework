package OperatorsIfBlocksAndSwitchBreakAndContinueExercises;

import org.testng.annotations.Test;

//Create a program that demonstrates the use of compound assignment operators like +=, -=, *=, and /= with some integers. Print the result after each operation to see the effect.
public class CompoundAssignmentOperatorsExercise {

    //defining the variables and the expected results
    int a = 50;
    int b = 10;
    //defining the variables to store the results
    public int compoundAdditionTotal;
    public int compoundSubtractionTotal;
    public int compoundMultiplicationTotal;
    public int compoundDivisionTotal;
    public int compoundModulusTotal;

    //urmeaza metoda de test
    @Test
    public void compoundAssignmentOperators() {
        //adding the values of a and b and storing the result in compoundAdditionTotal
        compoundAdditionTotal = a;
        compoundAdditionTotal += b;
        System.out.println("The result of the compound addition is: " + compoundAdditionTotal);

        //subtracting the values of a and b and storing the result in compoundSubtractionTotal
        compoundSubtractionTotal = a;
        compoundSubtractionTotal -= b;
        System.out.println("The result of the compound subtraction is: " + compoundSubtractionTotal);

        //multiplying the values of a and b and storing the result in compoundMultiplicationTotal
        compoundMultiplicationTotal = a;
        compoundMultiplicationTotal *= b;
        System.out.println("The result of the compound multiplication is: " + compoundMultiplicationTotal);

        //dividing the values of a and b and storing the result in compoundDivisionTotal
        compoundDivisionTotal = a;
        compoundDivisionTotal /= b;
        System.out.println("The result of the compound division is: " + compoundDivisionTotal);

        // calculate the modulus of a and b and store the result in compoundModulusTotal
        compoundModulusTotal = a;
        compoundModulusTotal %= b;
        System.out.println("The result of the compound modulus is: " + compoundModulusTotal);

    }
}
