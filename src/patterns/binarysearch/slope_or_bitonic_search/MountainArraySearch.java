package patterns.binarysearch.slope_or_bitonic_search;

/**
 * Problem:
 * Find a target element in a Mountain Array | (LeetCode 1095)
 *
 * Mountain Array:
 * - First strictly increasing
 * - Then strictly decreasing
 * - Exactly one peak element
 *
 * Constraints (LeetCode):
 * - Direct array access is NOT allowed
 * - Only MountainArray interface methods can be used:
 *      - get(index)
 *      - length()
 *
 * Approach:
 * 1. Find the peak index using Binary Search (slope technique)
 * 2. Apply Binary Search on the left (ascending part)
 * 3. If not found, apply Binary Search on the right (descending part)
 *
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */

/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
class Solution {
     // Binary Search on a subarray of MountainArray.
    static int binarySearch(MountainArray arr, int start, int end, int target, boolean asc) {

        while (start <= end) {

            int mid = start + (end - start) / 2;
            int value = arr.get(mid); // access through interface

            // target found
            if (value == target) {
                return mid;
            }

            if (asc) {
                // ascending order
                if (target < value) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                // descending order
                if (target > value) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }


     // Finds the peak index in the Mountain Array.
    static int peakElement(MountainArray arr) {

        int start = 0;
        int end = arr.length() - 1;

        while (start < end) {

            int mid = start + (end - start) / 2;

            // descending slope, peak lies on left side
            if (arr.get(mid) > arr.get(mid + 1)) {
                end = mid;
            }
            // ascending slope, peak lies on right side
            else {
                start = mid + 1;
            }
        }
        // start == end is the peak index
        return start;
    }


     // Main LeetCode function.
    public int findInMountainArray(int target, MountainArray mountainArr) {

        // step 1: find peak index
        int peak = peakElement(mountainArr);

        // step 2: search in left (ascending) part
        int leftSearch = binarySearch(mountainArr, 0, peak, target, true);
        if (leftSearch != -1) {
            return leftSearch;
        }

        // step 3: search in right (descending) part
        return binarySearch(mountainArr, peak + 1, mountainArr.length() - 1, target, false);
    }
}
