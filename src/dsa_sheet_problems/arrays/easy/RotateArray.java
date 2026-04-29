package dsa_sheet_problems.arrays.easy;

/**
 * Problem: Rotate Array to the right by k steps.
 * Link: https://leetcode.com/problems/rotate-array/
 * * Logic (Reversal Algorithm):
 * 1. Reverse the entire array.
 * 2. Reverse the first k elements.
 * 3. Reverse the remaining n-k elements.
 * * Time Complexity: O(N) - Three passes over the array.
 * * Space Complexity: O(1) - In-place rotation.
 */
public class RotateArray {

    public static void rotateArray(int[] arr, int k) {
        int n = arr.length;
        if (n == 0) return;

        // Handle cases where k > n
        k = k % n;
        if (k == 0) return;

        // Step 1: Reverse the whole array
        // [1, 2, 3, 4, 5] -> [5, 4, 3, 2, 1]
        reverse(arr, 0, n - 1);

        // Step 2: Reverse the first k elements
        // [5, 4, 3, 2, 1] -> [3, 4, 5, 2, 1]
        reverse(arr, 0, k - 1);

        // Step 3: Reverse the rest
        // [3, 4, 5, 2, 1] -> [3, 4, 5, 1, 2]
        reverse(arr, k, n - 1);
    }

    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 3;

        System.out.println("Original: 1 2 3 4 5 | k = 3");
        rotateArray(arr, k);

        System.out.print("Rotated:  ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}