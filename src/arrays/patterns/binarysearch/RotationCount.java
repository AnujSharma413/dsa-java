package arrays.patterns.binarysearch;

public class RotationCount {
    /**
     * Problem: Number of Times a Sorted Array is Rotated
     * Time Complexity: O(log n)
     * Space Complexity: O(1)
     */
    static int rotationCount(int[] arr){

        int start = 0;
        int end = arr.length-1;
        int n = arr.length;

        while(start <= end){
            // Case 1: Array is already sorted
            if(arr[start] <= arr[end])
                return start;

            int mid = start + (end - start)/2;
            int next = (mid + 1) % n;
            int prev = (mid + n - 1) % n;

            // Check if mid is the minimum element
            if(arr[mid] <= arr[next] && arr[mid] <= arr[prev]){
                return mid;
            }
            // Right half is sorted, move left
            else if (arr[mid] <= arr[end]) {
                end = mid - 1;
            }
            // Left half is sorted, move right
            else {
                start = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {11,12,15,20,2,5,7,8};
        System.out.println(rotationCount(arr));
        int[] arr1 = {2,5,7,8};
        System.out.println(rotationCount(arr1));
        int[] arr2 = {20,2,5,7,8};
        System.out.println(rotationCount(arr2));
    }
}
