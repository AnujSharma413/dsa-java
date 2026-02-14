package patterns.cyclic_sort;

/**
 * Problem: First Missing Positive (LeetCode 41)
 *
 * Given an unsorted integer array, find the smallest
 * missing positive integer.
 *
 * Constraints:
 * - Time Complexity: O(n)
 * - Space Complexity: O(1)
 *
 * Approach: Modified Cyclic Sort
 *
 * Key Observations:
 * - We only care about positive numbers in the range [1, n]
 * - Any number <= 0 or > n cannot affect the answer
 *
 * Idea:
 * - Place each valid number x at index (x - 1)
 * - Ignore invalid numbers (<= 0 or > n)
 * - After rearranging, the first index i where
 *   arr[i] != i + 1 gives the missing positive
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Note:
 * This algorithm modifies the input array.
 */
public class FirstMissingPositive {

    public static int firstMissingPositive(int[] arr) {

        int i = 0;

        // Place valid numbers at their correct positions
        while (i < arr.length) {

            int correct = arr[i] - 1;

            /*
             * Swap only when:
             * 1. Current number is positive
             * 2. Current number is within array bounds
             * 3. Current number is not already at its correct index
             */
            if (arr[i] > 0 &&
                    arr[i] <= arr.length &&
                    arr[i] != arr[correct]) {

                swap(arr, i, correct);
            } else {
                i++;
            }
        }

        /*
         * After cyclic sort:
         * - The first index where arr[index] != index + 1
         *   gives the smallest missing positive number
         */
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                return index + 1;
            }
        }

        // If all numbers from 1 to n are present
        return arr.length + 1;
    }

    // Swap two elements
    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, -1, 1};
        System.out.println(firstMissingPositive(arr)); // Output: 2
    }
}
