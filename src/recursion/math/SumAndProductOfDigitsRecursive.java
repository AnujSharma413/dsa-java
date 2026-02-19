package recursion.math;

/**
 * PURPOSE:
 * Find sum and product of digits of a number using recursion.
 *
 * Core Idea:
 * - Extract last digit using n % 10
 * - Reduce number using n / 10
 *
 * Recursion works digit by digit until number becomes single digit.
 */
public class SumAndProductOfDigitsRecursive {

    // Returns sum of digits of n
    static int sumOfDigits(int n) {

        // Base Condition
        if (n == 0) {
            return 0;
        }

        // Last digit + recursion on remaining number
        return (n % 10) + sumOfDigits(n / 10);
    }

    // Returns product of digits of n
    static int productOfDigits(int n) {

        // Base Condition:
        // When number becomes single digit
        if (n % 10 == n) {
            return n;
        }

        // Last digit * recursion on remaining number
        return (n % 10) * productOfDigits(n / 10);
    }

    public static void main(String[] args) {
        System.out.println(productOfDigits(1342));
    }
}
