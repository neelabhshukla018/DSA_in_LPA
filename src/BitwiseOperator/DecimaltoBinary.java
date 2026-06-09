package BitwiseOperator;

import java.util.Scanner;

public class DecimaltoBinary {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Decimal to Binary
        System.out.print("Enter a decimal number: ");
        int decimalNumber = sc.nextInt();

        //Integer.toBinaryString(decimalNumber)
        String binaryFromDecimal = Integer.toBinaryString(decimalNumber);

        System.out.println("Decimal to Binary: " + binaryFromDecimal);
    }
}
