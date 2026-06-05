package PatternPrinting;

import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner userip = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = userip.nextInt();

        for (int row = 0; row < n; row++) {

            // Spaces
            for (int col = 0; col < n - row; col++) {
                System.out.print("  ");
            }

            int num = 1;

            // Pascal's values
            for (int col = 0; col <= row; col++) {
                System.out.print(num + "   ");

                num = num * (row - col) / (col + 1);
            }

            System.out.println();
        }
    }
}
