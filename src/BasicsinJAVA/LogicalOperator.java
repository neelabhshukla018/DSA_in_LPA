package BasicsinJAVA;

import java.util.Scanner;

public class LogicalOperator {
    public static void main(String[] args) {

        Scanner userip=new Scanner(System.in);

        System.out.print("Enter first Operand: ");
        float a= userip.nextInt();

        //if a=18


        //AND- && operator   Return true if both conditions are true
        System.out.println(a%2==0 && a%3==0);//true
        System.out.println();
        System.out.println(a%3==0 && a%7==0);//false

        System.out.println();
        //OR- || operator   Return true if any one condition are true
        System.out.println(a%2==0 || a%3==0);//true
        System.out.println();
        System.out.println(a%3==0 || a%7==0);//true

        System.out.println();
        // Logical NOT - ! operator: Negates the condition
        System.out.println(!(a % 2 == 0));



    }
}
