package ARRAYS;

import java.util.Scanner;
import java.util.Arrays;

public class oneDArrayAllOperations {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ==============================
        // 1. User Input
        // ==============================
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // ==============================
        // 2. Display using Enhanced Loop
        // ==============================
        System.out.println("\nArray Elements:");
        for(int x : arr) {
            System.out.print(x + " ");
        }

        // ==============================
        // 3. Length of Array
        // ==============================
        System.out.println("\n\nLength = " + arr.length);

        // ==============================
        // 4. Access Element
        // ==============================
        System.out.println("First Element = " + arr[0]);
        System.out.println("Last Element = " + arr[arr.length - 1]);

        // ==============================
        // 5. Update Element
        // ==============================
        arr[0] = 999;
        System.out.println("\nAfter Updating First Element:");
        for(int x : arr) {
            System.out.print(x + " ");
        }

        // ==============================
        // 6. Sum and Average
        // ==============================
        int sum = 0;
        for(int x : arr) {
            sum += x;
        }

        double avg = (double) sum / arr.length;

        System.out.println("\n\nSum = " + sum);
        System.out.println("Average = " + avg);

        // ==============================
        // 7. Maximum and Minimum
        // ==============================
        int max = arr[0];
        int min = arr[0];

        for(int x : arr) {
            if(x > max)
                max = x;

            if(x < min)
                min = x;
        }

        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);

        // ==============================
        // 8. Linear Search
        // ==============================
        System.out.print("\nEnter element to search: ");
        int key = sc.nextInt();

        boolean found = false;
        int index = -1;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == key) {
                found = true;
                index = i;
                break;
            }
        }

        if(found)
            System.out.println(key + " found at index " + index);
        else
            System.out.println(key + " not found.");

        // ==============================
        // 9. Copy Array
        // ==============================
        int[] copy = arr.clone();

        System.out.println("\nCopied Array:");
        for(int x : copy) {
            System.out.print(x + " ");
        }

        // ==============================
        // 10. Compare Arrays
        // ==============================
        System.out.println("\n\nArrays Equal? " + Arrays.equals(arr, copy));

        // ==============================
        // 11. Reverse Array
        // ==============================
        int[] reverse = arr.clone();

        int start = 0;
        int end = reverse.length - 1;

        while(start < end) {
            int temp = reverse[start];
            reverse[start] = reverse[end];
            reverse[end] = temp;
            start++;
            end--;
        }

        System.out.println("\nReversed Array:");
        for(int x : reverse) {
            System.out.print(x + " ");
        }

        // ==============================
        // 12. Sort Array
        // ==============================
        int[] sorted = arr.clone();
        Arrays.sort(sorted);

        System.out.println("\n\nSorted Array:");
        for(int x : sorted) {
            System.out.print(x + " ");
        }

        // ==============================
        // 13. Binary Search
        // (Works on sorted array only)
        // ==============================
        System.out.print("\n\nEnter element for binary search: ");
        int bKey = sc.nextInt();

        int result = Arrays.binarySearch(sorted, bKey);

        if(result >= 0)
            System.out.println(bKey + " found at index " + result);
        else
            System.out.println(bKey + " not found.");

        // ==============================
        // 14. Fill Array
        // ==============================
        int[] fillArray = new int[5];
        Arrays.fill(fillArray, 100);

        System.out.println("\nArray after fill():");
        for(int x : fillArray) {
            System.out.print(x + " ");
        }

        // ==============================
        // 15. Direct Initialization
        // ==============================
        int[] direct = {10, 20, 30, 40, 50};

        System.out.println("\n\nDirectly Initialized Array:");
        for(int x : direct) {
            System.out.print(x + " ");
        }

        // ==============================
        // 16. Array to String
        // ==============================
        System.out.println("\n\nUsing Arrays.toString():");
        System.out.println(Arrays.toString(arr));

        sc.close();
    }
}