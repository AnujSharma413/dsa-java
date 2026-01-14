package arrays.patterns.binarysearch;

public class FindFloor {
    /**
     * Problem: Find the Floor of a given element in a sorted array.
     * Time Complexity: O(log n)
     * Space Complexity: O(1)
     */
    static int findFloor(int[] arr,int target){

        int start = 0;
        int end = arr.length-1;
        // Stores best possible floor value
        int floor = -1;

        while(start <= end){

            int mid = start + (end - start)/2;

            if(arr[mid] == target){
                return arr[mid];
            }
            // Possible floor, move right to find closer value
            else if(target > arr[mid]){
                floor = arr[mid];
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return floor;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 10};
        int target = 3;
        System.out.println(findFloor(arr,target));
    }
}
