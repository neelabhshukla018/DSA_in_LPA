package BasicMaths;

import java.util.Scanner;

public class primeno1toN {
    public static void main(String[] args) {


        Scanner userip = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = userip.nextInt();

        for (int i = 2; i <= num; i++) {
            boolean isPrime = true;

            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}
