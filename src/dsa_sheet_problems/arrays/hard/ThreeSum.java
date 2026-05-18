package dsa_sheet_problems.arrays.hard;

import java.util.*;

/**
 * Problem: LeetCode 15 - 3Sum
 * Link: https://leetcode.com/problems/3sum/
 * * Approach: Brute Force
 * - Logic: Use three nested loops to find all combinations of triplets.
 * If their sum is zero, sort the triplet and add it to a Set to filter out duplicates.
 * * Time Complexity: O(N^3 * log(3)) -> O(N^3) due to the three nested loops.
 * * Space Complexity: O(M) where M is the number of unique triplets stored in the Set.
 */
public class ThreeSum {

    static List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Set<List<Integer>> result = new HashSet<>();

        // Three nested loops to pick triplets
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);

                        // Sort to ensure duplicate triplets look identical for the HashSet
                        Collections.sort(list);
                        result.add(list);
                    }
                }
            }
        }
        return new ArrayList<>(result);
    }

    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> res = threeSum(nums);
        System.out.println(res);
    }
}