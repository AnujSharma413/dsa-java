package arrays.sortingtechniques;
/**
 * Concept:
 * Bubble Sort is a simple comparison-based sorting algorithm.
 *
 * Explanation:
 * - The algorithm repeatedly compares adjacent elements.
 * - If two adjacent elements are in the wrong order,
 *   they are swapped.
 * - After each complete pass through the array,
 *   the largest element moves to the end.
 * - This process is repeated until the array becomes sorted.
 *
 * Key Points:
 * - Sorting is done in multiple passes.
 * - After each pass, one element is placed at its correct position.
 * - The range of comparison reduces after every pass.
 *
 * Time Complexity:
 * - Worst Case: O(n^2)
 * - Average Case: O(n^2)
 * - Best Case: O(n^2) (without optimization)
 *
 * Space Complexity:
 * - O(1) (In-place sorting)
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {6,5,2,8,9,4};
        int size = arr.length;
        int temp = 0;

        System.out.println("Before Sorting");
        for(int num : arr){
            System.out.print(num + " ");
        }

        // Outer loop controls number of passes
        for(int i = 0;i<size;i++)
        {
            // Inner loop compares adjacent elements
            // (size-i-1) because: Last i elements are already sorted
            for(int j = 0;j<size-i-1;j++)
            {
                // Compare current element with next element
                if(arr[j] > arr[j+1])
                {
                    // Swap if elements are in wrong order
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.println();
        System.out.println("After Sorting");
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}
