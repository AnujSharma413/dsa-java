package arrays.basics;

public class SecondLargestElement {

    /**
     * Returns the second largest DISTINCT element in the array.
     *
     * Logic:
     * - Maintain two variables:
     *   1. largest        → the maximum element seen so far
     *   2. secondLargest → the second maximum element seen so far
     *
     * - While traversing:
     *   a) If current element is greater than largest:
     *      - Update secondLargest to previous largest
     *      - Update largest to current element
     *
     *   b) Else if current element is smaller than largest
     *      but greater than secondLargest:
     *      - Update secondLargest
     *
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    static int secondLargest(int[] arr) {

        // If array has less than 2 elements,
        // second largest cannot exist
        if (arr == null || arr.length < 2) {
            return -1;
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        // Single traversal of the array
        for (int num : arr) {

            // Found new largest element
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            }
            // Found a candidate for second largest
            else if (num < largest && num > secondLargest) {
                secondLargest = num;
            }
        }

        // If secondLargest was never updated,
        // it means second largest does not exist
        return (secondLargest == Integer.MIN_VALUE) ? -1 : secondLargest;
    }

    public static void main(String[] args) {
        int[] arr = {10, 5, 20, 8};
        System.out.println(secondLargest(arr));
    }
}
