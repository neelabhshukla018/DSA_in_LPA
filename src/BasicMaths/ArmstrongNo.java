package BasicMaths;

import java.util.Scanner;

public class ArmstrongNo {
    public static void main(String[] args) {
        Scanner userip = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = userip.nextInt();

        //this is written beacuse afte loop num changes so for checking
        //we have to keep it safe
        int original=num;

        int sum=0;

        while(num>0){
            //extract last digit
            int digit=num%10;
            sum+=(digit*digit*digit);

            //remove last digit
            num=num/10;
        }

        if(original==sum){
            System.out.println("Is an Armstrong number");
        }

        else {
            System.out.println("Is not an Armstrong number");
        }

    }
}
