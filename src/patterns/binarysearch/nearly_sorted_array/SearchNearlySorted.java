package arrays.patterns.binarysearch.nearly_sorted_array;

public class SearchNearlySorted {
    /**
     * Problem: Search element in nearly sorted array using binary search
     * Time Complexity: O(log n)
     * Space Complexity: O(1)
     */
    static int searchNearlySorted(int[] arr,int target){

        int start = 0;
        int end = arr.length-1;

        while(start <= end){

            int mid = start + (end - start)/2;

            if(arr[mid] == target) return mid;  // Checking for mid
            if(mid-1 >= start && arr[mid-1] == target) return mid-1; // Checking for mid-1
            if(mid+1 <= end && arr[mid+1] == target) return mid+1;   // Checking for mid+1

            // target lies on left side
            if(target < arr[mid]){
                end = mid - 2;
            }
            // target lies on right side
            else{
                start = mid + 2;
            }
        }
        // Target not found
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {10, 3, 40, 20, 50, 80, 70};
        int target = 40;
        System.out.println(searchNearlySorted(arr,target));
    }
}
