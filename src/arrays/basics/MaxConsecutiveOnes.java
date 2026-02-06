package arrays.basics;

/*
 Problem : Max Consecutive Ones | LeetCode 485
 Link    : https://leetcode.com/problems/max-consecutive-ones/

 Problem Statement:
 Given a binary array nums, return the maximum number of consecutive 1's in the array.

 Idea / Approach:
 - Traverse the array once
 - Count consecutive 1s
 - Reset count when 0 appears
 - Keep track of maximum count

 Time Complexity : O(n)
 Space Complexity: O(1)
*/

public class MaxConsecutiveOnes {
    static int findMaxConsecutiveOnes(int[] nums) {

        int maxConsecutive = 0;   // maximum consecutive 1s found so far
        int currentCount = 0;    // current count of consecutive 1s

        for (int num : nums) {
            if (num == 1) {
                currentCount++;
                maxConsecutive = Math.max(maxConsecutive, currentCount);
            } else {
                currentCount = 0; // reset when 0 is found
            }
        }

        return maxConsecutive;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,0,1,1,1,1};
        System.out.println(findMaxConsecutiveOnes(arr));
    }
}

