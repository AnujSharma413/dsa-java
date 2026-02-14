package patterns.cyclic_sort;

/**
 * Problem: Find the Duplicate Number (LeetCode 287)
 *
 * Given an array of size n + 1 where:
 * - Numbers are in the range [1, n]
 * - Only one number is duplicated (may appear more than once)
 *
 * Task:
 * Find and return the duplicate number.
 *
 * Approach: Cyclic Sort
 *
 * Idea:
 * - Each number x should be placed at index (x - 1)
 * - While rearranging, the duplicate number will prevent
 *   correct placement because its target index is already occupied
 * - After cyclic sort, the index where arr[i] != i + 1
 *   reveals the duplicate value
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Note:
 * This modifies the input array.
 */
public class DuplicateNumber {

    static int duplicateNumber(int[] arr) {

        int i = 0;

        // Place each number at its correct index if possible
        while (i < arr.length) {

            int correct = arr[i] - 1;

            /*
             * Swap only when the current element is not
             * at its correct position.
             *
             * When a duplicate exists, arr[i] == arr[correct]
             * and swapping is prevented, allowing the loop to move forward.
             */
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }

        /*
         * After cyclic sort:
         * - The index where arr[j] != j + 1
         *   contains the duplicate number
         */
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) {
                return arr[j];
            }
        }

        return -1;
    }

    // Swap two elements
    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 2};
        System.out.println(duplicateNumber(arr)); // Output: 2
    }
}
