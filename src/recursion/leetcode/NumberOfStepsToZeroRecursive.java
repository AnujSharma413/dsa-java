package recursion.leetcode;

/**
 * PURPOSE:
 * Count the number of steps required to reduce a number to zero.
 * Leetcode Problem (1342)
 *
 * Rules:
 * - If number is even → divide by 2
 * - If number is odd  → subtract 1
 *
 * This uses PARAMETERIZED RECURSION
 * to keep track of the number of steps.
 */
public class NumberOfStepsToZeroRecursive {

    // Entry function
    static int numberOfSteps(int num) {
        return helper(num, 0);
    }

    /**
     * Helper function:
     * num   -> current value
     * count -> number of steps taken so far
     */
    static int helper(int num, int count) {

        // Base Condition: number reduced to zero
        if (num == 0) {
            return count;
        }

        // If number is even
        if (num % 2 == 0) {
            return helper(num / 2, count + 1);
        }

        // If number is odd
        return helper(num - 1, count + 1);
    }

    public static void main(String[] args) {
        int num = 14;
        System.out.println(numberOfSteps(num));
    }
}