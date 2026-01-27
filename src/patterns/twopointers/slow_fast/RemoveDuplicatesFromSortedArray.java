package patterns.twopointers.slow_fast;
/**
 * Problem:
 * Remove duplicates from a sorted array in-place.
 * Return the number of unique elements.
 *
 * Constraint:
 * - Do not use extra space
 * - Modify the array in-place
 *
 * Pattern Used:
 * Slow–Fast Pointer
 *
 * Idea:
 * - slow pointer tracks position of last unique element
 * - fast pointer scans the array
 * - when a new element is found (arr[fast] != arr[slow]),
 *   move slow forward and copy arr[fast] there
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Related Problem:
 * - LeetCode 26: Remove Duplicates from Sorted Array
 */
public class RemoveDuplicatesFromSortedArray {

    static int removeDuplicates(int[] arr) {

        // slow points to last unique element
        int slow = 0;

        // fast scans the array
        for (int fast = 1; fast < arr.length; fast++) {

            // new unique element found
            if (arr[fast] != arr[slow]) {
                slow++;                 // move slow forward
                arr[slow] = arr[fast]; // copy unique element
            }
        }

        // number of unique elements = slow index + 1
        return slow + 1;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 2};
        System.out.println(removeDuplicates(arr)); // Output: 3
    }
}
