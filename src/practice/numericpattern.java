package practice;

public class numericpattern {
    public static void main(String[] args) {
        int num=5;

        for (int r = 1; r <=num ; r++) {

            for (int c = 1; c <=num-r ; c++) {
                System.out.print(" ");
            }

            for(int k=1;k<=r-1;k++){
                System.out.print(k);
            }

            for (int m = r; m >=1 ; m--) {
                System.out.print(m);
            }

            System.out.println();
        }
    }
}
