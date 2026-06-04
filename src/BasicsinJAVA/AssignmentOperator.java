package BasicsinJAVA;

public class AssignmentOperator {
    public static void main(String[] args) {

        // Assign operator
        int a = 5;
        System.out.println(a);

        // Addition assignment
        a += 10; // a = a + 10
        System.out.println(a);

        // Subtraction assignment
        a -= 3; // a = a - 3
        System.out.println(a);

        // Multiplication assignment
        a *= 2; // a = a * 2
        System.out.println(a);

        // Division assignment
        a /= 4; // a = a / 4
        System.out.println(a);

        // Modulus assignment
        a %= 3; // a = a % 3
        System.out.println( a);

        // You can also assign to other variables
        int b = 20;
        System.out.println( b);

        // Compound assignment with b
        b += a; // b = b + a
        System.out.println( b);

        b -= 5; // b = b - 5
        System.out.println(b);

        b *= 3; // b = b * 3
        System.out.println(b);

        b /= 2; // b = b / 2
        System.out.println(b);

        b %= 4; // b = b % 4
        System.out.println(b);
    }
}