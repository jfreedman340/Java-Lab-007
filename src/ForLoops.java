/**
 * @author Joseph Freedman
 * @Date 10/14/2022
 *
 * This program is several examples of for loops and what they can do.
 */

/**
 * Here is our list of imports.
 */

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * This is our ForLoops class.
 *
 * It contains the scanner variable s, the methods forSum(), rangeSum, factorial, and the
 * main method that calls the three methods containing the for loops
 */
public class ForLoops {
    private final static Scanner s = new Scanner(System.in);

    /**
     * @forsum
     *
     * This is our method that calculates sum.
     *
     * First we initialize the sum to be zero.
     * We ask the user to input a number.
     *
     * Then we increment through the list of the elements of the user's input and calculate the sum.
     */
    public static void forSum() {
        int sum = 0;
        System.out.println("Number for sum? ");
        int a = s.nextInt();

        for(int i = 1; i<=a; i++) {
            sum += i;
        }
        System.out.println("The sum is: " + sum);
        System.out.println("");
    }

    /**
     * @rangeSum
     *
     * We ask the user to input two numbers.
     *
     * The sum of the elements from the first number to the second number is calculated.
     */
    public static void rangeSum() {
        System.out.println("Enter two numbers for rangeSum: ");
        System.out.println("Number? ");
        int a = s.nextInt();
        System.out.println("Number? ");
        int b = s.nextInt();

        int sum = 0;
        /**
         * This is the longer way
         */
//        if (a > b) {
//            for(int i = a; i>=b; i--) {
//                sum += i;
//            }
//        } else {
//            for(int i = a; i<=b; i++) {
//                sum += i;
//            }
//        }

        /**
         * This is a shorter way.
         */
        int start = 0;
        int end = 0;

        if (a < b) {
            start = a;
            end = b;
        } else {
            start = b;
            end = a;
        }
        for(int i = start; i <= end; i++) {
            sum += i;
        }
        System.out.println("rangeSum is: " + sum);

    }
    /**
     * @factorial
     *
     * We ask the user to input a number.
     *
     * Then we decrement the elements and use the multiplication compound assignment operator
     * to calculate the factorial.
     */
    public static void factorial() {
        int factorial = 1;
        System.out.println("");
        System.out.println("Number for factorial? ");
        int a = s.nextInt();

        for(int i = a; i>=1; i--) {
            if(i == 1){
                System.out.print(i);
            }
            else {System.out.print(i + " * ");}
            factorial *= i;
        }
        System.out.println(" = " + factorial);
        System.out.println("");
    }

    /**
     * @main
     *
     * We call our three methods in our main method.
     */
    public static void main(String[] args) {
        forSum();
        rangeSum();
        factorial();
    }
}
