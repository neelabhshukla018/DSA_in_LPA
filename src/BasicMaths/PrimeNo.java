package BasicMaths;

import java.util.Scanner;

public class PrimeNo {
    public static void main(String[] args) {

        Scanner userip = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = userip.nextInt();

        boolean prime = true;

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                prime = false;
                break;
            }
        }

        System.out.println(prime ? "Prime Number" : "Not a Prime Number");

    }
}
