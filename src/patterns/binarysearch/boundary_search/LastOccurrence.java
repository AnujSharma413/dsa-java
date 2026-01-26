package arrays.patterns.binarysearch.boundary_search;

public class LastOccurrence {
    /**
     * Problem: Last Occurrence of an Element in Sorted Array
     * Time Complexity: O(log n)
     * Space Complexity: O(1)
     */
    static int lastOccurrence(int[] arr, int target){

        int start = 0;
        int end = arr.length-1;
        int res = -1;  // stores last occurrence index

        while(start <= end){

            int mid = start + (end - start)/2;

            if(arr[mid] == target){
                res = mid;  // store answer
                start = mid + 1;  // move right to find last occurrence
            }else if (arr[mid] < target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3, 4, 5};
        int target = 2;
        System.out.println(lastOccurrence(arr,target));
    }
}
