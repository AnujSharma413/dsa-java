package recursion.search;

/**
 * PURPOSE:
 * Binary Search using recursion.
 *
 * CONDITIONS:
 * - Array must be sorted
 * - Search space reduces by half each call
 *
 * CORE IDEA:
 * - Base Condition: start > end
 * - Recursive call replaces loop
 */
public class BinarySearchRecursive {

    static int binarySearch(int[] arr, int start, int end, int target) {

        // Base Condition: element not found
        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;

        if (arr[mid] == target) {
            return mid;
        }

        // Search in left half
        if (target < arr[mid]) {
            return binarySearch(arr, start, mid - 1, target);
        }

        // Search in right half
        return binarySearch(arr, mid + 1, end, target);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 7, 8, 9, 10, 12, 13};
        System.out.println(binarySearch(arr, 0, arr.length - 1, 1));
    }
}
