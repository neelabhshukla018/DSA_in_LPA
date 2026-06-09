package BasicMaths;

import java.util.Scanner;

public class Reverseofnumber {
    public static void main(String[] args) {
        Scanner userip=new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num=userip.nextInt();

        int rev=0;

        while(num>0){

            //extracted last digit
            int digit=num%10;

            //multiply 10 so that it shift toward left make space for right
            rev=rev*10+digit;

            //remove last digit
            num=num/10;
        }
        System.out.println("Reverse of the number is: " +rev);
    }
}
