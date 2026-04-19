package dsa_sheet_problems.recursion;

/**
 * Problem: Valid Palindrome (check if a string is a palindrome ignoring non-alphanumeric chars).
 * Link: https://leetcode.com/problems/valid-palindrome/description/
 * * Logic:
 * 1. Recursive Two-Pointer: 'left' moves right, 'right' moves left.
 * 2. Filtering: Skip non-alphanumeric characters.
 * 3. Comparison: Compare characters at left and right pointers.
 * * Time Complexity: O(N)
 * * Space Complexity: O(N) (stack space)
 */
public class PalindromeString {

    public static boolean isPalindrome(String s) {
        // Normalize the string
        s = s.toLowerCase();
        return checkPalindrome(s, 0, s.length() - 1);
    }

    private static boolean checkPalindrome(String s, int left, int right) {
        // Base case: If pointers meet or cross, we've verified the whole string
        if (left >= right) {
            return true;
        }

        // Skip non-alphanumeric characters
        if (!isAlphanumeric(s.charAt(left))) {
            return checkPalindrome(s, left + 1, right);
        }
        if (!isAlphanumeric(s.charAt(right))) {
            return checkPalindrome(s, left, right - 1);
        }

        // Compare characters
        if (s.charAt(left) != s.charAt(right)) {
            return false;
        }

        // Recursive step: Move both pointers toward the center
        return checkPalindrome(s, left + 1, right - 1);
    }

    private static boolean isAlphanumeric(char ch) {
        // You can also use Character.isLetterOrDigit(ch) for a cleaner approach
        return (ch >= '0' && ch <= '9') || (ch >= 'a' && ch <= 'z');
    }

    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        System.out.println("Is palindrome: " + isPalindrome(str));
    }
}