package recursion.sorting;

import java.util.Arrays;

/**
 * PURPOSE:
 * Implement BUBBLE SORT using RECURSION.
 *
 * Core Idea:
 * - `row` represents number of passes remaining
 * - `col` represents current comparison index
 *
 * This mimics the nested loops of iterative bubble sort:
 *
 * for (row = n-1; row > 0; row--) {
 *     for (col = 0; col < row; col++) {
 *         swap if arr[col] > arr[col+1]
 *     }
 * }
 *
 * Time Complexity: O(N^2)
 * Space Complexity: O(N) due to recursion stack
 */
public class BubbleSort {

    static void sort(int[] arr, int row, int col) {

        // Base Condition:
        // All passes completed
        if (row == 0) {
            return;
        }

        // Compare adjacent elements in current pass
        if (col < row) {

            // Swap if elements are in wrong order
            if (arr[col] > arr[col + 1]) {
                int temp = arr[col];
                arr[col] = arr[col + 1];
                arr[col + 1] = temp;
            }

            // Move to next column (inner loop)
            sort(arr, row, col + 1);
        }
        else {
            // One full pass completed
            // Reduce row and reset column
            sort(arr, row - 1, 0);
        }
    }

    public static void main(String[] args) {

        int[] arr = {4, 3, 2, 1};

        // row starts from last index (n - 1)
        sort(arr, arr.length - 1, 0);

        System.out.println(Arrays.toString(arr)); // [1, 2, 3, 4]
    }
}