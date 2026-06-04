package ConditionalStatements;

import java.util.Scanner;

public class IfElseLadder {
    public static void main(String[] args) {

        Scanner userip = new Scanner(System.in);

        System.out.print("Enter Your Marks: ");
        int marks = userip.nextInt();

        if (marks >= 90) {
            System.out.println("Excellent!");
        }
        else if (marks >= 75) {
            System.out.println("Good");
        }
        else if (marks >= 60) {
            System.out.println("Average");
        }
        else if (marks >= 50) {
            System.out.println("Pass");
        }
        else {
            System.out.println("Fail");
        }

    }
}


//Certainly! Here's an explanation of the flow of your nested if-else code:
//
//User Input:
//
//The program prompts the user with "Enter Your Marks: ".
//The user enters an integer value, which is stored in the variable marks.
//
//
//First Condition (if (marks >= 90)):
//
//Checks if the marks are greater than or equal to 90.
//If true, it prints "Excellent!" and the program ends.
//
//
//Second Condition (else if (marks >= 75)):
//
//Executed only if the first condition is false.
//Checks if marks are greater than or equal to 75.
//If true, it prints "Good".
//
//
//Third Condition (else if (marks >= 60)):
//
//Executed if previous conditions are false.
//Checks if marks are greater than or equal to 60.
//If true, it prints "Average".
//
//
//Fourth Condition (else if (marks >= 50)):
//
//Executed if all above are false.
//Checks if marks are greater than or equal to 50.
//If true, it prints "Pass".
//
//
//Else Clause (else):
//
//If none of the above conditions are met (marks less than 50), it prints "Fail".