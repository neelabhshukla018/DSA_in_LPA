package Strings;

public class palindrone {
    public static void main(String[] args) {

        String first = "madam";

        // Reverse the string
        String reversed = "";
        for (int i = first.length() - 1; i >= 0; i--) {
            reversed += first.charAt(i);
        }

        // Print the original and reversed strings
        System.out.println("Original: " + first);
        System.out.println("Reversed: " + reversed);

        // Check if palindrome
        if (first.equalsIgnoreCase(reversed)) {
            System.out.println(first + " is a palindrome");
        } else {
            System.out.println(first + " is not a palindrome");
        }
    }
}