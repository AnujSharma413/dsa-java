package recursion.sorting;

import java.util.Arrays;

/**
 * PURPOSE:
 * Implement SELECTION SORT using RECURSION.
 *
 * Strategy used:
 * - In each pass, find the MAXIMUM element
 * - Place it at the end of the unsorted portion
 *
 * This mimics iterative selection sort:
 *
 * for (row = n; row > 0; row--) {
 *     find max element in range [0, row-1]
 *     swap max with element at (row-1)
 * }
 *
 * Parameters:
 * row -> size of unsorted portion
 * col -> current index being compared
 * max -> index of maximum element found so far
 *
 * Time Complexity: O(N^2)
 * Space Complexity: O(N) (recursion stack)
 */
public class SelectionSort {

    public static void main(String[] args) {

        int[] arr = {4, 3, 2, 1};

        // row starts from array length
        sort(arr, arr.length, 0, 0);

        System.out.println(Arrays.toString(arr)); // [1, 2, 3, 4]
    }

    static void sort(int[] arr, int row, int col, int max) {

        // Base Condition:
        // All elements sorted
        if (row == 0) {
            return;
        }

        // Traverse current unsorted portion [0 .. row-1]
        if (col < row) {

            // Update max index if larger element found
            if (arr[col] > arr[max]) {
                sort(arr, row, col + 1, col);
            }
            else {
                sort(arr, row, col + 1, max);
            }
        }
        else {
            // Place maximum element at correct position
            int temp = arr[max];
            arr[max] = arr[row - 1];
            arr[row - 1] = temp;

            // Reduce unsorted portion and restart comparison
            sort(arr, row - 1, 0, 0);
        }
    }
}