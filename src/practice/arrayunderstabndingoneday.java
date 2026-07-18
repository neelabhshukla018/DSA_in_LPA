package practice;

import java.util.Arrays;
import java.util.Scanner;

public class arrayunderstabndingoneday {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int arr[]={1,2,3,4,5};
        for(int x:arr){
            System.out.print(x+" ");
        }

        System.out.println();

        System.out.print("Enter the arr(size): ");
        int n=sc.nextInt();
        System.out.println();

        System.out.print("Enter the array elements: ");

        int a1[]=new int[n];
        for(int i=0;i<a1.length;i++){
            a1[i]= sc.nextInt();
        }
        for(int y:a1){
            System.out.print(y+" ");

        }
        System.out.println();

        int sum=0;
        for(int z:a1){
            sum+=z;
        }
        System.out.print(sum+" ");
        System.out.println();

        System.out.print(a1[0]);
        System.out.println();
        //last element
        System.out.print(a1[a1.length-1]);
        System.out.println();

















    }
}
