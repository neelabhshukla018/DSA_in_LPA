package practice;

public class hollowrectangle {
    public static void main(String[] args) {
        int num=5;

        for (int r = 1; r <= num; r++) {

            //for stars
            if(r==1||r==num|| r==2){
                for (int c = 1; c <=r; c++) {
                    System.out.print("*");
                }

            }

            else {
                //for that 1*
                System.out.print("*");

                //for spaces
                for (int s = 1; s <=r-2 ; s++) {
                    System.out.print(" ");
                }

                //for that 1*
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
