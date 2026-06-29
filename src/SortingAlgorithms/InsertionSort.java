package SortingAlgorithms;

public class InsertionSort {

    public static void insertionSort(int[] arr) {

        // Start from the second element
        for (int i = 1; i < arr.length; i++) {

            int key = arr[i];
            int j = i - 1;

            // Shift elements greater than key
            while (j >= 0 && arr[j] > key) {

                arr[j + 1] = arr[j];
                j--;
            }

            // Insert key at correct position
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {

        int[] arr = {5, 3, 8, 4, 2};

        insertionSort(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}