package dsa_sheet_problems.maths;

/**
 * Problem: Check if an integer is a palindrome.
 * An integer is a palindrome when it reads the same backward as forward.
 * Logic: Negative numbers are not palindromes (e.g., -121 reads as 121-).
 */
public class PalindromeNumber {

    public static boolean isPalindrome(int num) {
        // Base case: Negative numbers are never palindromes
        if (num < 0) {
            return false;
        }

        int original = num;
        int reversed = 0;

        while (num != 0) {
            int remainder = num % 10;
            // Note: In a production environment, you might check for
            // integer overflow here, though most palindromes fit in 'int'.
            reversed = (reversed * 10) + remainder;
            num /= 10;
        }

        // Comparison of the reversed number with the original
        return original == reversed;
    }

    public static void main(String[] args) {
        int num = 121;
        System.out.println("Is " + num + " a palindrome? " + isPalindrome(num));

        int negNum = -121;
        System.out.println("Is " + negNum + " a palindrome? " + isPalindrome(negNum));
    }
}