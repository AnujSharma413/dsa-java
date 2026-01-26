package patterns.twopointers.left_right;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Problem:
 * Find all unique triplets in the array whose sum is equal to 0.
 *
 * Each triplet (a, b, c) must satisfy:
 * a + b + c = 0
 *
 * Constraints / Notes:
 * - Array can contain positive, negative, and zero values
 * - Triplets must be unique (no duplicates)
 * - Order of triplets does not matter
 *
 * Example:
 * Input:  [-1, 0, 1, 2, -1, -4]
 * Output: [[-1, -1, 2], [-1, 0, 1]]
 *
 * Approach:
 * - Sort the array first
 * - Fix one element using a loop
 * - Apply Left–Right Two Pointer on the remaining part
 * - Skip duplicate values to avoid repeated triplets
 *
 * Key Observations:
 * - Sorting allows two pointer technique to work
 * - If sum == 0 → valid triplet
 * - If sum < 0 → move left pointer
 * - If sum > 0 → move right pointer
 *
 * Time Complexity:
 * O(n^2)
 *
 * Space Complexity:
 * O(1) (excluding result list)
 *
 * Related Problem:
 * LeetCode 15 – 3Sum
 */
public class ThreeSum {
    // Returns all unique triplets whose sum is 0
    static List<List<Integer>> threeSum(int[] arr){

        // Step 1: Sort the array
        Arrays.sort(arr);

        List<List<Integer>> result = new ArrayList<>();

        // Step 2: Fix one element and apply two pointers on remaining array
        for(int i = 0; i < arr.length-2; i++)
        {
            // Skip duplicate fixed elements
            if(i > 0 && arr[i] == arr[i-1]) continue;

            int left = i+1;
            int right = arr.length-1;

            // Step 3: Two pointer search
            while(left < right)
            {
                int sum = arr[i] + arr[left] + arr[right];
                if (sum == 0)
                {
                    // Valid triplet found
                    result.add(Arrays.asList(arr[i],arr[left],arr[right]));

                    // Move both pointers
                    left++;
                    right--;

                    // Skip duplicate left values
                    while(left < right && arr[left] == arr[left-1]) left++;
                    // Skip duplicate right values
                    while (left < right && arr[right] == arr[right+1]) right--;
                }
                else if (sum < 0) {
                    // Need bigger sum
                    left++;
                }
                else{
                    // Need smaller sum
                    right--;
                }
            }
        }
        return result;
     }
    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(arr));  // Output --> [[-1, -1, 2], [-1, 0, 1]]
    }
}
