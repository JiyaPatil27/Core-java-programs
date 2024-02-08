import java.util.Scanner;

public class KeyBoardScanner {
    public static void main(String[] args) {
        Scanner jiya = new Scanner(System.in);

        // Prompting user for an int
        System.out.print("Enter an integer: ");
        int intValue = jiya.nextInt();

        // Prompting user for a double
        System.out.print("Enter a floating point number: ");
        double doubleValue = jiya.nextDouble();

        // Consume the newline character left by nextDouble() to avoid issues with nextLine()
        jiya.nextLine();

        // Prompting user for a String
        System.out.print("Enter your name: ");
        String stringValue = jiya.nextLine();

        // Displaying the inputs
        System.out.println("Hi! " + stringValue + ", the sum of " + intValue + " and " + doubleValue +
                " is " + (intValue + doubleValue));

    }
}
