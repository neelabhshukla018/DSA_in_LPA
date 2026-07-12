package practice;
import java.util.Scanner;
public class whilenested {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num=sc.nextInt();

        while(num<=5){
            int j=1;
            while(j<=5){
                System.out.print("* ");
                j++;
            }
            System.out.println();
            num++;
        }
    }
}
