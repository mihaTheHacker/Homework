package OperatorsIfBlocksAndSwitchBreakAndContinueExercises;

import org.testng.annotations.Test;
//Write a Java program that takes a score (e.g., 87) as input and assigns a grade based on the score (A for 90 and above, B for 80-89, C for 70-79, D for 60-69, and F for below 60) using if-else blocks.
// Print the grade

public class GradeCalculator {
@Test

public void gradeCalculator() {
    metodaGradeCalculator(87);
    metodaGradeCalculator(90);
    metodaGradeCalculator(80);
    metodaGradeCalculator(70);
    metodaGradeCalculator(60);
    metodaGradeCalculator(59);
}

    public void metodaGradeCalculator(int score) {
        if (score >= 90) {
            System.out.println("Valoarea " + score + "este: A");
        } else if (score >= 80) {
            System.out.println("Valoarea " + score + "este: B");
        } else if (score >= 70) {
            System.out.println("Valoarea " + score + "este: C");
        } else if (score >= 60) {
            System.out.println("Valoarea " + score + "este: D");
        } else {
            System.out.println("Valoarea " + score + "este: F");
        }
    }
}
