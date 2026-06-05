package PatternPrinting;

import java.util.Scanner;

public class HollowPyramid {
    public static void main(String[] args) {
        Scanner userip = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = userip.nextInt();

        for (int row = 1; row <= n; row++) {

            // Print spaces before stars
            for (int col = 1; col <= n - row; col++) {
                System.out.print(" ");
            }

            // Print stars and spaces for the pyramid's edges
            for (int k = 1; k <= 2 * row - 1; k++) {
                if (k == 1 || k == 2 * row - 1 || row == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
