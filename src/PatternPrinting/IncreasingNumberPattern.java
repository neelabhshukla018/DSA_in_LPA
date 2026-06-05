package PatternPrinting;

import java.util.Scanner;

public class IncreasingNumberPattern {
    public static void main(String[] args) {
        Scanner userip = new Scanner(System.in);

        System.out.print("Enter The Row Number: ");
        int n = userip.nextInt();


        for(int row=1; row<=n;row++){

            for(int col=1; col<=row; col++){
                System.out.print(col +" ");

            }

            System.out.println();
        }


    }
}
