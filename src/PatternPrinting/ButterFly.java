package PatternPrinting;

import java.util.Scanner;

public class ButterFly {
    public static void main(String[] args) {
        Scanner userip = new Scanner(System.in);

        System.out.print("Enter The Row Number: ");
        int n = userip.nextInt();


        for (int row = 1; row <= n; row++) {

            //PART-1-------------------------
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }

            //PART-2----------------------------
            for (int k = 1; k <= 2 * (n - row); k++) {
                System.out.print(" ");
            }


            //PART-3----------------------------
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }

            System.out.println();

        }

        //BOTTOM HALF SYMMETRY-----------------------------

        for (int row = 1; row <= n; row++) {

            //PART-4----------------------------
            for (int col = 1; col <=n-row+1; col++) {
                System.out.print("*");
            }

            //PART-5----------------------------
            for (int k = 1; k <= 2 * (row-1); k++) {
                System.out.print(" ");
            }

            //PART-6----------------------------
            for (int p = 1; p <=(n-row+1); p++) {
                System.out.print("*");
            }



            System.out.println();
        }


    }
}
