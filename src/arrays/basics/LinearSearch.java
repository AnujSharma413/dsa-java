package arrays.basics;

/**
 * Linear search in an array
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class LinearSearch {

    static int linearSearch(int[] arr, int target) {
        if (arr == null || arr.length == 0) return -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1; // target not found
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 6, 3, 8};
        int target = 3;

        int res = linearSearch(arr, target);
        System.out.println("Target is at index: " + res);
    }
}
