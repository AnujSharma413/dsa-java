package arrays.patterns.binarysearch.infinite_array_search;
/**
    Problem:
         Find first 1 in Infinite Binary Sorted Array.
    Time Complexity:
         - Range finding: O(log n)
         - Binary search: O(log n)
         - Overall: O(log n)
    Space Complexity: O(1)
*/
public class FirstOneInInfiniteSortedArray {
    // Modified Binary Search to find FIRST occurrence of target
    static int binarySearchModified(int[] arr,int start,int end,int target){
        int res = -1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                res = mid;
                end = mid-1;
            }else if (target < arr[mid]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return res;
    }
     /* Approach:
     * 1. Expand search window exponentially
     * 2. Apply modified binary search
     */
    static int first1InInfiniteSortedArray(int[] arr,int target){
        int start = 0;
        int end = 1;
        while(target > arr[end]){
            start = end;
            end = end * 2;
        }
        return binarySearchModified(arr,start,end,target);
    }

    public static void main(String[] args) {
        int[] arr = {0,0,0,0,0,0,0,1,1,1,1};
        int target = 1;
        System.out.println(first1InInfiniteSortedArray(arr,target));
    }
}
