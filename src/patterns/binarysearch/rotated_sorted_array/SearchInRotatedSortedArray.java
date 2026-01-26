package patterns.binarysearch.rotated_sorted_array;

public class SearchInRotatedSortedArray {
    /**
     * Problem: Find an element in a Rotated Sorted Array.
     * Time Complexity: O(log n)
     * Space Complexity: O(1)
     */
    static int searchInRotatedSortedArray(int[] arr, int target){

        int start = 0;
        int end = arr.length-1;

        // Binary search loop
        while(start <= end){

            int mid = start + (end - start)/2;

            // Case 1: target found
            if(arr[mid] == target) {
                return mid;
            }

            // Case 2: Left half is sorted
            else if(arr[start] <= arr[mid]){
                // Check if target lies in left sorted half
                if(target >= arr[start] && target < arr[mid]){
                    end = mid - 1;
                }
                // Otherwise, move to right half
                else{
                    start = mid + 1;
                }
            }
            // Case 3: Right half is sorted
            else {
                // Check if target lies in right sorted half
                if(target > arr[mid] && target <= arr[end]){
                    start = mid + 1;
                }
                // Otherwise, move to left half
                else{
                    end = mid - 1;
                }
            }
        }
        // Target not found
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {12,13,14,15,2,3};
        int target = 3;
        System.out.println(searchInRotatedSortedArray(arr,target));
    }
}
