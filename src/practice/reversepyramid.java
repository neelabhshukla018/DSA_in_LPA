package practice;

public class reversepyramid {
    public static void main(String[] args) {

        int num=3;

        for (int r = 0; r <=num ; r++) {

            //for spaces
            for (int s = 0; s <=r-1 ; s++) {
                System.out.print(" ");
            }

            //for stars
            for (int c = 0; c <2*num-2*r+1 ; c++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
