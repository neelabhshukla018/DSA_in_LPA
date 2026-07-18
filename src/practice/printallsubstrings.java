package practice;

import java.util.Scanner;

public class printallsubstrings {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name=sc.nextLine();

        System.out.println();

//        System.out.println("Enter the no: ");
//        int n=sc.nextInt();
//
//        for (int i = 0; i <name.length()-n+1 ; i++) {
//            System.out.print(name.substring(i,i+n) +" ");
//        }

        //if n is not define or we want all the substrings
        for (int m = 0; m <name.length() ; m++) {
            for (int p = m; p <name.length() ; p++) {
                System.out.print(name.substring(m,p) +" ");
            }
            System.out.println();
        }




    }
}
//Why length - n + 1?
//abcdef
//Need substring of length 3.Possible substrings
//abc bcd cde def
//Total--4 substrings
//Formula--->Length - Window Size + 1
//6 - 3 + 1-->4
//This is called a Sliding Window formula.


