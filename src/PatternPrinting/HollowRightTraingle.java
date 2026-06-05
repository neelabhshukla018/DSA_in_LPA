package PatternPrinting;
import java.util.Scanner;
public class HollowRightTraingle {

    public static void main(String[] args) {

        Scanner userip = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = userip.nextInt();

//        for (int row = 1; row <= n; row++) {
//
//            for (int col = 1; col <= row; col++) {
//
//                if (col == 1 || col == row || row == n) {
//                    System.out.print("* ");
//                }
//
//                else {
//                    System.out.print("  ");
//                }
//            }
//
//            System.out.println();
//        }


        for (int row = 1; row <= n; row++) {

            if(row==1 || row==2 || row==n){
                for (int col = 1; col <= row; col++) {
                    System.out.print("* ");
                }
            }

            else{
                System.out.print("* ");

                for (int k =1; k <=(row-2); k++) {
                    System.out.print("  ");
                }

                System.out.print("* ");
            }

            System.out.println();
        }




    }
}
