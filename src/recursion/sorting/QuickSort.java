package recursion.sorting;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {5, 9, 3, 2, 7};

        // Apply quick sort on full array
        sort(arr, 0, arr.length - 1);

        // Print sorted array
        System.out.println(Arrays.toString(arr));
    }

    /**
     * Quick Sort using recursion
     *
     * nums -> array to be sorted
     * low  -> starting index
     * hi   -> ending index
     */
    static void sort(int[] nums, int low, int hi) {

        // Base condition:
        // If array has 0 or 1 element, it's already sorted
        if (low >= hi) {
            return;
        }

        // Start and end pointers
        int s = low;
        int e = hi;

        // Choose pivot as middle element
        int m = s + (e - s) / 2;
        int pivot = nums[m];

        // Partition process
        while (s <= e) {

            // Move start pointer until element >= pivot
            while (nums[s] < pivot) {
                s++;
            }

            // Move end pointer until element <= pivot
            while (nums[e] > pivot) {
                e--;
            }

            // Swap elements if pointers have not crossed
            if (s <= e) {
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;

                // Move pointers inward
                s++;
                e--;
            }
        }

        /*
         After partition:
         - Left side: elements smaller than pivot
         - Right side: elements greater than pivot
         Pivot is now in its correct position
        */

        // Recursively sort left half
        sort(nums, low, e);

        // Recursively sort right half
        sort(nums, s, hi);
    }
}