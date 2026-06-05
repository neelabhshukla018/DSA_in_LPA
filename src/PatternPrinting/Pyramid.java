package PatternPrinting;

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner userip = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = userip.nextInt();

        for (int row = 1; row<=n; row++) {

            //for space---n-row
            for (int col = 1; col <=n-row; col++) {
                System.out.print(" ");
            }

            //for star(*) --- 2*row-1
            for (int k = 1; k <=2*row-1; k++) {
                System.out.print("*");
            }

                System.out.println();
            }


        }
    }

