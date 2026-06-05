package PatternPrinting;

import java.util.Scanner;

public class SolidAlphabet {
    public static void main(String[] args) {

        Scanner userip= new Scanner(System.in);

        System.out.print("Enter The Number: ");
        int n = userip.nextInt();



        // Solid rectangle pattern with alphabets

            // Starting alphabet

            //if you want to print like this don't use ch++
            // A A A A
            //A A A A
            //A A A A

          // Move to next alphabet use (ch++;)
         // A B C D
         //A B C D
         //A B C D

//=============================================================
        // Solid rectangle pattern with alphabets

        for(int row=1; row<=n; row++) {
            char ch = 'A';  // Starting alphabet
            for(int col=1; col<=n; col++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }

    }
}
