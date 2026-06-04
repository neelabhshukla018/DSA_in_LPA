package ConditionalStatements;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {

        Scanner userip=new Scanner(System.in);

        System.out.print("Enter Your Age Sir/Mam: ");

        int age=userip.nextInt();

        //Check if it is eligible to vote or not

        if(age>=18){
            System.out.println("Hurrah! You are Eligible to Vote Dear...");
        }

        else {
            System.out.println("Oops! You are not Eligible to Vote..");
        }
    }
}
