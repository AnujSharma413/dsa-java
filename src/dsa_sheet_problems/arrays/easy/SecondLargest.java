package dsa_sheet_problems.arrays.easy;

/**
 * Problem: Find the second largest element in an array.
 * Logic: Maintain two variables: 'largest' and 'secondLargest'.
 * 1. If current element > largest: Update both variables.
 * 2. If current element is between largest and secondLargest: Update secondLargest.
 * * Time Complexity: O(N) - One pass through the array.
 * * Space Complexity: O(1) - Using only constant extra space.
 */
public class SecondLargest {

    public static int getSecondLargest(int[] arr) {
        if (arr == null || arr.length < 2) {
            return -1; // Not enough elements
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        // Check if a second largest was actually found
        return (secondLargest == Integer.MIN_VALUE) ? -1 : secondLargest;
    }

    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        int result = getSecondLargest(arr);

        if (result != -1) {
            System.out.println("The second largest element is: " + result);
        } else {
            System.out.println("No second largest element found.");
        }
    }
}