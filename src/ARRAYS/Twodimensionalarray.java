package ARRAYS;

import java.util.Arrays;

public class Twodimensionalarray {
    public static void main(String[] args) {
//
//        // ==========================================
//        // 1. Declaration and Initialization
//        // ==========================================
//        int[][] arr = {
//                {10, 20, 30},
//                {40, 50, 60},
//                {70, 80, 90}
//        };
//
//        // ==========================================
//        // 2. Printing 2D Array (Enhanced For Loop)
//        // ==========================================
//        System.out.println("Original 2D Array:");
//        for (int[] row : arr) {
//            for (int x : row) {
//                System.out.print(x + " ");
//            }
//            System.out.println();
//        }
//
//        // ==========================================
//        // 3. Length of Array
//        // ==========================================
//        System.out.println("\nNumber of Rows = " + arr.length);
//        System.out.println("Number of Columns = " + arr[0].length);
//
//        // ==========================================
//        // 4. Accessing Elements
//        // ==========================================
//        System.out.println("\nFirst Element = " + arr[0][0]);
//        System.out.println("Last Element = " + arr[arr.length - 1][arr[0].length - 1]);
//
//        // ==========================================
//        // 5. Update an Element
//        // ==========================================
//        arr[0][0] = 100;
//
//        System.out.println("\nAfter Updating First Element:");
//        for (int[] row : arr) {
//            for (int x : row) {
//                System.out.print(x + " ");
//            }
//            System.out.println();
//        }
//
//        // ==========================================
//        // 6. Sum of All Elements
//        // ==========================================
//        int sum = 0;
//        for (int[] row : arr) {
//            for (int x : row) {
//                sum += x;
//            }
//        }
//        System.out.println("\nSum = " + sum);
//
//        // ==========================================
//        // 7. Average of Elements
//        // ==========================================
//        double avg = (double) sum / (arr.length * arr[0].length);
//        System.out.println("Average = " + avg);
//
//        // ==========================================
//        // 8. Maximum Element
//        // ==========================================
//        int max = arr[0][0];
//        for (int[] row : arr) {
//            for (int x : row) {
//                if (x > max)
//                    max = x;
//            }
//        }
//        System.out.println("Maximum Element = " + max);
//
//        // ==========================================
//        // 9. Minimum Element
//        // ==========================================
//        int min = arr[0][0];
//        for (int[] row : arr) {
//            for (int x : row) {
//                if (x < min)
//                    min = x;
//            }
//        }
//        System.out.println("Minimum Element = " + min);
//
//        // ==========================================
//        // 10. Linear Search
//        // ==========================================
//        int key = 50;
//        boolean found = false;
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                if (arr[i][j] == key) {
//                    System.out.println("Element " + key + " found at Row " + i + " Column " + j);
//                    found = true;
//                }
//            }
//        }
//
//        if (!found) {
//            System.out.println("Element not found");
//        }
//
//        // ==========================================
//        // 11. Copy 2D Array
//        // ==========================================
//        int[][] copy = new int[arr.length][arr[0].length];
//
//        for (int i = 0; i < arr.length; i++) {
//            copy[i] = arr[i].clone();
//        }
//
//        System.out.println("\nCopied Array:");
//        for (int[] row : copy) {
//            for (int x : row) {
//                System.out.print(x + " ");
//            }
//            System.out.println();
//        }
//
//        // ==========================================
//        // 12. Compare Arrays
//        // ==========================================
//        System.out.println("\nArrays are Equal? " + Arrays.deepEquals(arr, copy));
//
//        // ==========================================
//        // 13. Reverse Each Row (Simple Reverse)
//        // ==========================================
//        for (int[] row : arr) {
//            int start = 0;
//            int end = row.length - 1;
//
//            while (start < end) {
//                int temp = row[start];
//                row[start] = row[end];
//                row[end] = temp;
//
//                start++;
//                end--;
//            }
//        }
//
//        System.out.println("\nAfter Reversing Each Row:");
//        for (int[] row : arr) {
//            for (int x : row) {
//                System.out.print(x + " ");
//            }
//            System.out.println();
//        }
//
//        // ==========================================
//        // 14. Sort Each Row
//        // ==========================================
//        for (int[] row : arr) {
//            Arrays.sort(row);
//        }
//
//        System.out.println("\nAfter Sorting Each Row:");
//        for (int[] row : arr) {
//            for (int x : row) {
//                System.out.print(x + " ");
//            }
//            System.out.println();
//        }
//
//        // ==========================================
//        // 15. Fill Another 2D Array
//        // ==========================================
//        int[][] fillArray = new int[3][3];
//
//        for (int[] row : fillArray) {
//            Arrays.fill(row, 69);
//        }
//
//        System.out.println("\nFilled 2D Array:");
//        for (int[] row : fillArray) {
//            for (int x : row) {
//                System.out.print(x + " ");
//            }
//            System.out.println();
//        }
//
//        // ==========================================
//        // 16. Convert 2D Array to String
//        // ==========================================
//        System.out.println("\n2D Array as String:");
//        System.out.println(Arrays.deepToString(arr));

        System.out.println();
        System.out.println();


//Insert the row.......................................
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] newArr = new int[4][3];   // One extra row

// Copy old rows------------------------------------
        for (int i = 0; i < 1; i++) {
            newArr[i] = arr[i];
        }

// Insert new row at index 1-------------------------------
        newArr[1] = new int[]{10, 11, 12};

// Copy remaining rows---------------------------
        for (int i = 1; i < arr.length; i++) {
            newArr[i + 1] = arr[i];
        }

// Print new matrix---------------------------------------------------
        for (int[] row : newArr) {
            for (int x : row) {
                System.out.print(x + " ");
            }
            System.out.println();
        }


    }
}