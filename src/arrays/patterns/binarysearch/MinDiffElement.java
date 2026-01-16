package arrays.patterns.binarysearch;
/**
 * Problem:
 * Find the element in a sorted array which has the minimum
 * absolute difference with the given target.
 *
 * Approach:
 * - Apply Binary Search to find the position where target should be.
 * - After loop:
 *      end   -> index of floor element
 *      start -> index of ceil element
 * - Compare differences with floor and ceil.
 *
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */
public class MinDiffElement {
    static int minDiffElement(int[] arr,int target){

        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = start + (end - start)/2;

            // Exact match (minimum difference is 0)
            if(arr[mid] == target){
                return target;
            }
            else if (target < arr[mid]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        // Edge cases
        if(end < 0) return arr[start];               // target smaller than smallest
        if(start >= arr.length) return arr[end];    // target greater than largest

        // Compare floor and ceil differences
        int diffWithFloor = Math.abs(arr[end] - target);
        int diffWithCeil = Math.abs(arr[start] - target);

        return (diffWithFloor < diffWithCeil) ? arr[end] : arr[start];
    }
    public static void main(String[] args) {
        int[] arr = {5,6,7,8,9,11};
        int target = 1;
        System.out.println(minDiffElement(arr,target));
    }
}
