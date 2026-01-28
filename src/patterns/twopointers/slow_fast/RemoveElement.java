package patterns.twopointers.slow_fast;

/**
 * Problem:
 * Remove all occurrences of a given value from the array in-place.
 * Return the number of remaining elements.
 *
 * Constraint:
 * - Do not use extra space
 * - Modify the array in-place
 * - Order of remaining elements can be changed
 *
 * Pattern Used:
 * Slow–Fast Pointer
 *
 * Idea:
 * - slow pointer tracks position to place valid elements
 * - fast pointer scans the array
 * - when arr[fast] != val,
 *   copy arr[fast] to arr[slow] and move slow forward
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Related Problem:
 * - LeetCode 27: Remove Element
 */
public class RemoveElement {

    static int removeElement(int[] arr, int val) {

        // slow points to index where next valid element should be placed
        int slow = 0;

        // fast scans the entire array
        for (int fast = 0; fast < arr.length; fast++) {

            // keep element only if it is not equal to val
            if (arr[fast] != val) {
                arr[slow] = arr[fast];
                slow++;
            }
        }

        // slow represents the count of remaining elements
        return slow;
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 2, 3};
        int val = 3;
        System.out.println(removeElement(arr, val)); // Output: 2
    }
}
