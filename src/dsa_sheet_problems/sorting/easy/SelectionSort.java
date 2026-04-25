package dsa_sheet_problems.sorting.easy;

/**
 * Problem: Selection Sort Implementation
 * Logic:
 * 1. Divide the array into a sorted part and an unsorted part.
 * 2. In each iteration, find the minimum element in the unsorted part.
 * 3. Swap it with the first element of the unsorted part.
 * * Time Complexity: O(N^2) (Always O(N^2), even if already sorted)
 * * Space Complexity: O(1) (In-place sort)
 */
public class SelectionSort {

    public static void sort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            // Assume the current index is the minimum
            int minIndex = i;

            // Find the true minimum in the remaining unsorted array
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum with the element at index i
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 1, 2, 5};

        System.out.println("Before sorting: 4 1 2 5");
        sort(arr);

        System.out.print("After sorting: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}