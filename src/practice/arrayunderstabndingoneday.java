package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class arrayunderstabndingoneday {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
//
//        int arr[]={1,2,3,4,5};
//        for(int x:arr){
//            System.out.print(x+" ");
//        }
//
//        System.out.println();
//
//        System.out.print("Enter the arr(size): ");
//        int n=sc.nextInt();
//        System.out.println();
//
//        System.out.print("Enter the array elements: ");
//
//        int a1[]=new int[n];
//        for(int i=0;i<a1.length;i++){
//            a1[i]= sc.nextInt();
//        }
//        for(int y:a1){
//            System.out.print(y+" ");
//
//        }
//        System.out.println();
//
//        int sum=0;
//        for(int z:a1){
//            sum+=z;
//        }
//        System.out.print(sum+" ");
//        System.out.println();
//
//        System.out.print(a1[0]);
//        System.out.println();
//        //last element
//        System.out.print(a1[a1.length-1]);
//        System.out.println();

        //takking the elements by taking the input

//        System.out.print(" Enter the size of an array: ");
//        int n= sc.nextInt();
//        System.out.println();
//
//
//        System.out.print("Enter the array elements: ");
//        int  arr[]=new int [n];
//        for(int i=0;i<arr.length;i++){
//            arr[i]= sc.nextInt();
//        }
//
//        //for printing
//        for(int x:arr){
//            System.out.print(x+" ");
//        }

        //taking string as input

//        System.out.print(" Enter the size of an array: ");
//        int n= sc.nextInt();
//        System.out.println();
//
//
//        System.out.print("Enter the array elements: ");
//        String  names[]=new String [n];
//        for(int i=0;i<names.length;i++){
//            names[i]= sc.next();
//        }
//
//        //for printing
//        for(String x:names){
//            System.out.print(x+" ");
//        }

//        for finding max elemet
//        int arr[]={1,2,3,4,5};
//
//        int max=arr[0];
//        int min=arr[0];
//        for(int y:arr){
//            if(y>max){
//                max=y;
//            }
//        }
//        System.out.print("The maximum element of an array is: " +max);
//        System.out.println();
//        for(int y:arr){
//            if(y<min){
//                min=y;
//            }
//        }
//        System.out.print("The minimum element of an array is: " +min);


        //reverse of an array using two pointers technique
//        int arr[]={1,2,3,4,5};
//
//        int start=0;
//        int end=arr.length-1;
//
//        while(start<end){
//            int temp=arr[start];
//            arr[start]=arr[end];
//            arr[end]=temp;
//            start++;
//            end--;
//        }
//        for (int x : arr) {
//            System.out.print(x + " ");
//        }


        //fill values of an array=
//        int a1[]=new int[10];
//        Arrays.fill(a1,69);
//                for (int x : a1) {
//            System.out.print(x + " ");
//        }


//if we want to insert any element after making the array
//        int[] arr = {1, 2, 3, 4, 5};
//
//        arr = Arrays.copyOf(arr, arr.length + 1);
//
//        arr[arr.length - 1] = 6;
//
//        System.out.println(Arrays.toString(arr));

        //if i want to insert an element at any particular pstn then
        //shift right takes place

//        int n = 5;
//
//        int a1[] = new int[6];
//
//        a1[0] = 1;
//        a1[1] = 2;
//        a1[2] = 3;
//        a1[3] = 4;
//        a1[4] = 5;
//
//        int element = 96;
//        int pstn = 3;
//
//        for (int i = n; i > pstn; i--) {
//            a1[i] = a1[i - 1];
//        }
//
//        a1[pstn] = element;
//
//        for (int x : a1) {
//            System.out.print(x + " ");
//        }


        //if i want to delete an element at any particular pstn then
        //shift right takes place

//        int n = 5;
//
//        int a1[] = new int[6];
//
//        a1[0] = 1;
//        a1[1] = 2;
//        a1[2] = 3;
//        a1[3] = 4;
//        a1[4] = 5;
//
//        int pstn = 3;
//
//        //this is the logic behind this
//        for (int i = pstn; i <n-1; i++) {
//            a1[i] = a1[i + 1];
//        }
//
//        for (int x : a1) {
//            System.out.print(x + " ");
//        }


  //for linear search
        int arr[]={10,20,30,40,50};

        int key=30;
        int idx=-1;

        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]==key){
                idx=i;
                break;
            }
        }
        if(idx!=-1){
            System.out.print("Element found at index: " +idx);
        }
        else {
            System.out.print("Element did not found");
        }






    }
}
