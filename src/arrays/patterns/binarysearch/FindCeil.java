package arrays.patterns.binarysearch;

public class FindCeil {
    /**
     * Problem: Find the Ceil of a given element in a sorted array.
     * Time Complexity: O(log n)
     * Space Complexity: O(1)
     */
    static int findCeil(int[] arr,int target){

        int start = 0;
        int end = arr.length-1;
        // Stores best possible ceil value
        int ceil = -1;

        while(start <= end){

            int mid = start + (end - start)/2;

            if(arr[mid] == target){
                return arr[mid];
            }
            // Possible ceil, move left to find closer value
            else if (target < arr[mid]){
                ceil = arr[mid];
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return ceil;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 10};
        int target = 9;
        System.out.println(findCeil(arr,target));
    }
}
