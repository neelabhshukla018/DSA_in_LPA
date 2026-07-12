package practice;

public class righttriangle {
    public static void main(String[] args) {
        int num=5;

        for(int r=0;r<=num;r++){
            for(int c=0;c<r;c++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
