package BasicMaths;

import java.util.Scanner;

public class sumofdigit {
    public static void main(String[] args) {
        Scanner userip=new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num=userip.nextInt();

        int sum=0;

        while(num>0){

            //extracted last digit
            int digit=num%10;
            sum+=digit;

            //remove last digit
            num=num/10;
        }
        System.out.println("sum of the numbers are: " +sum);

    }
}
