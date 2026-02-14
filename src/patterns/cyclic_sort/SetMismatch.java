package patterns.cyclic_sort;

import java.util.Arrays;

/**
 * Problem: Set Mismatch (LeetCode 645)
 *
 * Given an array representing numbers from 1 to n where:
 * - One number is duplicated
 * - One number is missing
 *
 * Task:
 * Return an array containing:
 * - The duplicated number
 * - The missing number
 *
 * Approach: Cyclic Sort
 *
 * Idea:
 * - Each number x should be placed at index (x - 1)
 * - The duplicate number cannot be placed correctly because
 *   its correct position is already occupied
 * - After cyclic sort, the index where arr[i] != i + 1
 *   gives:
 *      • arr[i]   → duplicated number
 *      • i + 1    → missing number
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Note:
 * This solution modifies the input array.
 */
public class SetMismatch {

    static int[] findErrorNums(int[] arr) {

        int i = 0;

        // Rearrange elements using cyclic sort
        while (i < arr.length) {

            int correct = arr[i] - 1;

            /*
             * Swap only when the current element is not
             * at its correct index.
             *
             * When a duplicate exists, arr[i] == arr[correct],
             * so swapping is skipped and the pointer moves forward.
             */
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }

        /*
         * After cyclic sort:
         * - If arr[j] != j + 1
         *   arr[j] is the duplicate number
         *   j + 1 is the missing number
         */
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) {
                return new int[]{arr[j], j + 1};
            }
        }

        return new int[]{-1, -1};
    }

    // Swap two elements
    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 4};
        int[] ans = findErrorNums(arr);
        System.out.println(Arrays.toString(ans)); // Output: [2, 3]
    }
}
