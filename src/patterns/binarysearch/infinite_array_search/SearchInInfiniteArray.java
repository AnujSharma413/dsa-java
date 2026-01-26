package arrays.patterns.binarysearch.infinite_array_search;
/*
    Problem:
    Find the position of an element in an Infinite Sorted Array.

    Note:
    - Array size is unknown (cannot use arr.length in real interview)
    - Here we simulate infinite array using a large finite array

    Approach:
    1. Expand the search window exponentially until target <= arr[end]
    2. Apply Binary Search within the identified range

    Time Complexity:
    - Range finding: O(log n)
    - Binary search: O(log n)
    - Overall: O(log n)

    Space Complexity: O(1)
*/
public class SearchInInfiniteArray {
    // Standard binary search within given range
    static int binarySearch(int[] arr,int start,int end,int target){

        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                return mid;
            }else if (target < arr[mid]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return -1;
    }
    static int searchInInfiniteArray(int[] arr,int target){
        int start = 0;
        int end = 1;

        // Step 1: Find the range where target may lie
        while(target > arr[end]){
            start = end;
            end = end*2;
        }
        // Step 2: Apply binary search in the found range
        return binarySearch(arr,start,end,target);
    }
    public static void main(String[] args) {

//        int[] arr = {1, 3, 5, 7, 9, 10, 12, 15, 18, 21,....}; // Original question Array

        int[] arr = {1, 3, 5, 7, 9, 10, 12, 15, 18, 21}; // Taking sample array for explaining
        int target = 10;
        System.out.println(searchInInfiniteArray(arr,target));
    }
}
