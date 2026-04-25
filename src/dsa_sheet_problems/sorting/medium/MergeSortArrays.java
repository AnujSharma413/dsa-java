package dsa_sheet_problems.sorting.medium;

/**
 * Problem: LeetCode 88 - Merge Sorted Array
 * Link: https://leetcode.com/problems/merge-sorted-array/
 * * Logic:
 * 1. Use three pointers:
 * - i: points to the last valid element in nums1 (index m-1)
 * - j: points to the last element in nums2 (index n-1)
 * - idx: points to the last index of nums1 (m+n-1)
 * 2. Compare nums1[i] and nums2[j], place the larger value at nums1[idx].
 * 3. Decrement pointers accordingly.
 * * Time Complexity: O(m + n) - Linear traversal.
 * Space Complexity: O(1) - Done in-place.
 */
public class MergeSortArrays {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;       // Pointer for nums1 valid part
        int j = n - 1;       // Pointer for nums2
        int idx = m + n - 1; // Pointer for the total capacity of nums1

        // Traverse both arrays from back to front
        while (i >= 0 && j >= 0) {
            if (nums1[i] >= nums2[j]) {
                nums1[idx] = nums1[i];
                i--;
            } else {
                nums1[idx] = nums2[j];
                j--;
            }
            idx--;
        }

        // If elements remain in nums2, copy them over
        // (No need to check nums1, as they are already in place)
        while (j >= 0) {
            nums1[idx] = nums2[j];
            idx--;
            j--;
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;

        System.out.println("Merging arrays...");
        merge(nums1, m, nums2, n);

        for (int num : nums1) {
            System.out.print(num + " ");
        }
    }
}