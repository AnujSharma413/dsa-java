package dsa_sheet_problems.maths;

/**
 * Problem: Reverse a signed 32-bit integer.
 * Note: If reversing x causes the value to go outside the
 * signed 32-bit integer range [-2^31, 2^31 - 1], return 0.
 */
public class ReverseInteger {

    public static int reverseInteger(int num) {
        int rev = 0;

        while (num != 0) {
            int rem = num % 10;
            num /= 10;

            // Overflow Check:
            // Before multiplying by 10, check if 'rev' will exceed Integer limits.
            if (rev < Integer.MIN_VALUE / 10 || rev > Integer.MAX_VALUE / 10) {
                return 0;
            }

            rev = (rev * 10) + rem;
        }

        return rev;
    }

    public static void main(String[] args) {
        int num = -123;
        // Output will be -321
        System.out.println("Original: " + num);
        System.out.println("Reversed: " + reverseInteger(num));
    }
}