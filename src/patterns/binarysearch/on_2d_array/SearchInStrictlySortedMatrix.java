package patterns.binarysearch.on_2d_array;

import java.util.Arrays;

/**
 * Problem:
 * Search for a target element in a STRICTLY SORTED 2D matrix.
 *
 * Strictly Sorted Matrix Conditions:
 * 1. Each row is sorted in ascending order.
 * 2. The first element of each row is greater than the last element of the previous row.
 *
 * Example Matrix:
 * [
 *   { 1,  2,  3,  4 },
 *   { 5,  6,  7,  8 },
 *   { 9, 10, 11, 12 },
 *   {13, 14, 15, 16 }
 * ]
 *
 * Approach Used (Kunal-Kushwaha):
 * - Binary Search on rows + columns
 * - First handle edge cases (single row / single column)
 * - Reduce search space to two rows using middle column
 * - Apply binary search on the appropriate half
 *
 * Time Complexity:
 * O(log(rows) + log(cols))
 * Space Complexity:
 * O(1)
 */
public class SearchInStrictlySortedMatrix {

    // Main search method
    static int[] search(int[][] matrix, int target) {

        int rows = matrix.length;
        int cols = matrix[0].length;

        // Edge case: empty matrix
        if (cols == 0) {
            return new int[]{-1, -1};
        }

        // Edge case: only one row -> simple binary search
        if (rows == 1) {
            return binarySearch(matrix, 0, 0, cols - 1, target);
        }

        // Edge case: only one column -> binary search on rows
        if (cols == 1) {
            int top = 0;
            int bottom = rows - 1;

            while (top <= bottom) {
                int mid = top + (bottom - top) / 2;

                if (matrix[mid][0] == target) {
                    return new int[]{mid, 0};
                } else if (matrix[mid][0] < target) {
                    top = mid + 1;
                } else {
                    bottom = mid - 1;
                }
            }
            return new int[]{-1, -1};
        }

        // Initialize row pointers
        int rStart = 0;
        int rEnd = rows - 1;

        // Middle column index
        int cMid = (cols - 1) / 2;

        // Reduce the number of rows to 2
        while (rStart < (rEnd - 1)) {
            int mid = rStart + (rEnd - rStart) / 2;

            if (matrix[mid][cMid] == target) {
                return new int[]{mid, cMid};
            } else if (matrix[mid][cMid] < target) {
                rStart = mid;
            } else {
                rEnd = mid;
            }
        }

        // Now only two rows remain: rStart and rStart + 1

        // Check the middle column of both rows
        if (matrix[rStart][cMid] == target) {
            return new int[]{rStart, cMid};
        }

        if (matrix[rStart + 1][cMid] == target) {
            return new int[]{rStart + 1, cMid};
        }

        // Search in 4 possible parts

        // 1st half (left part of first row)
        if (target <= matrix[rStart][cMid - 1]) {
            return binarySearch(matrix, rStart, 0, cMid - 1, target);
        }

        // 2nd half (right part of first row)
        if (target >= matrix[rStart][cMid + 1] &&
                target <= matrix[rStart][cols - 1]) {
            return binarySearch(matrix, rStart, cMid + 1, cols - 1, target);
        }

        // 3rd half (left part of second row)
        if (target <= matrix[rStart + 1][cMid - 1]) {
            return binarySearch(matrix, rStart + 1, 0, cMid - 1, target);
        }

        // 4th half (right part of second row)
        return binarySearch(matrix, rStart + 1, cMid + 1, cols - 1, target);
    }

    // Standard binary search on a single row
    static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target) {

        while (cStart <= cEnd) {
            int mid = cStart + (cEnd - cStart) / 2;

            if (matrix[row][mid] == target) {
                return new int[]{row, mid};
            } else if (matrix[row][mid] < target) {
                cStart = mid + 1;
            } else {
                cEnd = mid - 1;
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        int target = 9;
        System.out.println(Arrays.toString(search(matrix, target)));
    }
}
