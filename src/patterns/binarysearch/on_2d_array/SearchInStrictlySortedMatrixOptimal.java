package patterns.binarysearch.on_2d_array;

/**
 * Problem:
 * Search an element in a STRICTLY SORTED 2D matrix.
 *
 * Strictly Sorted means:
 * 1. Each row is sorted
 * 2. Last element of a row < first element of the next row
 *
 * Because of this property, the entire matrix can be treated
 * as one single sorted 1D array.
 *
 * We apply Binary Search on this virtual 1D array.
 *
 * Time Complexity: O(log(m * n))
 * Space Complexity: O(1)
 *
 * Related Problem:
 * LeetCode 74 - Search a 2D Matrix
 */
public class SearchInStrictlySortedMatrixOptimal {

    static boolean search(int[][] matrix, int target) {

        // Total number of rows in the matrix
        int rows = matrix.length;

        // Total number of columns in the matrix
        int cols = matrix[0].length;

        // Binary search range on the "virtual" 1D array
        // Total elements = rows * cols
        int start = 0;
        int end = rows * cols - 1;

        while (start <= end) {

            // Find middle index of the virtual 1D array
            int mid = start + (end - start) / 2;

            /*
             * Convert 1D index (mid) into 2D indices (row, col)
             *
             * Why this works:
             * - Each row contains exactly 'cols' elements
             * - mid / cols  -> tells how many full rows are crossed (row index)
             * - mid % cols  -> tells position inside that row (column index)
             */
            int row = mid / cols;
            int col = mid % cols;

            // Value at the calculated row and column
            int value = matrix[row][col];

            // If target is found, return true
            if (value == target) {
                return true;
            }
            // search right half
            else if (value < target) {
                start = mid + 1;
            }
            // search left half
            else {
                end = mid - 1;
            }
        }

        // Target not found
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        int target = 10;

        System.out.println(search(matrix, target)); // true
    }
}
