//Write a program called CheckOddEven which prints
//        "Odd Number" if the int variable “number” is odd, or “Even Number” otherwise. The
//        program shall always print “BYE!” before exiting.



import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner jiya = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = jiya.nextInt();

        if (number % 2 == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }

        System.out.println("BYE!");

    }
}
