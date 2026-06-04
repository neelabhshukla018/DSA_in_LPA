package Loops;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        Scanner userip=new Scanner(System.in);

        System.out.print("Enter the Number: ");
        int num=userip.nextInt();

        for(int i=1; i<num; i++){
            System.out.println(i);
        }


        //nested for loop
        for (int j = 0; j <num; j++) {
            for (int k = 0; k <num; k++) {
                System.out.print("* ");

            }
            System.out.println();
        }



    }
}
