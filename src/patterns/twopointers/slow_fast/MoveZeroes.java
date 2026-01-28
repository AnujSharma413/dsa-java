package patterns.twopointers.slow_fast;

/**
 * Problem:
 * Move all zeros to the end of the array in-place
 * while maintaining the relative order of non-zero elements.
 *
 * Constraint:
 * - Do not use extra space
 * - Modify the array in-place
 *
 * Pattern Used:
 * Slow–Fast Pointer
 *
 * Idea:
 * - slow pointer tracks index to place next non-zero element
 * - fast pointer scans the entire array
 * - copy non-zero elements forward
 * - fill remaining positions with zeros
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Related Problem:
 * - LeetCode 283: Move Zeroes
 */
public class MoveZeroes {

    static void moveZeroes(int[] arr) {

        // slow points to index where next non-zero should be placed
        int slow = 0;

        // fast scans the array
        for (int fast = 0; fast < arr.length; fast++) {
            if (arr[fast] != 0) {
                arr[slow] = arr[fast];
                slow++;
            }
        }

        // fill remaining positions with zeros
        while (slow < arr.length) {
            arr[slow] = 0;
            slow++;
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        moveZeroes(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
