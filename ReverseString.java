import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner jiya = new Scanner(System.in);

        // Prompting the user for input
        System.out.print("Enter a String: ");
        String input = jiya.nextLine();

        // Reversing the input String
        String reversed = reverseString(input);

        // Displaying the reversed String
        System.out.println("The reverse of the String \"" + input + "\" is \"" + reversed + "\"");

    }

    // Method to reverse a given String
    private static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }
}

