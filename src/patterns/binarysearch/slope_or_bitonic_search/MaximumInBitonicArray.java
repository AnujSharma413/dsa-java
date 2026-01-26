package arrays.patterns.binarysearch.slope_or_bitonic_search;
/**
 * Problem:
 * Find the maximum element in a Bitonic Array.
 *
 * Bitonic Array:
 * - First strictly increasing
 * - Then strictly decreasing
 * - Contains exactly one peak (maximum) element
 *
 * Approach:
 * - Use Binary Search
 * - If mid is greater than both neighbors, it is the maximum
 * - If slope is decreasing, move left
 * - If slope is increasing, move right
 *
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */
public class MaximumInBitonicArray {
    static int maxInBitonicArray(int[] arr){

        int size = arr.length;
        int start = 0;
        int end = size-1;

        if(size < 2) return arr[0];

        while(start <= end){

            int mid = start + (end - start)/2;

            // mid is not at boundary
            if(mid > 0 && mid < size-1)
            {
                // peak (maximum) found
                if (arr[mid] > arr[mid + 1] && arr[mid] > arr[mid - 1]) {
                    return arr[mid];
                }
                // descending slope, move left
                else if (arr[mid] > arr[mid+1]){
                    end = mid - 1;
                }
                // ascending slope, move right
                else{
                    start = mid + 1;
                }
            }
            // first element case
            else if (mid == 0){
                return (arr[0] > arr[1]) ? arr[0] : arr[1];
            }
            // last element case
            else if (mid == size-1){
                return (arr[size-1] > arr[size-2]) ? arr[size-1] : arr[size-2];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1, 5, 10, 20, 15};
        System.out.println(maxInBitonicArray(arr));
    }
}
