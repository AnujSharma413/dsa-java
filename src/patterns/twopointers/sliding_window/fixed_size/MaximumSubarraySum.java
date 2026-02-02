package patterns.twopointers.sliding_window.fixed_size;

/**
 * Problem:
 * Find the maximum sum of any contiguous subarray of size K.
 *
 * Constraints:
 * - Array contains integers (can be negative)
 * - Window size K is fixed
 *
 * Pattern Used:
 * Fixed Size Sliding Window
 * (Two Pointers: i = window start, j = window end)
 *
 * Idea:
 * - Maintain a window of size K
 * - Add next element using j pointer
 * - When window size becomes K:
 *     - update maximum sum
 *     - remove element at i (shrink window)
 *     - slide window forward
 *
 * Why Sliding Window?
 * - Avoid recalculating sum for every subarray
 * - Reuse previous window sum efficiently
 *
 * Time Complexity:
 * O(n) — each element is added and removed once
 *
 * Space Complexity:
 * O(1) — no extra space used
 *
 * Related Problems:
 * - LeetCode 643 – Maximum Average Subarray I - (same logic, just return max / k)
 * - GeeksForGeeks: Maximum sum subarray of size K
 */
public class MaximumSubarraySum {

    static int maximumSubarraySum(int[] nums, int k) {

        int i = 0;                 // window start
        int j = 0;                 // window end
        int sum = 0;               // current window sum
        int max = Integer.MIN_VALUE; // stores maximum sum found

        while (j < nums.length) {

            // add current element to window
            sum += nums[j];

            // if window size is less than k, expand window
            if (j - i + 1 < k) {
                j++;
            }

            // when window size equals k
            else if (j - i + 1 == k) {

                // update maximum sum
                max = Math.max(max, sum);

                // slide window:
                // remove element at i
                sum -= nums[i];
                i++;
                j++;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {1, 5, 4, 2, 9, 9, 9};
        int k = 3;
        System.out.println(maximumSubarraySum(nums, k)); // Output: 27
    }
}
