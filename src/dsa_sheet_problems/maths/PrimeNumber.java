package dsa_sheet_problems.maths;

/**
 * Problem: Check if a number is prime.
 * Logic: A prime number has no divisors other than 1 and itself.
 * Optimization: We only check up to sqrt(num) because factors repeat after that point.
 * Time Complexity: O(sqrt(n))
 */
public class PrimeNumber {

    public static boolean isPrime(int num) {
        // 0 and 1 are not prime numbers
        if (num <= 1) {
            return false;
        }

        // Loop from 2 to the square root of num
        for (int i = 2; i * i <= num; i++) {
            // If num is divisible by any i, it's not prime
            if (num % i == 0) {
                return false;
            }
        }

        // If no divisors found, the number is prime
        return true;
    }

    public static void main(String[] args) {
        int testNum = 17;
        System.out.println("Is " + testNum + " a prime number? " + isPrime(testNum));
    }
}