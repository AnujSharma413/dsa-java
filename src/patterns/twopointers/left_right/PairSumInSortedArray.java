package arrays.patterns.twopointers.left_right_pointer;
/**
 * Problem:
 * Check if there exists a pair of elements in a sorted array
 * such that their sum is equal to the given target.
 *
 * Notes:
 * - Array is already sorted
 * - Return true if pair exists, otherwise false
 *
 * Approach:
 * - Use Two Pointer technique (Left & Right)
 * - Initialize left pointer at start, right pointer at end
 * - If sum == target → pair found
 * - If sum > target → move right pointer left
 * - If sum < target → move left pointer right
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Related Problem:
 * - LeetCode 167: Two Sum II – Input Array Is Sorted
 */
public class PairSumInSortedArray {
    static boolean pairSumInSortedArray(int[] arr,int target){

        int left = 0;
        int right = arr.length-1;

        while(left < right){

            int result = arr[left] + arr[right];

            // Pair found
            if(result == target)
            {
                return true;
            }
            // Sum is greater than target → reduce sum
            else if(target < result){
                right--;
            }
            // Sum is smaller than target → increase sum
            else{
                left++;
            }
        }
        // No valid pair found
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int target = 9;
        System.out.println(pairSumInSortedArray(arr,target)); // true
    }
}

