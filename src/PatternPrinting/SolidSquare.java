package PatternPrinting;

import java.util.Scanner;

public class SolidSquare {
    public static void main(String[] args) {
        Scanner userip= new Scanner(System.in);

        System.out.print("Enter The Row Number: ");
        int row =userip.nextInt();


        System.out.print("Enter The Column Number: ");
        int column =userip.nextInt();


        //Solid Square pattern logic
        for(int i=0;i<=row;i++){
            for(int j=0;j<=column;j++){
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}
