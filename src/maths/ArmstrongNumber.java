package maths;

/**
 * Problem: Check if a 3-digit number is an Armstrong Number.
 * Logic: A number is Armstrong if the sum of the cubes of its digits
 * equals the original number (e.g., 153 = 1^3 + 5^3 + 3^3).
 * Time Complexity: O(log10(N))
 */
public class ArmstrongNumber {

    /**
     * Determines if the given integer is an Armstrong number.
     * Note: This specific implementation assumes 3-digit numbers.
     */
    public static boolean isArmstrong(int num) {
        int original = num;
        int sum = 0;

        while (num != 0) {
            int digit = num % 10;

            // Cube the digit and add to sum
            sum += (digit * digit * digit);

            // Remove the last digit
            num /= 10;
        }

        // Return true if sum matches the original number
        return original == sum;
    }

    public static void main(String[] args) {
        int num = 153;
        System.out.println("Is " + num + " an Armstrong number? " + isArmstrong(num));

        int num2 = 123;
        System.out.println("Is " + num2 + " an Armstrong number? " + isArmstrong(num2));
    }
}