package dsa_sheet_problems.hashing;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Problem: Count Elements With Maximum Frequency.
 * Link: https://leetcode.com/problems/count-elements-with-maximum-frequency/
 * * Logic:
 * 1. Build a frequency map (element -> count).
 * 2. Find the maximum frequency value present in the map.
 * 3. Sum up the counts of all elements that have this maximum frequency.
 * * Time Complexity: O(N) - We iterate through the array once and the map values once.
 * Space Complexity: O(N) - To store unique elements in the map.
 */
public class MaxFrequencyElements {

    public static int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        // Step 1: Build frequency map
        for (int x : nums) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        // Step 2: Find the maximum frequency value
        int maxFreq = Collections.max(map.values());

        // Step 3: Sum the frequencies of elements that match maxFreq
        int totalCount = 0;
        for (int freq : map.values()) {
            if (freq == maxFreq) {
                totalCount += freq;
            }
        }

        return totalCount;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 2, 4, 5};
        System.out.println("Total count of elements with max frequency: " + maxFrequencyElements(arr));
    }
}