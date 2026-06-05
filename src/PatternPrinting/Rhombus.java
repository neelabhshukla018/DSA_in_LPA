package PatternPrinting;

import java.util.Scanner;

public class Rhombus {
    public static void main(String[] args) {
        Scanner userip = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = userip.nextInt();

//        *****
//       *****
//     *****
//   ***** 5c,5r

        for (int row = 1; row < n; row++){

            //for spaces
            for (int col = 1; col < n - row; col++) {

                System.out.print(" ");
            }

            //for star
            for (int k = 0; k < n; k++) {
                System.out.print("*");
            }

            System.out.println();
        }


    }
}
