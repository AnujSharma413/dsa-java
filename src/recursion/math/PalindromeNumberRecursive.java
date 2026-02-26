package recursion.math;

/**
 * PURPOSE:
 * Check whether a number is a palindrome using recursion.
 *
 * Core Idea:
 * - Reverse the number using PURE recursion
 * - Compare original number with its reversed value
 *
 * This approach reuses reverse-number logic
 * and avoids using loops or strings.
 */
public class PalindromeNumberRecursive {

    // Returns reversed number using pure recursion
    static int reversePure(int n) {

        // Count total digits in number
        int digits = (int) Math.log10(n) + 1;

        return helper(n, digits);
    }

    // Helper function to place digits correctly
    static int helper(int n, int digits) {

        // Base Condition: single digit number
        if (n % 10 == n) {
            return n;
        }

        int rem = n % 10;

        // Place digit at correct position
        return rem * (int) Math.pow(10, digits - 1)
                + helper(n / 10, digits - 1);
    }

    // Checks whether number is palindrome
    static boolean isPalindrome(int n) {
        return n == reversePure(n);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(1234321));
    }
}