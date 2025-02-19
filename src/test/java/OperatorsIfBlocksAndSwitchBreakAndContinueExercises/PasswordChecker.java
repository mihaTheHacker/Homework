package OperatorsIfBlocksAndSwitchBreakAndContinueExercises;

//Implement a simple password strength checker in Java. If the password length is less than 8 characters, print "Weak Password".
// If it has 8 or more characters but doesn't contain any number, print "Moderate Password". If it meets both conditions, print "Strong Password".

import org.testng.annotations.Test;

public class PasswordChecker {

    @Test
    public void passwordChecker() {
        metodaPasswordChecker();
    }

    public String password = "passwordTralala";
    public int passwordLength = password.length();

    public void metodaPasswordChecker() {
        if (passwordLength < 8) {
            System.out.println("Weak Password");
        } else if (passwordLength >= 8 && password.matches(".*\\d.*")) {
            System.out.println("Strong Password");
        } else {
            System.out.println("Moderate Password");
        }
    }


}
