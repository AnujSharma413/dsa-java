package dsa_sheet_problems.arrays.easy;

/**
 * Problem: Move all zeroes to the end of the array while maintaining order.
 * Link: https://leetcode.com/problems/move-zeroes/
 * * Logic:
 * 1. 'slow' pointer tracks the position to place the next non-zero element.
 * 2. 'fast' pointer scans the array for non-zero elements.
 * 3. After moving all non-zeros, fill the remaining positions with zero.
 * * Time Complexity: O(N) - Linear scan.
 * * Space Complexity: O(1) - Constant space.
 */
public class MoveZeroes {

    public static void moveZeroes(int[] arr) {
        if (arr == null || arr.length <= 1) return;

        int slow = 0;

        // Step 1: Shift non-zero elements to the front
        for (int fast = 0; fast < arr.length; fast++) {
            if (arr[fast] != 0) {
                arr[slow] = arr[fast];
                slow++;
            }
        }

        // Step 2: Fill the rest of the array with zeroes
        while (slow < arr.length) {
            arr[slow] = 0;
            slow++;
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 2, 3, 4, 0};

        System.out.print("Original: ");
        printArray(arr);

        moveZeroes(arr);

        System.out.print("Result:   ");
        printArray(arr);
    }

    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}