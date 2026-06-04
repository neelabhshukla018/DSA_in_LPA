package BasicsinJAVA;

import java.util.Scanner;

public class RelationalOperator {
    public static void main(String[] args) {
        Scanner userip=new Scanner(System.in);

        System.out.print("Enter first Operand: ");
        float a= userip.nextInt();

        System.out.print("Enter Second Operand: ");
        float b= userip.nextInt();


        //if a=6  b=4
        System.out.println(a==b);//false
        System.out.println();
        System.out.println(a!=b);//true
        System.out.println();
        System.out.println(a>=b);//true
        System.out.println();
        System.out.println(a<=b);//false
        System.out.println();
        System.out.println(a>b);//true
        System.out.println();
        System.out.println(a<b);//false


}
}