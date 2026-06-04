package Loops;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {

        Scanner userip = new Scanner(System.in);

        System.out.print("Enter the Number: ");
        int num = userip.nextInt();

        // Uncomment if you want a simple while loop
        // while (num < 5) {
        //     num += 1;
        //     System.out.println("You can do it buddy!");
        // }

        // Nested while loop
        while (num <= 5) {
            int j = 1;
            while (j <= 5) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            num++; // Increment outer loop variable to avoid infinite loop
        }

        userip.close();
    }
}
