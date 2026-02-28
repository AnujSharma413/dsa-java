package recursion.arrays;

/**
 * PURPOSE:
 * Check whether an array is sorted (non-decreasing order)
 * using recursion.
 *
 * Core Idea:
 * - Compare current element with the next element
 * - Move index forward using recursion
 *
 * This demonstrates INDEX-BASED RECURSION on arrays.
 */
public class CheckArraySortedRecursive {

    // Entry function
    static boolean isSorted(int[] arr) {

        // Edge case: empty or single-element array is always sorted
        if (arr.length < 2) {
            return true;
        }

        // Start recursion from index 0
        return helper(arr, 0);
    }

    /**
     * Helper function:
     * arr   -> input array
     * index -> current position being checked
     */
    static boolean helper(int[] arr, int index) {

        // Base Condition:
        // If we reach the last index, array is sorted till now
        if (index == arr.length - 1) {
            return true;
        }

        // Current element must be less than OR equal to next
        // This allows duplicate values (valid sorted array)
        // AND remaining array must also be sorted
        return arr[index] <= arr[index + 1]
                && helper(arr, index + 1);
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 5, 6, 7, 7};
        System.out.println(isSorted(arr)); // true
    }
}