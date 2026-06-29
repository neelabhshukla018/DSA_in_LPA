package SortingAlgorithms;

public class Bubblesort {

    // Function to sort the array using Optimized Bubble Sort
    public static void bubblesort(int[] arr) {

        // Store the size of the array
        int n = arr.length;

        // Outer loop = Number of passes
        for (int i = 0; i < n - 1; i++) {

            // Assume no swapping happens in this pass
            boolean swapped = false;

            // Inner loop = Compare adjacent elements
            // n - i - 1 because the last i elements are already sorted
            for (int j = 0; j < n - i - 1; j++) {

                // If left element is greater than right element
                if (arr[j] > arr[j + 1]) {

                    // Swap the two elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    // A swap has occurred
                    swapped = true;
                }
            }

            // If no swaps happened in this pass,
            // the array is already sorted
            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {

        // Unsorted array
        int[] arr = {5, 3, 8, 4, 2};

        // Call Bubble Sort function
        bubblesort(arr);

        // Print the sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
