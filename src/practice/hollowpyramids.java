package practice;

public class hollowpyramids {
    public static void main(String[] args) {
        int num=5;

        //for traverse

        for (int r = 1; r <=num ; r++) {

            //for start spaces
            for (int sp = 1; sp <=num-r ; sp++) {
                System.out.print(" ");
            }

            //for star without vacant spaces
            if(r==1 || r==num){
                for (int c = 1; c <=2*r-1 ; c++) {
                    System.out.print("*");
                }
            }

            else {
                //for that 1*
                System.out.print("*");

                //for that spaces
                for (int bs = 1; bs <=2*r-3 ; bs++) {
                    System.out.print(" ");
                }

                //for that 1*
                System.out.print("*");


            }
            System.out.println();
        }

    }
}
