package BasicMaths;

import java.util.Scanner;

public class NoOfEvendigits {
    public static void main(String[] args) {
        Scanner userip=new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num=userip.nextInt();

        int count=0;

        while(num>0){
            if(num%2==0) {
                count++;
            }

            //remove last digit
            num=num/10;
        }
        System.out.print(count);
    }
}
