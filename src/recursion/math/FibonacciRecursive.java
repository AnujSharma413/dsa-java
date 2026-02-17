package recursion.math;

/**
 * PURPOSE:
 * Calculate nth Fibonacci number using recursion.
 *
 * Fibonacci Series:
 * 0 1 1 2 3 5 8 ...
 *
 * CORE IDEA:
 * fib(n) = fib(n-1) + fib(n-2)
 *
 * IMPORTANT WARNING:
 * - This solution is NOT optimized.
 * - Time Complexity: O(2^n)
 * - Used ONLY to understand recursion tree
 *   and overlapping subproblems.
 */
public class FibonacciRecursive {

    static int fibo(int n) {

        // Base Condition
        if (n < 2) {
            return n;
        }

        // Recursive Relation
        return fibo(n - 1) + fibo(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(fibo(4));
    }
}
