package PatternPrinting;

import java.util.Scanner;

public class ZigZag {
    public static void main(String[] args) {
        Scanner userip = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = userip.nextInt(); //n=9



        for (int row = 1; row <= 3; row++) {

            for (int col = 1; col <= n; col++) {


//Upper and lower peaks ---> (row + col) % 4 == 0
//Middle connecting points----> row == 2 && col % 4 == 0

         if ((row + col) % 4 == 0 || (row == 2 && col % 4 == 0)) {
                    System.out.print("❤");
                }

         else {
                    System.out.print(" ");
                }

         }
            System.out.println();
     }

    }
}
