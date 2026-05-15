package dsa_sheet_problems.arrays.easy;

/**
 * Problem: Find the maximum number of consecutive 1s in a binary array.
 * Link: https://leetcode.com/problems/max-consecutive-ones/
 * * Logic:
 * 1. Maintain a running 'count' for the current streak of 1s.
 * 2. Maintain a 'maxCount' to store the global maximum streak found so far.
 * 3. Traverse the array:
 * - If the element is 1, increment 'count' and update 'maxCount'.
 * - If the element is 0, a streak has broken; reset 'count' to 0.
 * * Time Complexity: O(N) - Single pass through the array.
 * * Space Complexity: O(1) - Auxiliary space is constant.
 */
public class MaxConsecutiveOnes {

    public static int findMaxConsecutiveOnes(int[] nums) {
        if (nums == null || nums.length == 0) return 0;

        int maxCount = 0;
        int count = 0;

        for (int num : nums) {
            if (num == 1) {
                count++;
                maxCount = Math.max(count, maxCount);
            } else {
                // Streak broken by a 0
                count = 0;
            }
        }
        return maxCount;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 1, 1, 1};
        System.out.println("Array: {1, 1, 0, 1, 1, 1}");
        System.out.println("Max Consecutive Ones: " + findMaxConsecutiveOnes(nums));
    }
}