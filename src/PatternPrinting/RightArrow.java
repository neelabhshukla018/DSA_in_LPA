package PatternPrinting;

import java.util.Scanner;

public class RightArrow {
    public static void main(String[] args) {
        Scanner userip= new Scanner(System.in);

        System.out.print("Enter The Row Number: ");
        int n = userip.nextInt();

        // Part 1: Increasing right-aligned pattern
        for(int row=1; row<=n; row++){
            // Print spaces
            for(int space=1; space<=n - row; space++){
                System.out.print(" ");
            }
            // Print stars
            for(int col=1; col<=row; col++){
                System.out.print("*");
            }
            System.out.println();
        }

// Part 2: Decreasing right-aligned pattern
        for(int row=1; row<=n; row++){
            // Print spaces
            for(int space=1; space<row; space++){
                System.out.print(" ");
            }
            // Print stars
            for(int col=1; col<=n - row + 1; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
