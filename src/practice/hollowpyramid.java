package practice;

public class hollowpyramid {
    public static void main(String[] args) {

        int num = 4;

        for (int r = 1; r <= num; r++) {

            // Leading spaces
            for (int sp = 1; sp <= num - r; sp++) {
                System.out.print(" ");
            }

            // First and last row
            if (r == 1 || r == num) {

                for (int c = 1; c <= 2 * r - 1; c++) {
                    System.out.print("*");
                }

            }

            else {

                System.out.print("*");

                // Inner spaces
                for (int s = 1; s <= 2 * r - 3; s++) {
                    System.out.print(" ");
                }

                System.out.print("*");
            }

            // Move to next line
            System.out.println();
        }
    }
}