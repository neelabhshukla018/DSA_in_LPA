package practice;

public class hollowsphere {
    public static void main(String[] args) {

        int num = 4;

        for (int r = 1; r <= num; r++) {

            for (int c = 1; c <= num; c++) {

                if (r == 1 || r == num || c == 1 || c == num) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }
}