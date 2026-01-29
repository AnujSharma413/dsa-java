package patterns.twopointers.left_right;

import java.util.Arrays;

import static java.lang.Math.abs;

/**
 * Problem:
 * Given a sorted array (can contain negative numbers),
 * return a new array of the squares of each number,
 * also sorted in non-decreasing order.
 *
 * Example:
 * Input:  [-2, -1, 3, 4]
 * Output: [1, 4, 9, 16]
 *
 * Pattern Used:
 * Left–Right Two Pointer
 *
 * Idea:
 * - The largest square will come from either the leftmost
 *   (largest negative) or rightmost (largest positive) value.
 * - Compare absolute values at both ends.
 * - Place the larger square at the end of result array.
 * - Move pointers accordingly.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 *
 * Related Problem:
 * - LeetCode 977: Squares of a Sorted Array
 */
public class SquaresOfSortedArray {

    static int[] squareSorted(int[] arr) {

        int n = arr.length;
        int[] result = new int[n];

        int left = 0;          // start pointer
        int right = n - 1;     // end pointer
        int idx = n - 1;       // position to fill in result

        // Process until all elements are handled
        while (left <= right) {

            // Compare absolute values
            if (abs(arr[left]) < abs(arr[right])) {
                result[idx] = arr[right] * arr[right];
                right--;
            } else {
                result[idx] = arr[left] * arr[left];
                left++;
            }
            idx--; // move to next position
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {-2, -1, 3, 4};
        int[] ans = squareSorted(arr);
        System.out.println(Arrays.toString(ans));
    }
}
