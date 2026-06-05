package PatternPrinting;

import java.util.Scanner;

public class LeftArrow {
    public static void main(String[] args) {
        Scanner userip= new Scanner(System.in);

        System.out.print("Enter The Row Number: ");
        int n = userip.nextInt();

        //part1
        for(int row=1; row<=n;row++){
            for(int col=1; col<=row; col++){
                System.out.print("*");
            }


            System.out.println();
        }

        //part4
        for(int row=1; row<=n; row++){
            for(int col=1; col<=n-row+1; col++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
