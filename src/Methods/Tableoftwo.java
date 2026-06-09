package Methods;

public class Tableoftwo {

    // Method Declaration
    public static void print2table(int m, int n) {

        for (int i = 1; i <= n; i++) {
            int ans = m * i;
            System.out.println(m + " x " + i + " = " + ans);
        }
    }

    public static void main(String[] args) {

        // Method Calling
        System.out.println("Table of 2:");
        print2table(2, 10);
    }
}