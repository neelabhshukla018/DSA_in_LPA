package practice;

public class diamond {
    public static void main(String[] args) {

        int num = 5;

        // Upper Half
        for (int r = 1; r <= num; r++) {

            // Spaces
            for (int s = 1; s <= num - r; s++) {
                System.out.print(" ");
            }

            // Stars
            for (int c = 1; c <= 2 * r - 1; c++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Lower Half
        for (int r = num - 1; r >= 1; r--) {

            // Spaces
            for (int s = 1; s <= num - r; s++) {
                System.out.print(" ");
            }

            // Stars
            for (int c = 1; c <= 2 * r - 1; c++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}