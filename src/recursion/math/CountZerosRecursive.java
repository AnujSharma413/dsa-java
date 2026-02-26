package recursion.math;

/**
 * PURPOSE:
 * Count the number of zero digits in a number using recursion.
 *
 * Key Concept:
 * - Use a helper function to pass extra information (count)
 * - Avoid using global/static variables
 *
 * This demonstrates how values can be carried
 * through recursive calls.
 */
public class CountZerosRecursive {

    // Public method to start recursion
    static int countZeros(int n) {
        return helper(n, 0);
    }

    /**
     * Helper function:
     * n     -> remaining number
     * count -> number of zeros found so far
     */
    static int helper(int n, int count) {

        // Base Condition: all digits processed
        if (n == 0) {
            return count;
        }

        int rem = n % 10;

        // If last digit is zero, increase count
        if (rem == 0) {
            return helper(n / 10, count + 1);
        }

        // Otherwise, continue without increment
        return helper(n / 10, count);
    }

    public static void main(String[] args) {
        int n = 304012;
        System.out.println(countZeros(n));
    }
}