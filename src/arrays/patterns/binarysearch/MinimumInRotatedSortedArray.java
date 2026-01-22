package arrays.patterns.binarysearch;

public class MinimumInRotatedSortedArray {
    /**
     * Problem:
     * Find the minimum element in a rotated sorted array.
     *
     * Constraints:
     * - Array was originally sorted in ascending order
     * - Then rotated at some pivot
     * - No duplicate elements
     *
     * Technique Used:
     * - Binary Search on Answer (Search Space Reduction)
     *
     * Time Complexity: O(log n)
     * Space Complexity: O(1)
     */
    static int minimumInRotatedSortedArray(int[] arr){

        int start = 0;
        int end = arr.length-1;

        // Binary search until search space reduces to one element
        while(start < end){

            int mid = start + (end - start)/2;

            /*
             * Key Observation:
             * - If arr[mid] > arr[end]
             *   → Left part is sorted
             *   → Minimum lies in right part
             *
             * - Else
             *   → Right part is sorted
             *   → Minimum lies in left part (including mid)
             */

            if(arr[mid] > arr[end])
            {
                start = mid + 1;
            }
            else{
                end = mid;
            }
        }
        // At the end, start == end → minimum element
        return arr[start];
    }
    public static void main(String[] args) {
        int[] arr = {3,4,5,6,0,1};
        System.out.println(minimumInRotatedSortedArray(arr));
    }
}
