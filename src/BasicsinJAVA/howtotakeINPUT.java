package BasicsinJAVA;

import java.util.Scanner;

public class howtotakeINPUT {

    public static void main(String[] args) {
        Scanner userip =new Scanner(System.in);

        // Take integer input from the user
        System.out.print("Enter your age : ");
        int age = userip.nextInt();
        System.out.println("Your age is: " + age);



        //Take float input from the user
        System.out.print("Enter your Marks : ");
        float marks=userip.nextFloat();
        System.out.print("Your marks is: " +marks);

        System.out.println();

        //Take double input from the user
        System.out.print("Enter your Height(m) : ");
        double height=userip.nextDouble();
        System.out.print("Your Height(in meters) is: " +height);


        System.out.println();

        // Take string input from user (name)
        System.out.print("Enter your Name : ");
        userip.nextLine(); // Consume leftover newline
        String name = userip.nextLine();
        System.out.println("Your name is: " + name);

        System.out.println();

        // Take string input from user for quote (full line)
        System.out.print("Enter your Quote : ");
        String quote = userip.nextLine();
        System.out.println("Your quote is: " + quote);



        // Take a single character
        System.out.print("Enter a character: ");
        String data = userip.nextLine(); // Read input as string
        char ch = data.charAt(0); // Get the first character
        char ch2 = data.charAt(2);
        System.out.println("The character you entered: " + ch +" " +ch2);

        userip.close();

    }
}
