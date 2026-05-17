package dsa_sheet_problems.arrays.medium;

import java.util.Arrays;

/**
 * Problem: LeetCode 1 - Two Sum
 * Link: https://leetcode.com/problems/two-sum/
 * * Approach: Brute Force
 * - Logic: Use nested loops to check every possible pair of elements
 * to see if their sum equals the target.
 * * Time Complexity: O(N^2) - Checking all unique pairs.
 * * Space Complexity: O(1) - In-place search with no extra memory.
 */
public class TwoSum {

    static int[] twoSum(int[] nums, int target) {
        int n = nums.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }

        return new int[]{};
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] ans = twoSum(nums, target);
        System.out.println(Arrays.toString(ans));
    }
}