import java.util.Scanner;

public class CheckVowelDigits {
    public static void main(String[] args) {
        Scanner jiya = new Scanner(System.in);

        // Prompting the user for input
        System.out.print("Enter a String: ");
        String input = jiya.nextLine();

        // Counting vowels and digits
        int vowelCount = 0;
        int digitCount = 0;
        for (char ch : input.toCharArray()) {
            if (Character.isLetter(ch) && isVowel(ch)) {
                vowelCount++;
            } else if (Character.isDigit(ch)) {
                digitCount++;
            }
        }

        // Calculating percentages
        int totalCharacters = input.length();
        float vowelPercentage = (float) vowelCount / totalCharacters * 100;
        float digitPercentage = (float) digitCount / totalCharacters * 100;

        // Displaying the counts and percentages
        System.out.println("Number of vowels: " + vowelCount + " (" + String.format("%.2f", vowelPercentage) + "%)");
        System.out.println("Number of digits: " + digitCount + " (" + String.format("%.2f", digitPercentage) + "%)");

    }

    // Method to check if a character is a vowel
    private static boolean isVowel(char ch) {
        char lowerCh = Character.toLowerCase(ch);
        return lowerCh == 'a' || lowerCh == 'e' || lowerCh == 'i' || lowerCh == 'o' || lowerCh == 'u';
    }
}

