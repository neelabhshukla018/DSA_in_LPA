package BasicsinJAVA;


import java.util.Scanner;

public class AirthmeticOperator {
    public static void main(String[] args) {

        Scanner userip=new Scanner(System.in);

        System.out.print("Enter first Operand: ");
        float a= userip.nextInt();
        System.out.print("Enter Second Operand: ");
        float b= userip.nextInt();

        System.out.print("Result of Addition is: " +(a+b) );
        System.out.println();
        System.out.print("Result of Subtraction is: " +(a-b));
        System.out.println();
        System.out.print("Result of Multiplication is: " +(a*b));
        System.out.println();
        System.out.print("Result of Division is: " +(a/b));
        System.out.println();
        System.out.print("Result of Modulus is: " +(a%b));
        System.out.println();



    }
}
