package patterns.binarysearch.on_2d_array;

/**
 * Problem:
 * LeetCode 240: Search a 2D Matrix II
 *
 * The matrix has the following properties:
 * - Integers in each row are sorted in ascending order (left → right)
 * - Integers in each column are sorted in ascending order (top → bottom)
 *
 * Return:
 * - true if target exists in the matrix
 * - false otherwise
 *
 * Approach: Staircase Search (Optimized Binary Search)
 *
 * - Start from the TOP-RIGHT corner of the matrix
 * - At any position:
 *     • If current == target → found
 *     • If current < target  → move DOWN (row++)
 *     • If current > target  → move LEFT (col--)
 *
 * Why this works:
 * - Moving left decreases value (row is sorted)
 * - Moving down increases value (column is sorted)
 *
 * Time Complexity:
 * O(m + n)
 * Space Complexity:
 * O(1)
 */
public class SearchIn2DMatrix {

    public static boolean searchMatrix(int[][] matrix, int target) {

        // Edge case handling
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int row = 0;
        int col = matrix[0].length - 1; // start from top-right

        // Staircase traversal
        while (row < matrix.length && col >= 0) {

            if (matrix[row][col] == target) {
                return true;
            }
            else if (matrix[row][col] < target) {
                // Move down to increase value
                row++;
            }
            else {
                // Move left to decrease value
                col--;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };

        int target = 5;
        System.out.println(searchMatrix(matrix, target)); // true
    }
}
