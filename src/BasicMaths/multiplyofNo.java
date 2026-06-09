package BasicMaths;

import java.util.Scanner;

public class multiplyofNo {
    public static void main(String[] args) {
        Scanner userip=new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num=userip.nextInt();

        int mul=1;

        while(num>0){

            //extracted last digit
            int digit=num%10;
            mul*=digit;

            //remove last digit
            num=num/10;
        }
        System.out.println("Multiplication of the numbers are: " +mul);
    }
}
