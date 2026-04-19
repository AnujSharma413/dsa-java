package dsa_sheet_problems.recursion;

/**
 * Problem: Calculate the Nth Fibonacci number using recursion.
 * Link: https://leetcode.com/problems/fibonacci-number/description/
 * * Logic:
 * 1. Base Case: If n is 0 or 1, return n.
 * 2. Recursive Step: Return fib(n-1) + fib(n-2).
 * * Note: This naive recursive approach has a Time Complexity of O(2^n)
 * because it recalculates the same subproblems repeatedly.
 */
public class FibonacciNumber {

    public static int fib(int n) {
        // Base case: F(0) = 0, F(1) = 1
        if (n <= 1) {
            return n;
        }

        // Branching: Two recursive calls
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println("Fibonacci of " + n + " is: " + fib(n));
    }
}