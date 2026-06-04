package PatternPrinting;

import java.util.Scanner;

public class SolidAlphabet {
    public static void main(String[] args) {

        Scanner userip= new Scanner(System.in);

        System.out.print("Enter The Row Number: ");
        int row = userip.nextInt();

        System.out.print("Enter The Column Number: ");
        int column = userip.nextInt();

        // Solid rectangle pattern with alphabets
        for(int i=0; i<row; i++) {
            char ch = 'A'; // Starting alphabet
            for(int j=0; j<column; j++) {
                System.out.print(ch + " ");
            //if you want to print like this don't use ch++
            // A A A A
            //A A A A
            //A A A A

                ch++; // Move to next alphabet
                // A B C D
                //A B C D
                //A B C D
            }
            System.out.println();
        }


    }
}
