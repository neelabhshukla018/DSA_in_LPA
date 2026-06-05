package PatternPrinting;

import java.util.Scanner;

public class AlphabetReversingPyramid {
    public static void main(String[] args) {
        Scanner userip = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = userip.nextInt();


        for (int row = 1; row <= n; row++) {


            //PART-1================
            for (int col = 1; col <= n - row; col++) {
                System.out.print(" ");
            }


            //PART2-================
            char ch='A';
            for (int col = 1; col <= row; col++) {
                System.out.print(ch + " ");
                ch++;

            }


            //PART3-================
            ch -= 2;
            for (int col = row - 1; col >= 1; col--) { //just reverse them
                System.out.print(ch + " ");
                ch--;
            }


            System.out.println();

        }

    }
}
