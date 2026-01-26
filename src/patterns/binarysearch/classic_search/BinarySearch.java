package patterns.binarysearch.classic_search;

public class BinarySearch {
    /**
     * Performs Binary Search on a sorted array
     * Time Complexity: O(log n)
     * Space Complexity: O(1)
     */
    static int binarySearch(int[] arr,int target){

        if (arr == null || arr.length == 0) return -1;

        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                return mid;
            } else if (arr[mid] < target) {
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8};
        int target = 6;
        int res = binarySearch(arr,target);
        System.out.println(res);
    }
}
