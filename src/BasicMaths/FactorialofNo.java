package BasicMaths;

import java.util.Scanner;

public class FactorialofNo {
    public static void main(String[] args) {
        Scanner userip = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = userip.nextInt();


        int fact=1;

        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        System.out.println(fact);
    }
}
