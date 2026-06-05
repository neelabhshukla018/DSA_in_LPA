package PatternPrinting;

import java.util.Scanner;

public class RightAlphabetTriangle {
    public static void main(String[] args) {
        Scanner userip= new Scanner(System.in);

        System.out.print("Enter The Number: ");
        int n = userip.nextInt();


        for(int row=1; row<=n; row++) {

            char ch = 'A';  // Starting alphabet

            for(int col=1; col<=row; col++) {
                System.out.print(ch + " ");
//                ch++;  //if we want only A

                ch++;//if we want A B C D E
            }

            System.out.println();
        }


    }
}
