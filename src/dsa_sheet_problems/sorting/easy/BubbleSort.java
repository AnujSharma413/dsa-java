package dsa_sheet_problems.sorting.easy;

/**
 * Problem: Bubble Sort Implementation
 * Logic: Repeatedly swap adjacent elements if they are in the wrong order.
 * Optimization: Added a 'swapped' flag to exit early if no swaps occur.
 * Time Complexity: O(N^2) (Worst & Average), O(N) (Best case)
 * Space Complexity: O(1) (In-place sort)
 */
public class BubbleSort {

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n; i++) {
            swapped = false; // Reset for every pass

            // Last i elements are already in place
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no two elements were swapped by inner loop, then break
            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 7, 3, 2, 4, 5};
        System.out.print("Before sorting: ");
        printArray(arr);

        bubbleSort(arr);

        System.out.print("After sorting: ");
        printArray(arr);
    }

    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}