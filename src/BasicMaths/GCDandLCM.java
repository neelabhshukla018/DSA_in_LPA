package BasicMaths;

import java.util.Scanner;

public class GCDandLCM {
    public static void main(String[] args) {
        Scanner userip = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = userip.nextInt();

        System.out.print("Enter the second number: ");
        int b = userip.nextInt();

        int x=a;
        int y=b;

        //Euclidean Algorithm
        //GCD(a, b) = GCD(b, a % b)

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        System.out.println("GCD = " + a);
  //============================================================
        //LCM*GCD=(a*b)
        int lcm = (x * y) / a;
        System.out.println(lcm);


    }
}
