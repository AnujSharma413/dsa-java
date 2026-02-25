package recursion.math;

/**
 * PURPOSE:
 * Reverse a number using recursion.
 *
 * Two Approaches Covered:
 * 1. Using an external/static variable (stateful recursion)
 * 2. Using pure recursion by passing required data through parameters
 *
 * This file clearly shows WHY approach 2 is preferred in interviews.
 */
public class ReverseNumberRecursive {

    // APPROACH 1:
    // Using external/static variable (NOT recommended for interviews)
    static int sum = 0;

    static void reverseUsingState(int n) {

        // Base Condition
        if (n == 0) {
            return;
        }

        int rem = n % 10;

        // Build reversed number step by step
        sum = sum * 10 + rem;

        // Recursive call with reduced number
        reverseUsingState(n / 10);
    }

    // APPROACH 2:
    // Pure recursion
    static int reversePure(int n) {

        // Count total digits in number
        int digits = (int) (Math.log10(n)) + 1;

        return helper(n, digits);
    }

    // Helper function to carry extra information
    private static int helper(int n, int digits) {

        // Base Condition: single digit number
        if (n % 10 == n) {
            return n;
        }

        int rem = n % 10;

        // Place digit at correct position
        return rem * (int) Math.pow(10, digits - 1)
                + helper(n / 10, digits - 1);
    }

    public static void main(String[] args) {
        System.out.println(reversePure(12345));
    }
}