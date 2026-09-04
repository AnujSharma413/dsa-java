package babua90daysdsa.twopointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    static void twoSumHelper(int first, int[] nums, List<List<Integer>> res) {
        int i = first + 1;
        int j = nums.length - 1;

        while (i < j) {
            int sum = nums[first] + nums[i] + nums[j];

            if (sum > 0) {
                j--;
            } else if (sum < 0) {
                i++;
            } else {
                // Found a triplet — pass all 3 elements as separate arguments
                res.add(Arrays.asList(nums[first], nums[i], nums[j]));
                i++;
                j--;

                // Skip duplicate elements for the second pointer
                while (i < j && nums[i] == nums[i - 1]) {
                    i++;
                }

                // Skip duplicate elements for the third pointer
                while (i < j && nums[j] == nums[j + 1]) {
                    j--;
                }
            }
        }
    }

    static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();

        for (int f = 0; f < nums.length; f++) {
            // Early exit: Since array is sorted, if nums[f] > 0, no 3 numbers can sum to 0
            if (nums[f] > 0) {
                break;
            }

            // Skip duplicate elements for the first pointer
            if (f == 0 || nums[f] != nums[f - 1]) {
                twoSumHelper(f, nums, res);
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> res = threeSum(nums);
        System.out.println(res); // Output: [[-1, -1, 2], [-1, 0, 1]]
    }
}