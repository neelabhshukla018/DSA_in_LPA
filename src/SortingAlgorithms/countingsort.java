package SortingAlgorithms;

import java.util.Arrays;

public class countingsort {

    public static void countingSort(int[] arr) {

        if (arr.length == 0)
            return;

        // Step 1: Find maximum element
        int max = arr[0];

        for (int num : arr) {
            if (num > max)
                max = num;
        }

        // Step 2: Create count array
        int[] count = new int[max + 1];

        // Step 3: Store frequency
        for (int num : arr) {
            count[num]++;
        }

        // Step 4: Rebuild original array
        int index = 0;

        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[index++] = i;
                count[i]--;
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = {4, 2, 2, 8, 3, 3, 1};

        System.out.println("Before Sorting:");
        System.out.println(Arrays.toString(arr));

        countingSort(arr);

        System.out.println("After Sorting:");
        System.out.println(Arrays.toString(arr));
    }
}

//i have to learn at any cost