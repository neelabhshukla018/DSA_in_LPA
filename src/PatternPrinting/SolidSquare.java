package PatternPrinting;

import java.util.Scanner;

public class SolidSquare {
    public static void main(String[] args) {
        Scanner userip= new Scanner(System.in);

        System.out.print("Enter The  Number: ");
        int n =userip.nextInt();





        //Solid Square pattern logic
        for(int row=0;row<=n;row++){
            for(int col=0;col<n+1;col++){
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}
