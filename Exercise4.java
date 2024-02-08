import java.util.Scanner;

//a. Modify the program to use a "while-do" loop instead of "for" loop.
//
//        java
//        Copy code


public class Exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number between 0 and 6: ");
        int day = scanner.nextInt();

        String dayName = "";
        if (day == 0) {
            dayName = "Sunday";
        } else if (day == 1) {
            dayName = "Monday";
        } else if (day == 2) {
            dayName = "Tuesday";
        } else if (day == 3) {
            dayName = "Wednesday";
        } else if (day == 4) {
            dayName = "Thursday";
        } else if (day == 5) {
            dayName = "Friday";
        } else if (day == 6) {
            dayName = "Saturday";
        } else {
            dayName = "Not a valid day";
        }

        System.out.println(dayName);
    }
}
//    b. Modify the program to use a "do-while" loop.

//public class PrintDayInWord {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int day;
//
//        do {
//            System.out.print("Enter a number between 0 and 6: ");
//            day = scanner.nextInt();
//
//            String dayName = "";
//            switch (day) {
//                case 0:
//                    dayName = "Sunday";
//                    break;
//                case 1:
//                    dayName = "Monday";
//                    break;
//                case 2:
//                    dayName = "Tuesday";
//                    break;
//                case 3:
//                    dayName = "Wednesday";
//                    break;
//                case 4:
//                    dayName = "Thursday";
//                    break;
//                case 5:
//                    dayName = "Friday";
//                    break;
//                case 6:
//                    dayName = "Saturday";
//                    break;
//                default:
//                    dayName = "Not a valid day";
//            }
//
//            System.out.println(dayName);
//        } while (day < 0 || day > 6);
//
//
//    }
//}
//    c. Differences between "for" and "while-do" loops:
//
//        "for" loop: Typically used when you know the number of iterations in advance. It's convenient when you need to initialize, test, and increment a loop counter in a single line.
//        "while-do" loop: Used when you want to repeat a block of code while a condition is true. It's more flexible than a "for" loop because it allows you to set up the condition separately from the loop itself.
//        d. Modifying the program to sum from 111 to 8899, and compute the average:
//
//
//public class PrintDayInWord {
//    public static void main(String[] args) {
//        int sum = 0;
//        int count = 0;
//
//        for (int i = 111; i <= 8899; i++) {
//            sum += i;
//            count++;
//        }
//
//        double average = (double) sum / count;
//
//        System.out.println("Sum: " + sum);
//        System.out.println("Average: " + average);
//    }
//}
//    e. Modifying the program to sum only the odd numbers from 1 to 100, and compute the average:

//public class PrintDayInWord {
//    public static void main(String[] args) {
//        int sum = 0;
//        int count = 0;
//
//        for (int i = 1; i <= 100; i++) {
//            if (i % 2 != 0) {
//                sum += i;
//                count++;
//            }
//        }
//
//        double average = (double) sum / count;
//
//        System.out.println("Sum: " + sum);
//        System.out.println("Average: " + average);
//    }
//}
//    f. Modifying the program to sum those numbers from 1 to 100 that are divisible by 7, and compute the average:

//public class PrintDayInWord {
//    public static void main(String[] args) {
//        int sum = 0;
//        int count = 0;
//
//        for (int i = 1; i <= 100; i++) {
//            if (i % 7 == 0) {
//                sum += i;
//                count++;
//            }
//        }
//
//        double average = (double) sum / count;
//
//        System.out.println("Sum: " + sum);
//        System.out.println("Average: " + average);
//    }
//}
//    g. Modifying the program to find the "sum of the squares" of all the numbers from 1 to 100:

//public class PrintDayInWord {
//    public static void main(String[] args) {
//        int sumOfSquares = 0;
//
//        for (int i = 1; i <= 100; i++) {
//            sumOfSquares += i * i;
//        }
//
//        System.out.println("Sum of squares: " + sumOfSquares);
//    }
//}