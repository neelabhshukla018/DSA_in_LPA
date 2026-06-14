package ARRAYS;

import java.util.Arrays;
import java.util.Scanner;

public class onedarrayunderstanding {
    public static void main(String[] args) {

        Scanner userip=new Scanner(System.in);

        System.out.println("Enter the size of an array: ");
        int n=userip.nextInt();
        int [] a1=new int[n+1];

        System.out.println();

        //for taking input of elements
        System.out.println("Enter the elements: ");
        for(int i=0;i< a1.length;i++){
            a1[i]=userip.nextInt();
        }
        System.out.println();
        //for printing of elements
        System.out.println("Printing of user's input array: ");
        for(int x: a1){
            System.out.print(x+" ");
        }
//
//
//        System.out.println();
        System.out.println();
//===============================================================
        //Declration
//        int [] arr=new int[5];
//        arr[0]=10;
//        arr[1]=20;
//        arr[2]=30;
//        arr[3]=40;
//        arr[4]=50;
//
//        System.out.println("Printing of manual input array: ");
//        for(int y:arr){
//            System.out.print(y+" ");
//        }
//
//        System.out.println();

        //direct entering
//        int [] a2={2,4,6,8,10};
//
//        System.out.println("Direct initialziation array: ");
//        for(int y:a2){
//            System.out.print(y+" ");
//        }

        //length of an array
//        System.out.print("The length of an array is: " +arr.length);
//
//        System.out.println();
//
//        //Accessing elements
//        System.out.print("First element: " +arr[0]);//last element
//        System.out.println();
//        System.out.print("Last element: " +arr[arr.length-1]);//last element
//
//        System.out.println();
//
//        //update element
//        arr[0]=100;
//        System.out.println("After updating the array: ");
//        for(int y:arr){
//            System.out.print(y+" ");
//        }
//
//        System.out.println();
//
//        //sum of an array
//        System.out.print("Sum of an array is: ");
//        int sum=0;
//        for(int y:arr){
//            sum+=y;
//        }
//        System.out.println(sum);
//
//        System.out.println();
//
//        //average of an array
//        double avg=(double) sum/ arr.length;
//        System.out.println("Average = " + avg);
//
//
//        //maximum element
//        int max=arr[0];
//        for(int y:arr){
//            if(y>max)
//                max=y;
//        }
//        System.out.print("Maximum element is: " +max);
//
//        System.out.println();
//        //minimum element
//        int min=arr[0];
//        for(int y:arr){
//            if(y<min)
//                min=y;
//        }
//        System.out.print("Minimum element is: " +min);
//
//        System.out.println();

        //Linear search
//        int key = 40;
//        int index = -1;
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == key) {
//                index = i;
//                break;
//            }
//        }
//
//        if (index != -1) {
//            System.out.println("Element found at index: " + index);
//        } else {
//            System.out.println("Element not found");
//        }

        //Binary search
//        int key=40;
//        int low = 0;
//        int high = arr.length - 1;
//        int index = -1;
//
//        while (low <= high) {
//            int mid = (low + high) / 2;
//
//            if (arr[mid] == key) {
//                index = mid;
//                break;
//            }
//
//            else if (key < arr[mid]) {
//                high = mid - 1;
//            }
//
//            else {
//                low = mid + 1;
//            }
//        }
//
//        if (index != -1) {
//            System.out.println("Element found at index: " + index);
//        }
//        else {
//            System.out.println("Element not found");
//        }


//        //copy array
//        int [] a3=arr.clone();
//        System.out.print("Copied array: ");
//        for(int z:a3){
//            System.out.print(z+" ");
//        }
//
//
//        System.out.println();
//
//        //compare of an array
//        System.out.println("Arrays are equals? :" +Arrays.equals(arr,a3));
//
//        System.out.println();
//        //Reverse an array
//
//        System.out.print("Before reversed order: ");
//        for(int br:arr){
//            System.out.print(br+" ");
//        }
//        System.out.println();
//
//        //Reverse an array
//      int start=0;
//      int end=a3.length-1;
//
//      while(start<end){
//          int tmp=arr[start];
//          arr[start]=arr[end];
//          arr[end]=tmp;
//          start++;
//          end--;
//      }
//
//        System.out.print("Array in reversed order: ");
//        for(int r:arr){
//            System.out.print(r+" ");
//        }
//
//        System.out.println();
//        //sorted an array
//        System.out.print("Sorted array is: ");
//        Arrays.sort(arr);
//        for(int s:arr){
//            System.out.print(s+" ");
//        }
//
//        System.out.println();
//
//        //fill values
//        System.out.print("After filled values in array: ");
//        int [] a4=new int[10];
//        Arrays.fill(a4,69);
//
//        for(int fa:a4){
//            System.out.print(fa+" ");
//        }
//
//        System.out.println();
//
//        //arrays to string
//        System.out.print("Array----> To string: " +Arrays.toString(arr));


        //insert element at any particular position

        int element=96;
        int position=4;
        // Shift elements to the right
        for (int i = n; i > position; i--) {
            a1[i] = a1[i - 1];
        }

        // Insert the element
        a1[position] = element;
        n++;

        // Print array
        System.out.print("Array after insertion: ");
        for(int x:a1){
            System.out.print(x+" ");
        }

        System.out.println();
        // Delete element from a particular position

        int pos = 4;   // Index to delete

// Shift elements to the left
        for (int i = pos; i < n - 1; i++) {
            a1[i] = a1[i + 1];
        }

        n--;

// Print array after deletion
        System.out.print("Array after deletion: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a1[i] + " ");
        }











    }
}
