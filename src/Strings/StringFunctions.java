package Strings;

import java.util.Scanner;

public class StringFunctions {

    public static void main(String[] args) {

        System.out.println("Enter your name: ");
        Scanner userip = new Scanner(System.in);

        String name=userip.nextLine();
        System.out.println(name);

        //Length Function
        System.out.println(name.length());

        //Substring
        System.out.println(name.substring(0,4));


        //contains a word
        String str="I Love You";
        System.out.println(str.contains("You"));


        //String Concatenation
        String first="Neelabh";
        String last="SHUKLA";
        System.out.println(first+" "+last);


        //Compare Two Strings
        String s1="Java";
        String s2="Java";
        String s3="java";
        System.out.println(s1.equals(s2));//True
        System.out.println(s1.equals(s3));//False


        //convert to uppercase
        System.out.println(first.toUpperCase());


        //convert to lowercase
        System.out.println(last.toLowerCase());


        //Accessing characters
        System.out.println(first.charAt(0));
        System.out.println(first.charAt(3));





    }
}