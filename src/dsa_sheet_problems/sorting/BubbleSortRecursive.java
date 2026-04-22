package dsa_sheet_problems.sorting;

/**
 * Problem: Recursive Bubble Sort Implementation.
 * Logic:
 * 1. 'row' acts as the end-boundary of the unsorted part (starts at N-1).
 * 2. 'col' traverses the array to swap adjacent elements (the bubbling process).
 * 3. Base Case: If row == 0, the entire array is sorted.
 * * Time Complexity: O(N^2)
 * Space Complexity: O(N) (due to recursion stack depth)
 */
public class BubbleSortRecursive {

    public static void sort(int[] arr) {
        // We start with the full array length
        int n = arr.length;
        // 'row' marks the index where the largest unsorted element should end up
        helper(arr, n - 1, 0);
    }

    private static void helper(int[] arr, int row, int col) {
        // Base case: If row reaches 0, array is fully sorted
        if (row == 0) {
            return;
        }

        // Bubbling phase: Compare and swap adjacent elements
        if (col < row) {
            if (arr[col] > arr[col + 1]) {
                // Swap
                int temp = arr[col];
                arr[col] = arr[col + 1];
                arr[col + 1] = temp;
            }
            // Move to next column
            helper(arr, row, col + 1);
        } else {
            // End of pass: Reduce the boundary (row) and reset column to 0
            helper(arr, row - 1, 0);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 7, 2, 4, 3, 8};

        System.out.println("Original array: {1, 7, 2, 4, 3, 8}");
        sort(arr);

        System.out.print("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}