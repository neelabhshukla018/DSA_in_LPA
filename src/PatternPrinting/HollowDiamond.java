package PatternPrinting;

import java.util.Scanner;

public class HollowDiamond {
    public static void main(String[] args) {
        Scanner userip = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = userip.nextInt();


        for (int row = 1; row <= n; row++) {

            for (int col = 1; col <= n - row; col++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * row - 1; k++) {
                if (k == 1 || k == 2 * row - 1) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


        //Bottom Part
        for (int row = n - 1; row >= 1; row--) {//change in only this line

            for (int col = 1; col <= n - row; col++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * row - 1; k++) {
                if (k == 1 || k == 2 * row - 1) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
