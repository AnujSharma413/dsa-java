package dsa_sheet_problems.arrays.easy;

/**
 * Problem: Find the largest element in an array.
 * Logic:
 * 1. Initialize a 'max' variable with the first element.
 * 2. Traverse the array from the second element to the end.
 * 3. Update 'max' whenever a larger element is found.
 * * Time Complexity: O(N) - We visit every element once.
 * * Space Complexity: O(1) - Only using one extra variable.
 */
public class LargestElement {

    public static int findLargest(int[] arr) {
        // Safety check for empty arrays
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty");
        }

        int max = arr[0];

        // Linear scan: O(N)
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {1, 8, 7, 56, 90};
        System.out.println("The largest element is: " + findLargest(arr));
    }
}