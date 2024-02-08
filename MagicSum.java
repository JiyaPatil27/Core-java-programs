import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner jiya = new Scanner(System.in);

        // Prompt the user for numbers
        System.out.println("Enter numbers (enter -1 to finish):");
        int num;
        int sum = 0;

        // Read numbers until -1 is entered
        do {
            num = jiya.nextInt();
            if (hasEight(num)) {
                sum += num;
            }
        } while (num != -1);

        // Output the sum of numbers containing the digit 8
        System.out.println("The magic sum is: " + sum);
    }

    // Method to check if a number contains the digit 8
    public static boolean hasEight(int number) {
        // Convert the number to a string
        String numString = Integer.toString(number);
        // Check if the string contains the character '8'
        return numString.contains("8");
    }
}

