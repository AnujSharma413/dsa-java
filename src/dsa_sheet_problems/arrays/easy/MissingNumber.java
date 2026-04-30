package dsa_sheet_problems.arrays.easy;

/**
 * Problem: Find the missing number in an array of size N-1 containing numbers from 1 to N.
 *
 * Approach 1: Summation (Optimal O(N) Time, O(1) Space)
 * - Difference between expected sum (n*(n+1)/2) and actual sum.
 *
 * Approach 2: Cyclic Sort (Optimal O(N) Time, O(1) Space)
 * - This problem can also be solved using Cyclic Sort. Since the numbers are in
 *   the range [1, N], we try to place each number at its correct index (value 'i' at index 'i-1').
 *   After sorting, the first index 'i' where arr[i] != i + 1 is our missing number.
 */
public class MissingNumber {

    // Implementation using Summation Approach
    static int missingNumber(int[] arr) {
        long givenSum = 0;
        for (int num : arr) {
            givenSum += num;
        }

        long n = arr.length + 1;
        long actSum = n * (n + 1) / 2;

        return (int) (actSum - givenSum);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5};
        System.out.println("Missing Number: " + missingNumber(arr));
    }
}