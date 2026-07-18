package practice;

import java.util.Scanner;

public class basicmaths {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num=sc.nextInt();

        //printing of numbers
//        while(num!=0){
//            int digit=num%10;
//             num=num/10;
//            System.out.print(digit);
//        }

        //sum of a digit
//        int sum=0;
//        while(num>0){
//            int digit=num%10;
//            num=num/10;
//            sum+=digit;
//        }
//        System.out.print("sum of numbers is: " +sum);


        //count of numbers
//        int count=0;
//        while(num!=0){
//            num=num/10;
//            count++;
//        }
//        System.out.print("count of numbers is: " +count);

        //reverse of numbers
//        int rev=0;
//        while(num!=0){
//            int digit=num%10;
//            rev=rev*10+digit;
//            num=num/10;
//        }
//        System.out.print("reverse of a numbers is: "+rev);


        //factorial of number
//        int fact=1;
//        for(int i=1;i<=num;i++){
//            fact=fact*i;
//        }
//        System.out.print("factorrial of a number is: " +fact);


        //power of a number
//        int pow=1;
//        int a=2; int b=3;
//        for(int i=1;i<=b; i++){
//            pow=pow*a;
//        }
//        System.out.print("power of a number is: "+pow);


        //palindrone of numbers
//        int rev=0;
//        int original=num;
//        while(num!=0){
//            int digit=num%10;
//            rev=rev*10+digit;
//            num=num/10;
//        }
//       if(original==rev){
//           System.out.print("palindrone");
//       }
//
//       else{
//           System.out.print("not a palindrone");
//       }


        //prime number
//        boolean prime=true;
//
//        for(int i=2;i*i<=num;i++){
//            if(num%i==0){
//                prime=false;
//                break;
//            }
//        }
//        System.out.print(prime);


        //prime number from 1-n

//        for (int i = 2; i <=num ; i++) {
//            boolean prime=true;
//            for(int j=2;j*j<=i;j++){
//                if(i%j==0){
//                    prime=false;
//                    break;
//                }
//            }
//            if(prime){
//                System.out.print(i+" ");
//            }
//        }


        //GCD and Lcm
//        int a=12;
//        int b=18;
//
//        int x=a;//for lcm
//        int y=b;//for lcm
//
//        while(b!=0){
//           int temp=b;
//           b=a%b;
//           a=temp;
//        }
//        System.out.print(a);
//        System.out.println();
//
//        int lcm=(x*y)/a;
//        System.out.print(lcm);

        //armstrong number
        int original=num;
        int sum=0;

        while(num>0){
            int digit=num%10;
            sum+=(digit*digit*digit);
            num=num/10;
        }
        if(original==sum){
            System.out.print("Armstrong no");
        }

        else {
            System.out.print("Not Armstrong no");
        }



    }
}
