package recursion.sorting;

import java.util.Arrays;

public class MergeSortInPlace {

    public static void main(String[] args) {
        int[] arr = {8, 3, 4, 12, 5, 6};

        // Call merge sort on full array
        mergeSort(arr, 0, arr.length - 1);

        // Print sorted array
        System.out.println(Arrays.toString(arr));
    }

    // Recursive function to divide the array
    static void mergeSort(int[] arr, int start, int end) {

        // Base case: single element is already sorted
        if (start >= end) {
            return;
        }

        // Find mid safely (avoids overflow)
        int mid = start + (end - start) / 2;

        // Recursively sort left half
        mergeSort(arr, start, mid);

        // Recursively sort right half
        mergeSort(arr, mid + 1, end);

        // Merge both sorted halves
        merge(arr, start, mid, end);
    }

    // Function to merge two sorted parts of the array
    static void merge(int[] arr, int start, int mid, int end) {

        // Temporary array to store merged result
        int[] temp = new int[end - start + 1];

        int i = start;     // Pointer for left half
        int j = mid + 1;   // Pointer for right half
        int k = 0;         // Pointer for temp array

        // Compare elements from both halves and store smaller one
        while (i <= mid && j <= end) {
            if (arr[i] <= arr[j]) {   // <= keeps algorithm stable
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        // Copy remaining elements of left half (if any)
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // Copy remaining elements of right half (if any)
        while (j <= end) {
            temp[k++] = arr[j++];
        }

        // Copy merged elements back to original array
        for (int x = 0; x < temp.length; x++) {
            arr[start + x] = temp[x];
        }
    }
}