package practice;

public class pattern2 {
    public static void main(String[] args) {

        int num=4;
        int count=1;
        for (int r = 1; r <=num ; r++) {

            for (int c = 1; c <=r ; c++) {
                System.out.print(count+ " ");
                count++;
            }
            System.out.println();
        }
    }
}
