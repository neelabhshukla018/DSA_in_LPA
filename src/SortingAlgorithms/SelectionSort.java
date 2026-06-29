package SortingAlgorithms;

public class SelectionSort {

    public static void selectionsort(int [] arr){
            int n=arr.length;

        for (int i = 0; i <n-1 ; i++) {
            int minidx=i;
            //Because we already assumed first element as min so we have to start from i+1
            for (int j = i + 1; j < n; j++) {

                if (arr[j] < arr[minidx]) {
                    minidx = j;
                }
            }
            int temp = arr[minidx];
            arr[minidx] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 4, 2};

        selectionsort(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
