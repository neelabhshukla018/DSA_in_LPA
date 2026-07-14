package practice;

import java.util.Scanner;

public class printofnumbers {

    public static void printofno(int num) {
        while (num != 0) {
            int digit = num % 10;
            System.out.print(digit);
            num = num / 10;
        }
    }

    public static void reverseofno(int num,int rev){
        while(num>0){
            int digit=num%10;
            rev=rev*10+digit;
            num=num/10;
        }
        System.out.print(rev);
    }


    public static void main(String[] args) {

        printofno(7896);

        reverseofno(12345,0);

    }
}
