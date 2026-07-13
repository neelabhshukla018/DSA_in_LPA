package practice;

public class diamondpatter {
    public static void main(String[] args) {

        int num=5;

       //for traverse
        for (int r = 0; r <num ; r++) {

            //for upper half pattern

            //spaces
            for(int s=0;s<num-r;s++){
                System.out.print("  ");
            }

            for(int st=0;st<2*r-1;st++){
                System.out.print("* ");
            }
            System.out.println();
        }

        //for lower pattern
        //for traverse
        for (int r =num; r>0 ; r--) {

            //for upper half pattern

            //spaces
            for(int s=0;s<num-r;s++){
                System.out.print("  ");
            }

            for(int st=0;st<2*r-1;st++){
                System.out.print("* ");
            }


            System.out.println();
        }



    }
}
