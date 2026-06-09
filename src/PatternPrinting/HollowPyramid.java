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

            if (row == 1 || row == n) {
                for (int k = 1; k <= 2 * row - 1; k++) {
                    System.out.print("*");
                }
            }

            else{
                System.out.print("*");

                for (int m = 1; m <=2*row-3 ; m++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();

        }



/*   for (int row = 1; row<=n; row++) {

            //part1
                for (int col = 1; col <= n-row; col++) {
                    System.out.print("  ");
            }


//================================================================
                //part2
            if(row==1 || row==n){

                for (int k = 1; k <=2*row-1 ; k++) {
                    System.out.print("* ");
                }

            }
//=part2---inside part2
            else{
                //1*
                System.out.print("* ");

                //for that space between
                for (int m = 1; m <=2*row-3 ; m++) {
                    System.out.print("  ");
                }
                //1*
                System.out.print("* ");

            }

            System.out.println();
        }*/






    }
}
