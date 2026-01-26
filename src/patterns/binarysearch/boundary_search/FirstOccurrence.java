package patterns.binarysearch.boundary_search;

public class FirstOccurrence {
    /**
     * Problem: First Occurrence of an Element in Sorted Array
     * Time Complexity: O(log n)
     * Space Complexity: O(1)
     */
    static int firstOccurrence(int[] arr,int target){

        int start = 0;
        int end = arr.length-1;
        int res = -1;  // stores first occurrence index

        while(start <= end){

            int mid = start + (end - start)/2;

            if(arr[mid] == target){
                res = mid;  // store answer
                end = mid-1;  // move left to find first occurrence
            }else if(arr[mid] < target){
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
        System.out.println(firstOccurrence(arr,target));
    }
}
