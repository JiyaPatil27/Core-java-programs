//Write a program
//        called PrintNumberInWord which prints "ONE", "TWO",... , "NINE", "OTHER" if
//        the int variable "number" is 1, 2,... , 9, or other, respectively. Use (a) a "nested-if"
//        statement; (b) a "switch-case" statement.


import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner jiya = new Scanner(System.in);

        System.out.print("Enter a number between 1 and 9: ");
        int number = jiya.nextInt();

        if (number == 1) {
            System.out.println("ONE");
        } else if (number == 2) {
            System.out.println("TWO");
        } else if (number == 3) {
            System.out.println("THREE");
        } else if (number == 4) {
            System.out.println("FOUR");
        } else if (number == 5) {
            System.out.println("FIVE");
        } else if (number == 6) {
            System.out.println("SIX");
        } else if (number == 7) {
            System.out.println("SEVEN");
        } else if (number == 8) {
            System.out.println("EIGHT");
        } else if (number == 9) {
            System.out.println("NINE");
        } else {
            System.out.println("OTHER");
        }
        System.out.println("Using switch case : ");
        System.out.print("Enter a number between 1 and 9: ");
        int num = jiya.nextInt();

        switch (num) {
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
            default:
                System.out.println("OTHER");
        }
    }
}
