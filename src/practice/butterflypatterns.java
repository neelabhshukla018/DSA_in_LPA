package practice;

public class butterflypatterns {
    public static void main(String[] args) {

        int num=4;

        //for traverse

        for (int r = 1; r <=num ; r++) {

            //for top half
            //part1
            for (int p1 = 1; p1 <=r ; p1++) {
                System.out.print("*");
            }

            //part2
            for (int p2 = 1; p2 <=2*(num-r) ; p2++) {
                System.out.print(" ");
            }

            //part3
            for (int p3 = 1; p3 <=r ; p3++) {
                System.out.print("*");
            }
            System.out.println();
        }


//for bottom half==========================================
        for (int r = 1; r <=num ; r++) {

            //part4
            for (int p4 = 1; p4 <= num - r + 1; p4++) {
                System.out.print("*");
            }

            //part5
            for (int p5 = 1; p5 <= 2 * (r - 1); p5++) {
                System.out.print(" ");
            }

            //part6
            for (int p6 = 1; p6 <= (num - r + 1); p6++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
