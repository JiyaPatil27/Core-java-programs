import java.util.Scanner;

public class CheckOccurence {
    public static void main(String[] args) {
        Scanner jiya = new Scanner(System.in);

        // Prompt the user for a number
        System.out.print("Enter a number: ");
        int number = jiya.nextInt();

        // Check if the number contains the digit 8
        boolean result = hasEight(number);

        // Output the result
        if (result) {
            System.out.println("The number contains the digit 8.");
        } else {
            System.out.println("The number does not contain the digit 8.");
        }
    }

    // Method to check if a number contains the digit 8
    public static boolean hasEight(int number) {
        // Convert the number to a string
        String numString = Integer.toString(number);
        // Check if the string contains the character '8'
        return numString.contains("8");
    }
}
