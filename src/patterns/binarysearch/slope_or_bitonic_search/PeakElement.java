package arrays.patterns.binarysearch.slope_or_bitonic_search;
/**
 * Problem:
 * Find a peak element in an array.
 * A peak element is greater than its immediate neighbors.
 *
 * Notes:
 * - Array may be unsorted
 * - There can be multiple peak elements
 * - Return index of any one peak element
 *
 * Approach:
 * - Use Binary Search based on slope comparison
 * - If left neighbor is greater, peak lies on left side
 * - If right neighbor is greater, peak lies on right side
 *
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */
public class PeakElement {
    static int peakElement(int[] arr){

        int size = arr.length;

        // Single element is always a peak
        if(size < 2) return 0;

        int start = 0;
        int end = size-1;

        while(start <= end){

            int mid = start + (end - start)/2;

            // Case 1: mid is not on boundary
            if(mid > 0 && mid < size-1){

                // mid is peak
                if(arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1]){
                    return mid;
                }
                // peak lies on left side
                else if (arr[mid] < arr[mid-1]){
                    end = mid-1;
                }
                // peak lies on right side
                else{
                    start = mid+1;
                }
            }

            // Case 2: mid is first element
            else if (mid == 0) {
                return (arr[0] > arr[1]) ? 0 : 1;
            }

            // Case 3: mid is last element
            else if (mid == size-1){
                return (arr[size-1] > arr[size-2]) ? size-1 : size-2;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        // TEST CASES -->
        int[] arr1 = {1, 2, 3, 1};
        System.out.println(peakElement(arr1));
        int[] arr2 = {1, 2, 1, 3, 5, 6, 4};
        System.out.println(peakElement(arr2));
        int[] arr3 = {10};
        System.out.println(peakElement(arr3));
        int[] arr4 = {1, 2, 3, 4, 5};
        System.out.println(peakElement(arr4));
        int[] arr5 = {5, 4, 3, 2, 1};
        System.out.println(peakElement(arr5));
    }
}
