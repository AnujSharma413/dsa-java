package patterns.cyclic_sort;

import java.util.ArrayList;
import java.util.List;

/**
 * Problem: Find All Duplicates in an Array (LeetCode 442)
 *
 * Given an array of integers where:
 * - Each integer is in the range [1, n]
 * - Some elements appear twice and others appear once
 *
 * Task:
 * Return all elements that appear exactly twice.
 *
 * Approach: Cyclic Sort
 *
 * Idea:
 * - Each number x should be placed at index (x - 1)
 * - Duplicate numbers cannot be placed correctly because
 *   their target index is already occupied
 * - After cyclic sort, any index i where arr[i] != i + 1
 *   indicates that arr[i] is a duplicate
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)   (excluding output list)
 *
 * Note:
 * This algorithm modifies the input array.
 */
public class FindDuplicates {

    static List<Integer> findDuplicates(int[] arr) {

        List<Integer> result = new ArrayList<>();
        int i = 0;

        // Rearrange elements using cyclic sort
        while (i < arr.length) {

            int correct = arr[i] - 1;

            /*
             * Swap only when the current element is not
             * at its correct index.
             *
             * If a duplicate exists, arr[i] == arr[correct],
             * so swapping is avoided and we move forward.
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
         * - Then arr[j] is a duplicate value
         */
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) {
                result.add(arr[j]);
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
        System.out.println(findDuplicates(arr)); // Output: [2, 3]
    }
}
