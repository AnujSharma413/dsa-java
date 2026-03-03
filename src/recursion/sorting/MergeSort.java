package recursion.sorting;

import java.util.Arrays;

/**
 * PURPOSE:
 * Implement MERGE SORT using RECURSION (NON-INPLACE).
 *
 * Core Idea:
 * - Divide the array into two halves
 * - Recursively sort both halves
 * - Merge the two sorted halves into a new array
 *
 * IMPORTANT:
 * This implementation is NOT IN-PLACE.
 * New arrays are created at every recursive level.
 *
 * Time Complexity: O(N log N)
 * Space Complexity: O(N log N) due to array copies + recursion stack
 */
public class MergeSort {

    public static void main(String[] args) {

        int[] arr = {8, 3, 4, 12, 5, 6};

        int[] ans = mergeSort(arr);

        System.out.println(Arrays.toString(ans)); // [3, 4, 5, 6, 8, 12]
    }

    /**
     * Recursively divides array and sorts it
     */
    static int[] mergeSort(int[] arr) {

        // Base Condition:
        // Single element array is already sorted
        if (arr.length == 1) {
            return arr;
        }

        int mid = arr.length / 2;

        // Divide array into two halves
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        // Merge sorted halves
        return merge(left, right);
    }

    /**
     * Merge two sorted arrays into one sorted array
     */
    static int[] merge(int[] first, int[] second) {

        int[] mix = new int[first.length + second.length];

        int i = 0; // pointer for first array
        int j = 0; // pointer for second array
        int k = 0; // pointer for merged array

        // Compare elements from both arrays
        while (i < first.length && j < second.length) {

            if (first[i] < second[j]) {
                mix[k] = first[i];
                i++;
            }
            else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of first array
        while (i < first.length) {
            mix[k] = first[i];
            i++;
            k++;
        }

        // Copy remaining elements of second array
        while (j < second.length) {
            mix[k] = second[j];
            j++;
            k++;
        }

        return mix;
    }
}