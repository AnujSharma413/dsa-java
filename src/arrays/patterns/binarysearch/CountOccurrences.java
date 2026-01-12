package arrays.patterns.binarysearch;

public class CountOccurrences {
    /**
     * Problem: Count Occurrences of an Element in Sorted Array
     * Time Complexity: O(log n)
     * Space Complexity: O(1)
     */
    static int firstOccurrence(int[] arr,int target){

        int start = 0;
        int end = arr.length-1;
        int res = -1;

        while(start <= end){

            int mid = start + (end - start)/2;

            if(arr[mid] == target){
                res = mid;
                end = mid-1;  // move left
            }else if(arr[mid] < target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return res;
    }
    static int lastOccurrence(int[] arr, int target){

        int start = 0;
        int end = arr.length-1;
        int res = -1;

        while(start <= end){

            int mid = start + (end - start)/2;

            if(arr[mid] == target){
                res = mid;
                start = mid + 1;  // move right
            }else if (arr[mid] < target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return res;
    }
    static int countOccurrences(int[] arr,int target){

        int firstOccur = firstOccurrence(arr,target);
        // If element not found
        if (firstOccur == -1) {
            return 0;
        }

        int lastOccur = lastOccurrence(arr, target);

        return lastOccur - firstOccur + 1;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3, 4, 5};
        int target = 2;
        System.out.println(countOccurrences(arr,target));
    }
}
