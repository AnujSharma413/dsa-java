package patterns.twopointers.left_right;
/**
 * Problem:
 * Check whether a given string is a valid palindrome.
 *
 * Rules:
 * - Consider only alphanumeric characters
 * - Ignore cases (case-insensitive)
 *
 * Notes:
 * - Empty string or string with only special characters is considered a palindrome
 *
 * Approach:
 * - Use Two Pointer technique (Left & Right)
 * - Convert string to lowercase for case-insensitive comparison
 * - Move pointers based on alphanumeric validation
 *
 * Pointer Movement Rules:
 * - If both characters are alphanumeric → compare them
 * - If left is non-alphanumeric → move left++
 * - If right is non-alphanumeric → move right--
 * - If both are non-alphanumeric → move both pointers
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Related Problem:
 * - LeetCode 125: Valid Palindrome
 */
public class ValidPalindrome {
    static boolean validPalindrome(String s){

        int left = 0;
        int right = s.length()-1;

        // Convert string to lowercase to handle case-insensitive comparison
        s = s.toLowerCase();

        while(left < right){

            // Case 1: Both characters are alphanumeric
            if(isAlphanumeric(s.charAt(left)) && isAlphanumeric(s.charAt(right)))
            {
                // Characters match → move both pointers
                if(s.charAt(left) == s.charAt(right)){
                    left++;
                    right--;
                }
                // Characters do not match → not a palindrome
                else{
                    return false;
                }
            }
            // Case 2: Left is alphanumeric, right is not
            else if(isAlphanumeric(s.charAt(left))){
                right--;
            }
            // Case 3: Right is alphanumeric, left is not
            else if (isAlphanumeric(s.charAt(right))){
                left++;
            }
            // Case 4: Both are non-alphanumeric
            else{
                left++;
                right--;
            }
        }
        // All valid characters matched
        return true;
    }

    // Helper method to check if a character is alphanumeric
    static boolean isAlphanumeric(char ch){
        if(ch >= '0' && ch <= '9' || ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z'){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(validPalindrome(s));  // true
    }
}
