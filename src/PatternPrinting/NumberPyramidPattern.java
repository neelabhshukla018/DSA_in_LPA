package PatternPrinting;

import java.util.Scanner;

public class NumberPyramidPattern {
    public static void main(String[] args) {
        Scanner userip = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = userip.nextInt();

        for(int row=1;row<=n;row++){

            //PART1--Spaces
            for (int col = 0; col <n-row ; col++) {
                System.out.print(" ");

            }

            //part2- numbers
            for (int k = 0; k <2*row-1 ; k++) {
                System.out.print(row + " ");
            }

            System.out.println();

        }

    }
}
