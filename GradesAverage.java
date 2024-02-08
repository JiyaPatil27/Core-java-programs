import java.util.Scanner;

public class GradesAverage {
    public static void main(String[] args) {
        Scanner jiya = new Scanner(System.in);

        // Prompting the user for the number of students
        System.out.print("Enter the number of students: ");
        int numStudents = jiya.nextInt();

        // Creating an array to store the grades of students
        int[] grades = new int[numStudents];

        // Prompting the user for the grades of each student
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter the grade for student " + (i + 1) + ": ");
            grades[i] = jiya.nextInt();
        }

        // Calculating the average grade
        float averageGrade = calculateAverage(grades);

        // Displaying the average grade
        System.out.println("The average grade is: " + averageGrade);
    }

    // Method to calculate the average of grades
    private static float calculateAverage(int[] grades) {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (float) sum / grades.length;
    }
}

