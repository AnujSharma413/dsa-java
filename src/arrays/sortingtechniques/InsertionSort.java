package arrays.sortingtechniques;
/**
 * Concept:
 * Insertion Sort is a comparison-based sorting algorithm
 * that builds the sorted array one element at a time.
 *
 * Explanation:
 * - The array is divided into sorted and unsorted parts.
 * - Initially, the first element is considered sorted.
 * - In each pass, the next element (key) is taken from the
 *   unsorted part.
 * - The key is compared with elements in the sorted part
 *   and shifted to its correct position.
 * - This process continues until the entire array is sorted.
 *
 * Key Points:
 * - Elements are shifted instead of swapped repeatedly.
 * - Works efficiently for small or nearly sorted arrays.
 * - Sorting grows from left to right.
 *
 * Time Complexity:
 * - Worst Case: O(n^2)
 * - Average Case: O(n^2)
 * - Best Case: O(n) (already sorted array)
 *
 * Space Complexity:
 * - O(1) (In-place sorting)
 */
public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {3,6,2,1,5};

        System.out.println("Before Sorting:");
        for(int num : arr){
            System.out.print(num + " ");
        }

        // Insertion Sort Logic
        // Start from index 1 because the first element is already sorted
        for(int i = 1;i<arr.length;i++)
        {
            // Current element to be placed at correct position
            int key = arr[i];

            // Index of the previous element
            int j = i - 1;

            // Shift elements of the sorted part that are greater than key
            while(j >= 0 && arr[j] > key)
            {
                arr[j+1] = arr[j];
                j--;
            }

            // Place the key at its correct position
            arr[j+1] = key;
        }

        System.out.println("\nAfter Sorting:");
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}
