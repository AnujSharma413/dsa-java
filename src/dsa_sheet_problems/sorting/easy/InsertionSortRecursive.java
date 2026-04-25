package dsa_sheet_problems.sorting.easy;

/**
 * Problem: Recursive Insertion Sort Implementation.
 * Logic:
 * 1. Base Case: If n <= 1, return (array of 1 is sorted).
 * 2. Recursive Step: Sort the first n-1 elements recursively.
 * 3. Insertion: Place the n-th element into the correct position in the sorted sub-array.
 * * Time Complexity: O(N^2)
 * * Space Complexity: O(N) (due to recursive call stack)
 */
public class InsertionSortRecursive {

    public static void sort(int[] arr, int n) {
        // Base case: Array of size 1 is already sorted
        if (n <= 1) {
            return;
        }

        // Recursive call: Sort the first n-1 elements
        sort(arr, n - 1);

        // Insertion Logic: Insert the n-th element into the sorted sub-array
        int key = arr[n - 1];
        int j = n - 2;

        // Shift elements to the right to find the correct spot for 'key'
        while (j >= 0 && arr[j] > key) {
            arr[j + 1] = arr[j];
            j--;
        }
        arr[j + 1] = key;
    }

    public static void main(String[] args) {
        int[] arr = {4, 3, 1, 2};

        System.out.println("Before sorting: 4 3 1 2");
        sort(arr, arr.length);

        System.out.print("After sorting: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}