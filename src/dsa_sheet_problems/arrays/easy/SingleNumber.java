package dsa_sheet_problems.arrays.easy;

/**
 * Problem: Find the element that appears only once in an array where every
 * other element appears exactly twice.
 * Link: https://leetcode.com/problems/single-number/
 * * Logic: Use the Bitwise XOR (^) operator properties:
 * 1. X ^ X = 0 (Any number XORed with itself cancels out to 0)
 * 2. X ^ 0 = X (Any number XORed with 0 remains unchanged)
 * 3. XOR is commutative and associative (Order of operations doesn't matter)
 * * Effectively, all numbers appearing twice will cancel each other out,
 * leaving behind only the single number.
 * * Time Complexity: O(N) - Single pass through the array.
 * * Space Complexity: O(1) - Constant auxiliary space.
 */
public class SingleNumber {

    public static int singleNumber(int[] nums) {
        int ans = 0;

        // XOR all elements together
        for (int num : nums) {
            ans ^= num;
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {4, 1, 3, 1, 3};
        System.out.println("Array: {4, 1, 3, 1, 3}");
        System.out.println("The single number is: " + singleNumber(nums));
    }
}