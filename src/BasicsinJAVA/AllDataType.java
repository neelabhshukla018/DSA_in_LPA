package BasicsinJAVA;

public class AllDataType {
    public static void main(String[] args) {

//Numeric DT- byte ,short, int, long--------------------------------

        // 1. byte — very small numbers
        byte age = 25;                  // range: -128 to 127
        System.out.println(age);

        // 2. short — small numbers
        short year = 2024;              // range: -32,768 to 32,767
        System.out.println(year);

        // 3. int — normal numbers
        int marks1 = 45;               // range: -2 billion to 2 billion
        System.out.println(marks1);

        // 4. long — very large numbers
        long population = 8000000000L; // add L at the end!
        System.out.println(population);

        // 5. float — decimal numbers
        float price = 99.99f;          // add f at the end!
        System.out.println(price);

        // 6. double — more precise decimals
        double pi = 3.14159265358979;
        System.out.println(pi);


        //Boolean Value
        boolean eligibletoVote=true;
        boolean noteligibletoVote=false;
        System.out.println(eligibletoVote);
        System.out.println(noteligibletoVote);


        //char value
        char ch='a';
        System.out.println(ch);

    }
}
