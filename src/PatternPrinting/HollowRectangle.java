package PatternPrinting;

import java.util.Scanner;

public class HollowRectangle {

    public static void main(String[] args) {
        Scanner userip = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = userip.nextInt();

        for (int row = 1; row <= n; row++) {

            for (int col = 1; col <= n; col++) {

                if (row == 1 || row == n || col == 1 || col == n) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }


    }
}