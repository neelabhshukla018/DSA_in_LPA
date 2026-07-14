package practice;

import java.util.Scanner;

public class allaboutstring {
    public static void main(String[] args) {


        Scanner userip=new Scanner(System.in);

        System.out.print("Enter your name sir/madam: ");
        String name=userip.nextLine();
//        System.out.print("Enter your city sir/madam: ");
//        String city=userip.nextLine();



////        System.out.print("Your name is: " +name);
//        System.out.println();
//        System.out.print("length of the name is: " +name.length());
//        System.out.println();
////        System.out.print("substring of the name is: "+name.substring(3,5));
//        System.out.println();
//        System.out.print("comparison of two string: " +name.equals(city));
//        System.out.println();
//
//        //concatenation of two string
//        System.out.print(name+" "+city);
//
//        System.out.println();
//        System.out.print(name.contains("shukla"));
//        System.out.println();
//        System.out.print(name.toUpperCase());
//        System.out.println();
//        System.out.print(city.toLowerCase());

//        for(int i=0;i<name.length();i++){
//            System.out.println(name.charAt(i));
//        }

//        System.out.println("Reverse of the name: ");
//        System.out.println();
//        for(int i=name.length()-1;i>=0;i--){
//            System.out.println(name.charAt(i));
//        }

        //palindrome of string


//        String reversed="";
//        for (int i = name.length()-1; i >=0 ; i--) {
//            reversed+=name.charAt(i);
//        }
//
//        if(name.equals(reversed)){
//            System.out.print("It is a Palindrone");
//        }
//
//        else {
//            System.out.print("It is not a Palindrone");
//        }
//
//        System.out.print(name.startsWith("Ne"));
//        System.out.println();
//        System.out.print(name.endsWith("la"));
//        System.out.println();
//        System.out.print(name.replace('l','A'));

        char arr[]=name.toCharArray();
        for (char ch:arr) {
            System.out.print(ch+" ");
        }

        char namesd[]={'n','e','e','l','a','b','h'};
        for(char names:namesd){
            System.out.println(names+" ");
        }













    }
}
