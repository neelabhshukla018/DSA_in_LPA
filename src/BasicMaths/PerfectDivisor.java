package BasicMaths;

import java.util.Scanner;

public class PerfectDivisor {
    public static void main(String[] args) {
        Scanner userip = new Scanner(System.in);

        System.out.print("Enter the  number: ");
        int n = userip.nextInt();

        int original=n;
        int sum = 0;

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum +=i;
            }
        }

        if (sum == original) {
            System.out.println("Perfect Number");
        }
        else {
            System.out.println("Not Perfect Number");
        }

    }
}
