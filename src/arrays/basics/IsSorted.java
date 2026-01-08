package arrays.basics;

public class IsSorted {

    /**
     * Checks whether the given array is sorted in non-decreasing order.
     *
     * Logic:
     * - An array is considered sorted if every element is
     *   less than or equal to its next element.
     * - The moment we find one violation, the array is NOT sorted.
     *
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    static boolean isSorted(int[] arr) {

        // Empty array or single-element array is always sorted
        if (arr == null || arr.length <= 1) {
            return true;
        }

        // Compare each element with its next element
        for (int i = 0; i < arr.length - 1; i++) {

            // If current element is greater than next,
            // sorted order is broken
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }

        // If no violation found, array is sorted
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 4, 5};
        System.out.println(isSorted(arr));
    }
}
