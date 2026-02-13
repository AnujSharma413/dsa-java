package patterns.cyclic_sort;

/**
 * Problem: Missing Number (LeetCode 268)
 *
 * Given an array containing n distinct numbers taken from the range [0, n],
 * return the one number that is missing from the array.
 *
 * Approach: Cyclic Sort
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class MissingNumber {

    public static int missingNumber(int[] nums) {

        int i = 0;

        // Place each number at its correct index if possible
        while (i < nums.length) {

            int correct = nums[i];

            /*
             * Swap only when:
             * 1. The current element is not already at its correct index
             * 2. The current element is not equal to nums.length
             *    (because nums.length has no valid index in the array)
             */
            if (i != correct && nums[i] != nums.length) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }

        /*
         * After cyclic sort, the index where nums[index] != index
         * is the missing number
         */
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j) {
                return j;
            }
        }

        // If all indices are correct, the missing number is n
        return nums.length;
    }

    // Swap two elements in the array
    private static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {3, 0, 1};
        System.out.println(missingNumber(arr)); // Output: 2
    }
}
