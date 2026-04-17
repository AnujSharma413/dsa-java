package maths;

/**
 * Problem: Find the Greatest Common Divisor (GCD) of two numbers.
 * Logic: Uses the Euclidean Algorithm (Modulo Version).
 * Time Complexity: O(log(min(num1, num2)))
 */
public class GCD {

    /**
     * Calculates GCD using the remainder method.
     * The algorithm swaps values until the remainder becomes zero.
     */
    public static int findGCD(int num1, int num2) {
        while (num2 != 0) {
            // Store num2 temporarily
            int temp = num2;

            // Update num2 to the remainder of num1/num2
            num2 = num1 % num2;

            // Update num1 to the old value of num2
            num1 = temp;
        }

        // When num2 hits 0, num1 is the GCD
        return num1;
    }

    public static void main(String[] args) {
        int a = 48, b = 18;
        // Output will be 6
        System.out.println("The GCD of " + a + " and " + b + " is: " + findGCD(a, b));
    }
}