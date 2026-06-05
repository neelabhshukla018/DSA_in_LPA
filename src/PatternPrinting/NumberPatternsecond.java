package PatternPrinting;

import java.util.Scanner;

public class NumberPatternsecond {
    public static void main(String[] args) {
        Scanner userip = new Scanner(System.in);

        System.out.print("Enter The Row Number: ");
        int n = userip.nextInt();

        int count=1;
        for(int row=1; row<=n;row++){


            for(int col=1; col<=row; col++){
                System.out.print(count +" ");
                count++;

            }


            System.out.println();
        }
    }
}
