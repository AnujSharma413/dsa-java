package arrays.sortingtechniques;
/**
 * Concept:
 * Quick Sort is a Divide and Conquer based sorting algorithm.
 *
 * Explanation:
 * - An element is chosen as a pivot.
 * - Array is partitioned such that:
 *   - Elements smaller than pivot go to the left
 *   - Elements greater than pivot go to the right
 * - Pivot is placed at its correct sorted position.
 * - The same process is applied recursively on left and right subarrays.
 *
 * Partition Strategy Used:
 * - Lomuto Partition Scheme
 * - Pivot is chosen as the last element of the array.
 *
 * Key Points:
 * - Sorting happens in-place (no extra array used).
 * - Recursion is used to divide the problem.
 * - Performance depends heavily on pivot selection.
 *
 * Time Complexity:
 * - Best Case: O(n log n)
 * - Average Case: O(n log n)
 * - Worst Case: O(n^2) (when array is already sorted or reverse sorted)
 *
 * Space Complexity:
 * - O(log n) due to recursive call stack
 */
public class QuickSort {

    /**
     * Quick Sort function
     * Sorts the array between low and high indices
     */
    public static void quickSort(int[] arr,int low,int high)
    {
        // Base condition:
        // Continue only if the subarray has more than one element
        if(low < high)
        {
            // Partition the array and get pivot index
            int pi = partition(arr, low, high);

            // Recursively sort elements before pivot
            quickSort(arr,low,pi-1);

            // Recursively sort elements after pivot
            quickSort(arr,pi+1,high);
        }
    }

    /**
     * Partition method using Lomuto Partition Scheme
     * Places pivot element at its correct position
     * and rearranges smaller elements to the left
     * and larger elements to the right
     */
    private static int partition(int[] arr, int low, int high) {

        // Choose last element as pivot
        int pivot = arr[high];

        // Index of smaller element
        int i = low - 1;

        // Traverse through all elements except pivot
        for(int j = low; j<high; j++)
        {
            // If current element is smaller than pivot
            if(arr[j] < pivot)
            {
                // Increment index of smaller element
                i++;

                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // Place pivot at its correct sorted position
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        // Return pivot index
        return i+1;
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 3, 1, 4};

        System.out.println("Before Sorting");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        // Apply Quick Sort
        quickSort(arr, 0, arr.length - 1);

        System.out.println();
        System.out.println("After Sorting");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
