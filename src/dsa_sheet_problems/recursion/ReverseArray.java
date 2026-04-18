package dsa_sheet_problems.recursion;

/**
 * Problem: Reverse an array using recursion.
 * Link: https://www.geeksforgeeks.org/problems/reverse-an-array/1
 * * Logic:
 * 1. Base Case: If we reach the middle index (l/2), stop.
 * 2. Recursive Step: Swap the element at 'i' with its mirror element at 'l-i-1'.
 * 3. Step Forward: Call helper with i+1.
 * * Time Complexity: O(N)
 * * Space Complexity: O(N) (due to the recursive stack)
 */
public class ReverseArray {

    public static void reverse(int[] arr) {
        helper(arr, 0);
    }

    private static void helper(int[] arr, int i) {
        int n = arr.length;

        // Base case: Stop when we've crossed the halfway point
        if (i >= n / 2) {
            return;
        }

        // Swap logic: Mirror index is (n - i - 1)
        int j = n - i - 1;
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        // Recursive call
        helper(arr, i + 1);
    }

    public static void main(String[] args) {
        int[] arr = {10, 4, -19, 1, 8, 72};
        reverse(arr);

        System.out.print("Reversed array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}