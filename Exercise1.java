//Write a program called CheckPassFail which prints
//"PASS" if the int variable "mark" is more than or equal to 50; or prints "FAIL"
//otherwise. The program shall always print “DONE” before exiting.

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner jiya = new Scanner(System.in);

        System.out.print("Enter the mark: ");
        int mark = jiya.nextInt();

        if (mark >= 50) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }

        System.out.println("DONE");
    }
}

