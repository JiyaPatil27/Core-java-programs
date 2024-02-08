import java.util.Scanner;

public class PhoneKeyPad {
    public static void main(String[] args) {
        Scanner jiya = new Scanner(System.in);

        // Prompting the user for input
        System.out.print("Enter a String: ");
        String input = jiya.nextLine().toUpperCase(); // Convert the input to uppercase for case insensitivity

        // Converting the input string to keypad digits
        String keypadDigits = convertToKeypadDigits(input);

        // Displaying the sequence of keypad digits
        System.out.println("Sequence of keypad digits: " + keypadDigits);
    }

    // Method to convert a string to keypad digits
    private static String convertToKeypadDigits(String str) {
        StringBuilder keypadDigits = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) {
                char digit = getDigitFromLetter(ch);
                keypadDigits.append(digit);
            } else {
                // If character is not a letter, keep it as it is
                keypadDigits.append(ch);
            }
        }
        return keypadDigits.toString();
    }

    // Method to get the corresponding digit for a given letter on the phone keypad
    private static char getDigitFromLetter(char letter) {
        switch (letter) {
            case 'A': case 'B': case 'C':
                return '2';
            case 'D': case 'E': case 'F':
                return '3';
            case 'G': case 'H': case 'I':
                return '4';
            case 'J': case 'K': case 'L':
                return '5';
            case 'M': case 'N': case 'O':
                return '6';
            case 'P': case 'Q': case 'R': case 'S':
                return '7';
            case 'T': case 'U': case 'V':
                return '8';
            case 'W': case 'X': case 'Y': case 'Z':
                return '9';
            default:
                return letter; // Return the original character if not a letter
        }
    }
}

