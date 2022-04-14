/**
 * Java 2. Homework 2
 *
 * @author Daria
 * @version 24.3.2022
 */


public class Lesson_2 {
    public static void main(String[] args) {
        System.out.println(sumNumbers(5, 1));
        System.out.println(sumNumbers(-10, 25));
        System.out.println(sumNumbers(0, -1));


        compareNumbers(0);
        compareNumbers(-15);
        compareNumbers(1);


        System.out.println(checkNegativeNumber(-11));
        System.out.println(checkNegativeNumber(0));
        System.out.println(checkNegativeNumber(11));

        printSomeText("Hello!", 5);
    }

    // Task 1
    static boolean sumNumbers(int a, int b) {
        return a + b >= 10 && a + b <= 20 ;
    }

    // Task 2
    static void compareNumbers(int a) {
        System.out.println(a >= 0 ? "Positive" : "Negative");
    }

    // Task 3
    static boolean checkNegativeNumber(int d) {
        return d <= 0;
    }

    // Task 4
    static void printSomeText(String s, int count) {
        for (int a = 0; a < count; a++) {
            System.out.println(s);
        }
    }
}
