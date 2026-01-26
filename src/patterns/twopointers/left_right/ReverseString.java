package patterns.twopointers.left_right;
import java.util.Arrays;

/**
 * Problem:
 * Reverse a given character array in-place.
 *
 * Notes:
 * - Input is a character array
 * - Modification must be done in-place
 * - No extra space should be used for another array
 *
 * Approach:
 * - Use Two Pointer technique (Left & Right)
 * - Initialize left pointer at start, right pointer at end
 * - Swap characters at both pointers
 * - Move left forward and right backward
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Related Problem:
 * - LeetCode 344: Reverse String
 */
public class ReverseString {
    static void reverseString(char[] s){

        int left = 0;
        int right = s.length-1;

        while(left < right){

            // Swap characters at left and right pointers
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            // Move pointers towards center
            left++;
            right--;
        }
        System.out.println(Arrays.toString(s));
    }
    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        reverseString(s);   // Output: [o, l, l, e, h]
    }
}
