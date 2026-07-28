package SortingAlgorithms;

import java.util.Arrays;

public class mergesort {

    public static void mergeSort(int[] arr) {
        int[] temp = new int[arr.length];
        mergeSort(arr, temp, 0, arr.length - 1);
    }



// to check it it is merged or not
    //understand
    private static void mergeSort(int[] arr, int[] temp, int left, int right) {

        // Base case
        if (left >= right) {
            return;
        }

        int mid = left + (right - left) / 2;

        // Sort left half
        mergeSort(arr, temp, left, mid);

        // Sort right half
        mergeSort(arr, temp, mid + 1, right);

        // Optimization: skip merge if already sorted
        if (arr[mid] <= arr[mid + 1]) {
            return;
        }

        merge(arr, temp, left, mid, right);
    }

    private static void merge(
            int[] arr,
            int[] temp,
            int left,
            int mid,
            int right
    ) {

        int i = left;
        int j = mid + 1;
        int k = left;

        // Compare both halves
        while (i <= mid && j <= right) {

            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        // Copy remaining left elements
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // Copy remaining right elements
        while (j <= right) {
            temp[k++] = arr[j++];
        }

        // Copy sorted elements back
        for (i = left; i <= right; i++) {
            arr[i] = temp[i];
        }
    }

    public static void main(String[] args) {

        int[] arr = {5, 2, 8, 1, 3, 7, 4, 6};

        mergeSort(arr);

        System.out.println(Arrays.toString(arr));
    }
}