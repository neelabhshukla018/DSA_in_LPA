package PatternPrinting;

import java.util.Scanner;

public class SolidRectangle {
    public static void main(String[] args) {

        Scanner userip= new Scanner(System.in);

        System.out.print("Enter The Number: ");
        int n =userip.nextInt();



        //Solid Rectangle pattern logic
        for (int row = 1; row <=n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
