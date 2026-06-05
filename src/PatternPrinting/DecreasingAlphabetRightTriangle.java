package PatternPrinting;

import java.util.Scanner;

public class DecreasingAlphabetRightTriangle {

    public static void main(String[] args) {
        Scanner userip = new Scanner(System.in);

        System.out.print("Enter The Number: ");
        int n = userip.nextInt();


        for (int row = 1; row <= n; row++) {

            char ch = 'E';  // Starting alphabet

            for (int col = 1; col <=row; col++) {
                System.out.print(ch + " ");
//                ch++;  //if we want only E

                ch--;//if we want E D C B A for reversing printing
            }

            System.out.println();
        }

    }
}