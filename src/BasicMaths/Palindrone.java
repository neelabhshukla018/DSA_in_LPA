package BasicMaths;

import java.util.Scanner;

public class Palindrone {

    public static void main(String[] args) {
        Scanner userip=new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num=userip.nextInt();

        int original=num;

        int rev=0;

        while(num>0){
            //extract last digit
            int digit=num%10;

            //help to reverse the no
            rev=rev*10+digit;

            //remove last digit
            num=num/10;
        }


        if(original==rev){
            System.out.print("num is a Palindrone");
        }

        else {
            System.out.print("num is not a Palindrone");
        }
    }
}
