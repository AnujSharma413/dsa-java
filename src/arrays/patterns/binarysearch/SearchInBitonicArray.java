package arrays.patterns.binarysearch;
/**
 * Search an element in a Bitonic Array.
 *
 * A Bitonic Array:
 * - First strictly increasing
 * - Then strictly decreasing
 * - Contains exactly one peak element
 *
 * Approach:
 * 1. Find peak index using Binary Search
 * 2. If target == peak element → return peak index
 * 3. Apply Binary Search on left (ascending part)
 * 4. Apply Binary Search on right (descending part)
 *
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */
public class SearchInBitonicArray {

    // Step 1: Find peak element index
    static int findPeakIndex(int[] arr){
        int size = arr.length;
        int start = 0;
        int end = size-1;
        if(size < 2) return 0;

        while(start <= end){
            int mid = start + (end - start)/2;

            // Mid is not at boundary
            if(mid > 0 && mid < size-1){

                // Peak condition
                if(arr[mid] > arr[mid+1] && arr[mid] > arr[mid-1]){
                    return mid;
                }
                // Descending slope, move left
                else if (arr[mid] > arr[mid+1]){
                    end = mid - 1;
                }
                // Ascending slope, move right
                else{
                    start = mid + 1;
                }
            }
            // Boundary conditions
            else if (mid == 0){
                return (arr[0] > arr[1]) ? 0 : 1;
            }else if (mid == size-1){
                return (arr[size-1] > arr[size-2]) ? size-1 : size-2;
            }
        }
        return -1;
    }
    // Binary Search on ascending array
    static int binarySearchAsc(int[] arr,int start,int end,int target){
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target) return mid;
            else if (target > arr[mid]){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return -1;
    }
    // Binary Search on descending array
    static int binarySearchDesc(int[] arr,int start,int end,int target){
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target) return mid;
            else if (target < arr[mid]){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return -1;
    }
    // Main search function
    static int searchInBitonicArray(int[] arr,int target){
        int peak = findPeakIndex(arr);
        if (peak == -1) return -1;

        // Target is peak element
        if(arr[peak] == target) return peak;

        // Search in left (ascending part)
        int leftResult = binarySearchAsc(arr,0,peak-1,target);
        if (leftResult != -1) return leftResult;

        // Search in right (descending part)
        return binarySearchDesc(arr, peak + 1, arr.length - 1, target);
    }
    public static void main(String[] args) {
        int[] arr = {1, 3, 8, 12, 4, 2};
        int target = 4;
        System.out.println(searchInBitonicArray(arr,target));
    }
}
