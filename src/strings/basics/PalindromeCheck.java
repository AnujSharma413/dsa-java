package strings.basics;

public class PalindromeCheck {

    // Main logic to check valid palindrome
    static boolean validPalindrome(String str) {

        int left = 0;
        int right = str.length() - 1;

        // Convert once for case-insensitive comparison
        str = str.toLowerCase();

        while (left < right) {

            // If both characters are alphanumeric
            if (isAlphaNumeric(str.charAt(left)) && isAlphaNumeric(str.charAt(right))) {

                // Compare characters
                if (str.charAt(left) != str.charAt(right)) {
                    return false; // mismatch
                }

                // Move both pointers
                left++;
                right--;
            }

            // If left is valid but right is not
            else if (isAlphaNumeric(str.charAt(left))) {
                right--;
            }

            // If right is valid but left is not
            else if (isAlphaNumeric(str.charAt(right))) {
                left++;
            }

            // If both are non-alphanumeric
            else {
                left++;
                right--;
            }
        }

        return true; // palindrome
    }

    // Helper method to check alphanumeric character
    static boolean isAlphaNumeric(char ch) {
        return (ch >= 'a' && ch <= 'z')
                || (ch >= '0' && ch <= '9');
    }

    public static void main(String[] args) {
        String str = "No 'x' in Nixon";
        System.out.println(validPalindrome(str)); // true
    }
}