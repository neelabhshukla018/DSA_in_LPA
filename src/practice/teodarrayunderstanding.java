package practice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class teodarrayunderstanding {
    public static void main(String[] args) {

//        int arr[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//
//        for (int[] row : arr) {
//            for (int x : row) {
//                System.out.print(x + " ");
//            }
//            System.out.println();
//        }
//    //maximum element

//        int arr[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//
//        int max=arr[0][0];
//        for (int[] row : arr) {
//            for (int x : row) {
//                if(x>max)
//                max=x;
//            }
//        }
//        System.out.println(max);

        //minimum element
//        int arr[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//
//        int min=arr[0][0];
//        for (int[] row : arr) {
//            for (int x : row) {
//                if(x<min)
//                    min=x;
//            }
//        }
//        System.out.println(min);


        //unique element
//        int arr[][] = {{1, 2, 2}, {4, 5, 1}, {7, 7, 9}};
//
//        for(int[] row:arr){
//            for(int x:row){
//
//                int count=0;
//
//                for(int[] row2:arr){
//                    for(int y:row2){
//                        if(x==y){
//                            count++;
//                        }
//                    }
//                }
//                if (count == 1) {
//                    System.out.print(x+" ");
//            }
//
//        }


//            //how to acess first element
//        System.out.print(arr[0][0]);
//        System.out.println();
//        //how to acess last element
//        System.out.println(arr[arr.length-1][arr[0].length-1]);

//        //sum of all element
//        int arr[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//        int sum=0;
//        for(int[]row:arr){
//            for(int x:row){
//                sum+=x;
//            }
//        }
//        System.out.print("The sum of an 2d array is: "+sum);


        //sort of each row
//        int arr[][] = {{1, 3, 2}, {4, 5, 6}, {7, 8, 9}};
//        for (int[] row : arr) {
//            for (int x : row) {
//                Arrays.sort(row);
//                System.out.print(x + " ");
//            }
//            System.out.println();
//        }


        //linear search
//        int arr[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//        int key = 5;
//
//        boolean found = false;
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//
//                if (arr[i][j] == key) {
//                    System.out.print("element " + key + " found at row " + i + " column " + j);
//                    found = true;
//                }
//            }
//        }
//            if (!found) {
//                System.out.print("Element not found");
//            }


        //reverse of an array
//        int arr[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//        for(int[] row:arr) {
//            int start = 0;
//            int end = row.length - 1;
//
//            while (start <= end) {
//                int temp = row[start];
//                row[start] = row[end];
//                row[end] = temp;
//                start++;
//                end--;
//            }
//
//                for (int x : row) {
//                    System.out.print(x + " ");
//                }
//            System.out.println();
//
//            }





    }
}
