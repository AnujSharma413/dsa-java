package dsa_sheet_problems.sorting.easy;

/**
 * Problem: Insertion Sort Implementation
 * Logic:
 * 1. Divide the array into a sorted and an unsorted part.
 * 2. Pick elements from the unsorted part and place them in the correct
 * position within the sorted part.
 * * Time Complexity: O(N^2) (Worst), O(N) (Best - if already sorted)
 * * Space Complexity: O(1) (In-place sort)
 */
public class InsertionSort {

    public static void insertionSort(int[] arr) {
        // Iterate through the array
        for (int i = 0; i < arr.length - 1; i++) {
            // Inner loop: Check backward and swap if current element is smaller
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                } else {
                    // Optimization: If the element is already in the right spot,
                    // we don't need to check further left.
                    break;
                }
            }
        }
    }

    // Helper method to keep main code clean
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 1, 2};
        System.out.println("Before sorting: 4 5 1 2");

        insertionSort(arr);

        System.out.print("After sorting: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}