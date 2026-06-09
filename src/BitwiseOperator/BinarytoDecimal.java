package BitwiseOperator;

import java.util.Scanner;

public class BinarytoDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Binary To Decimal
        System.out.print("Enter a Binary number: ");
        String BinaryNumber = sc.nextLine();

        //Integer.parseInt(BinaryNumber,2)
        int decimalFromBinary = Integer.parseInt(BinaryNumber,2);

        System.out.println("Decimal to Binary: " + decimalFromBinary);
    }
}
