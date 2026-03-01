package recursion.search;

/**
 * PURPOSE:
 * Search an element in a ROTATED SORTED ARRAY using RECURSION.
 *
 * Example:
 * Original sorted array: [1, 3, 4, 5, 6, 7]
 * Rotated array:         [6, 7, 1, 3, 4, 5]
 *
 * Core Idea:
 * - At least ONE half of the array is always sorted
 * - Identify the sorted half
 * - Decide whether target lies in that half
 * - Recursively search only the valid half
 *
 * Time Complexity:
 * - O(log N) (same as binary search)
 *
 * Space Complexity:
 * - O(log N) due to recursion stack
 */
public class SearchInRotatedSortedArray {

    static int rotatedSortedArray(int[] arr, int target, int start, int end) {

        // Base Condition:
        // If search space is exhausted
        if (start > end) {
            return -1;
        }

        // Calculate mid safely
        int mid = start + (end - start) / 2;

        // If mid element is target
        if (arr[mid] == target) {
            return mid;
        }

        /*
         * CASE 1:
         * Left half is sorted
         */
        if (arr[start] <= arr[mid]) {

            // Target lies in left sorted half
            if (target >= arr[start] && target < arr[mid]) {
                return rotatedSortedArray(arr, target, start, mid - 1);
            }
            // Target lies in right half
            else {
                return rotatedSortedArray(arr, target, mid + 1, end);
            }
        }

        /*
         * CASE 2:
         * Right half is sorted
         */
        if (target > arr[mid] && target <= arr[end]) {
            return rotatedSortedArray(arr, target, mid + 1, end);
        }

        return rotatedSortedArray(arr, target, start, mid - 1);
    }

    public static void main(String[] args) {

        int[] arr = {6, 7, 1, 3, 4, 5};
        int target = 4;

        System.out.println(rotatedSortedArray(arr, target, 0, arr.length - 1));
        // Output: 4
    }
}