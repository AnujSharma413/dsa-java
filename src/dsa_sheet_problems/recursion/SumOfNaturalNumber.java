package dsa_sheet_problems.recursion;

/**
 * Problem: Calculate the sum of natural numbers up to N using recursion.
 * Link: https://www.geeksforgeeks.org/problems/sum-of-series2811/1
 * * Logic:
 * 1. Base Case: If n == 0, return 0.
 * 2. Recursive Step: Return n + sum(n-1).
 * * Time Complexity: O(N)
 * * Space Complexity: O(N) (due to the recursive stack)
 */
public class SumOfNaturalNumber {

    public static int sum(int n) {
        // Base case: No numbers to add
        if (n == 0) {
            return 0;
        }

        // Recursive Step: Add current n to the sum of the previous numbers
        return n + sum(n - 1);
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println("Sum of natural numbers up to " + n + " is: " + sum(n));
    }
}