package patterns.binarysearch.classic_search;

public class OrderNotKnownBinarySearch {
    /**
     * Problem: Order Not Known Binary Search
     * Time Complexity: O(log n)
     * Space Complexity: O(1)
     */
    static int orderNotKnownBinarySearch(int[] arr,int target){
        // Edge case: null or empty array
        if(arr == null || arr.length < 1) return -1;

        int start = 0;
        int end = arr.length-1;

        // Check sorting order
        if(arr[start] < arr[end]){
            // Ascending order binary search
            while (start <= end){
                int mid = start + (end - start)/2;
                if(arr[mid] ==  target){
                    return mid;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }
            }
        }else{
            // Descending order binary search
            while (start <= end){
                int mid = start + (end - start)/2;
                if(arr[mid] ==  target){
                    return mid;
                } else if (target < arr[mid]) {
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {20, 17, 15, 14, 10};
        int target = 14;
        System.out.println(orderNotKnownBinarySearch(arr,target));
    }
}
