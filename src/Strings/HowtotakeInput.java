package Strings;

import java.util.Scanner;

public class HowtotakeInput {
    public static void main(String[] args) {
        Scanner userip=new Scanner(System.in);

   //By user
        System.out.print("Enter your full name sir: ");
        String fullname=userip.nextLine();
        System.out.println(fullname);

        //by default
        String name="neelabh";

        System.out.println(name);

        //taking a single character
        char c1='N';
        System.out.println(c1);

        char c2=name.charAt(0);
        System.out.println(c2);

        String str="";
        String work="   ";
        System.out.println(str.isEmpty());//true
        System.out.println(str.isBlank());//true


        System.out.println(work.isEmpty());//false
        System.out.println(work.isBlank());//true2


    }
}
