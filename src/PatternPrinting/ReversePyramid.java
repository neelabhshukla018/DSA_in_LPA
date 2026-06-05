package PatternPrinting;

import java.util.Scanner;

public class ReversePyramid {

    public static void main(String[] args) {
        Scanner userip = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = userip.nextInt();

        for (int row = 1; row<=n; row++) {

            //for space---n-row
            for (int col = 1; col <=row-1; col++) {
                System.out.print(" ");
            }

            //for star(*) --- 2*n-row-(row-1)= 2*n-2row+1
            //row-1=space
            for (int k = 1; k <=2*n-row-(row-1); k++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }
}
