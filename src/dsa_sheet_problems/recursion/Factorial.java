package dsa_sheet_problems.recursion;

/**
 * Problem: Calculate Factorial of N using recursion.
 * Link: https://www.geeksforgeeks.org/problems/factorial5739/1
 * * Logic:
 * 1. Base Case: If n <= 1, return 1 (0! and 1! are both 1).
 * 2. Recursive Step: Return n * factorial(n-1).
 * * Time Complexity: O(N)
 * * Space Complexity: O(N) (due to the recursive stack)
 */
public class Factorial {

    public static int factorial(int n) {
        // Base case: 0! = 1 and 1! = 1
        if (n <= 1) {
            return 1;
        }

        // Recursive Step: N * (N-1)!
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Factorial of " + n + " is: " + factorial(n));
    }
}