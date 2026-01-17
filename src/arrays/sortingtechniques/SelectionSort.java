package arrays.sortingtechniques;
/**
 * Concept:
 * Selection Sort is a simple comparison-based sorting algorithm.
 *
 * Explanation:
 * - The array is divided into two parts: sorted and unsorted.
 * - In each pass, the minimum element is selected from the
 *   unsorted part.
 * - That minimum element is swapped with the first element
 *   of the unsorted part.
 * - After every pass, the sorted portion of the array grows
 *   from the beginning.
 *
 * Key Points:
 * - Only one swap is performed in each pass.
 * - Number of comparisons remains the same regardless of input order.
 * - The unsorted range reduces after every iteration.
 *
 * Time Complexity:
 * - Worst Case: O(n^2)
 * - Average Case: O(n^2)
 * - Best Case: O(n^2)
 *
 * Space Complexity:
 * - O(1) (In-place sorting)
 */
public class SelectionSort {
    public static void main(String[] args) {

        int[] arr = {6,5,2,8,9,4};
        int size = arr.length;

        // Temporary variable for swapping
        int temp = 0;
        // Index to track minimum element
        int minIndex = -1;

        System.out.println("Before Sorting");
        for(int num : arr){
            System.out.print(num + " ");
        }

        // Selection Sort Logic
        // Outer loop controls position of sorted part
        for(int i = 0; i<size-1; i++)
        {
            // Assume current index has minimum value
            minIndex = i;

            // Find the minimum element in unsorted part
            for(int j = i+1;j<size;j++)
            {
                if(arr[minIndex] > arr[j])
                {
                    minIndex = j;
                }
            }

            // Swap minimum element with first element of unsorted part
            temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

        System.out.println();
        System.out.println("After Sorting");
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}
