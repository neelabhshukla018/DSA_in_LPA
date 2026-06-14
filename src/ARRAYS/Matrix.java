package ARRAYS;

import java.security.spec.RSAOtherPrimeInfo;

public class Matrix {
    public static void main(String[] args) {
//
//        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
//
//        //for printing of an 2d array
////        int[] row : fillArray → "Take one complete row from the 2D array."
////        int x : row → "Take one element from that row."
////        print(x) → Print the element.
////         println() → After finishing a row, move to the next line.
//        for(int[] row:arr){
//                for(int x: row){
//                    System.out.print(x+" ");
//                }
//            System.out.println();
//        }
//=================================================================================
        //Transpose of a matrix
//        int rows = arr.length;
//        int cols = arr[0].length;
//
//        // Create transpose matrix
//        int[][] transpose = new int[cols][rows];
//
//        // Store transpose
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < cols; j++) {
//                transpose[j][i] = arr[i][j];
//            }
//        }
//
//        // Print transpose using enhanced for loop
//        System.out.println("Transpose Matrix:");
//        for (int[] row : transpose) {
//            for (int x : row) {
//                System.out.print(x + " ");
//            }
//            System.out.println();
//        }
        System.out.println();
//=====================================================================
//
//        //spiral matrix
//        int top = 0;
//        int bottom = arr.length - 1;
//        int left = 0;
//        int right = arr[0].length - 1;
//
//        System.out.print("Spiral Order: ");
//
//        while (top <= bottom && left <= right) {
//
//            // Left to Right
//            for (int i = left; i <= right; i++) {
//                System.out.print(arr[top][i] + " ");
//            }
//            top++;
//
//            // Top to Bottom
//            for (int i = top; i <= bottom; i++) {
//                System.out.print(arr[i][right] + " ");
//            }
//            right--;
//
//            // Right to Left
//            if (top <= bottom) {
//                for (int i = right; i >= left; i--) {
//                    System.out.print(arr[bottom][i] + " ");
//                }
//                bottom--;
//            }
//
//            // Bottom to Top
//            if (left <= right) {
//                for (int i = bottom; i >= top; i--) {
//                    System.out.print(arr[i][left] + " ");
//                }
//                left++;
//            }
//        }

//Addition of a  matrix
//        int[][] a = {
//                {1, 2, 3},
//                {4, 5, 6}
//        };
//
//        int[][] b = {
//                {7, 8, 9},
//                {1, 2, 3}
//        };
//
//        int[][] sum = new int[a.length][a[0].length];
//
//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < a[i].length; j++) {
//                sum[i][j] = a[i][j] + b[i][j];
//            }
//        }
//
//        System.out.println("Addition of Matrices:");
//        for (int[] row : sum) {
//            for (int x : row) {
//                System.out.print(x + " ");
//            }
//            System.out.println();
//        }


        //Multiplication of matrix
        int[][] a = {
                {1, 2},
                {3, 4}
        };

        int[][] b = {
                {5, 6},
                {7, 8}
        };

        int[][] result = new int[a.length][b[0].length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                for (int k = 0; k < a[0].length; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        System.out.println("Multiplication of Matrices:");
        for (int[] row : result) {
            for (int x : row) {
                System.out.print(x + " ");
            }
            System.out.println();
        }

    }
}
