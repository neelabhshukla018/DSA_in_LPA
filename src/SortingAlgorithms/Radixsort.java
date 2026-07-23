package SortingAlgorithms;

import java.util.Arrays;

public class Radixsort {

    public static void radixSort(int[] arr) {

        int max = getMax(arr);

        // Sort according to each digit
        for (int exp = 1; max / exp > 0; exp *= 10) {
            countingSort(arr, exp);
        }
    }

    private static void countingSort(int[] arr, int exp) {

        int n = arr.length;
        int[] output = new int[n];
        int[] count = new int[10];

        // Count digit frequencies
        for (int num : arr) {
            int digit = (num / exp) % 10;
            count[digit]++;
        }

        // Convert to cumulative count
        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        // Build output from right to left
        for (int i = n - 1; i >= 0; i--) {

            int digit = (arr[i] / exp) % 10;

            output[count[digit] - 1] = arr[i];

            count[digit]--;
        }

        // Copy back
        System.arraycopy(output, 0, arr, 0, n);
    }

    private static int getMax(int[] arr) {

        int max = arr[0];

        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }

        return max;
    }

    public static void main(String[] args) {

        int[] arr = {170, 45, 75, 90, 802, 24, 2, 66};

        radixSort(arr);

        System.out.println(Arrays.toString(arr));
    }
}