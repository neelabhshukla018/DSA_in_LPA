package practice;

public class rhombus {
    public static void main(String[] args) {

        int num=3;

        for(int r=0;r<=num;r++){

            //for spaces
            for (int s = 0; s <num-r ; s++) {
                System.out.print(" ");
            }

            //for stars
            for (int c = 0; c <num+1 ; c++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
