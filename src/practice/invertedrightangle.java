package practice;

public class invertedrightangle {
    public static void main(String[] args) {
        int num = 3;

        for (int r = 0; r <= num; r++) {

            // Spaces
            for (int k = 0; k < r; k++) {
                System.out.print("  ");
            }

            // Stars
            for (int j = 0; j < num - r + 1; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}