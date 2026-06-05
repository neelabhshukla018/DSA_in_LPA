package PatternPrinting;

import java.util.Scanner;

public class ReverseHollowPyramid {
    public static void main(String[] args) {
        Scanner userip = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = userip.nextInt();

        for (int row = 1; row<=n; row++) {

            //part1
                for (int col = 1; col <= row-1; col++) {
                    System.out.print("  ");
            }


//================================================================
                //part2
            if(row==1 || row==n){

                for (int k = 1; k <= (2*n-2*row+1); k++) {
                    System.out.print("* ");
                }

            }
//=part2---inside part2
            else{
                //1*
                System.out.print("* ");

                //for that space between
                for (int m = 1; m <=2*n-2*row-1 ; m++) {
                    System.out.print("  ");
                }
                //1*
                System.out.print("* ");

            }

            System.out.println();
        }


    }
}
