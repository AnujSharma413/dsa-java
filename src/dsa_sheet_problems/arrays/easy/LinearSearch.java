package dsa_sheet_problems.arrays.easy;

/**
 * Problem: Find the index of a specific element in an array.
 * Logic:
 * 1. Start from the first element (index 0).
 * 2. Compare the target 'x' with each element.
 * 3. If a match is found, return the current index.
 * 4. If the loop ends without a match, return -1.
 * * Time Complexity: O(N) - Worst case, the element is at the end or not present.
 * * Space Complexity: O(1) - No extra memory used.
 */
public class LinearSearch {

    public static int search(int[] arr, int x) {
        // Handle edge case for null array
        if (arr == null) return -1;

        for (int i = 0; i < arr.length; i++) {
            // Check if current element matches target
            if (arr[i] == x) {
                return i;
            }
        }

        // Target not found in the entire array
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 3, 4, 7, 5};
        int x = 7;

        int result = search(arr, x);

        if (result != -1) {
            System.out.println("Element " + x + " found at index: " + result);
        } else {
            System.out.println("Element " + x + " not found in the array.");
        }
    }
}