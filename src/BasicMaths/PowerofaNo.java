package BasicMaths;

import java.util.Scanner;

public class PowerofaNo {
    public static void main(String[] args) {
        Scanner userip = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = userip.nextInt();

        System.out.print("Enter the second number: ");
        int b = userip.nextInt();

        int pow = 1;

        for (int i = 1; i <= b; i++) {
            pow = pow * a;
        }

        System.out.println("Power = " + pow);
    }
}
