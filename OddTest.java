import java.util.Scanner;

public class OddTest {
    public static void main(String[] args) {
        Scanner jiya = new Scanner(System.in);

        // Prompting the user for a number
        System.out.print("Enter a number: ");
        int number = jiya.nextInt();

        // Checking if the number is odd or even
        if (isOdd(number)) {
            System.out.println("ODD");
        } else {
            System.out.println("EVEN");
        }
    }

    // Method to check if a number is odd
    public static boolean isOdd(int number) {
        return number % 2 != 0;
    }
}

