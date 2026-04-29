package dsa_sheet_problems.arrays.easy;

/**
 * Problem: Remove duplicates from a sorted array (in-place).
 * Link: https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 * * Logic:
 * 1. Use two pointers: 'slow' (writer) and 'fast' (reader).
 * 2. 'fast' traverses the array. Whenever it finds a new unique element
 *    (arr[fast] != arr[slow]), it moves 'slow' forward and writes the value there.
 * 3. The unique elements will be in the first (slow + 1) positions.
 * * Time Complexity: O(N)
 * * Space Complexity: O(1)
 */
public class RemoveDuplicates {

    public static int removeDuplicates(int[] arr) {
        if (arr.length == 0) return 0;

        int slow = 0; // Points to the last found unique element

        for (int fast = 1; fast < arr.length; fast++) {
            // If we find a new unique element
            if (arr[fast] != arr[slow]) {
                slow++;
                arr[slow] = arr[fast];
            }
        }

        // Returns the count of unique elements
        return slow + 1;
    }

    public static void main(String[] args) {
        int[] arr = {0, 0, 1, 2, 2, 3, 3};

        int k = removeDuplicates(arr);

        System.out.println("Number of unique elements: " + k);
        System.out.print("Modified array (first " + k + " elements): ");
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}