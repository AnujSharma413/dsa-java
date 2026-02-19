package recursion.math;

/**
 * PURPOSE:
 * Calculate factorial of a number using recursion.
 *
 * Factorial Definition:
 * n! = n × (n-1)!
 *
 * Base Cases:
 * 0! = 1
 * 1! = 1
 *
 * CORE IDEA:
 * Each recursive call waits for the smaller problem
 * to return its value before multiplication.
 */
public class FactorialRecursive {

    static int factorial(int n) {

        // Base Condition
        if (n == 0 || n == 1) {
            return 1;
        }

        // Recursive Relation
        // Current call waits for factorial(n-1)
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
