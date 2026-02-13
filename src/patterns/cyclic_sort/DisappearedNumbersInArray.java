package patterns.cyclic_sort;

import java.util.ArrayList;
import java.util.List;

/**
 * Problem: Find All Numbers Disappeared in an Array (LeetCode 448)
 *
 * Given an array of size n where:
 * - Elements are in the range [1, n]
 * - Some elements appear twice, others appear once
 *
 * Task:
 * Return all numbers in the range [1, n] that do NOT appear in the array.
 *
 * Approach: Cyclic Sort
 *
 * Idea:
 * - Each number x should be placed at index (x - 1)
 * - After arranging, any index i where arr[i] != i + 1
 *   means (i + 1) is missing
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)   (excluding output list)
 */
public class DisappearedNumbersInArray {

    static List<Integer> disappearedNumbers(int[] arr) {

        List<Integer> result = new ArrayList<>();
        int i = 0;

        // Place each number at its correct index if possible
        while (i < arr.length) {

            int correct = arr[i] - 1;

            /*
             * Swap only when the current element is not
             * already at its correct position.
             *
             * Duplicate values will fail this condition
             * and automatically move the pointer forward.
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
         * - Then (j + 1) is missing from the array
         */
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) {
                result.add(j + 1);
            }
        }

        return result;
    }

    // Swap two elements
    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(disappearedNumbers(arr)); // Output: [5, 6]
    }
}
