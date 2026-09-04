package babua90daysdsa.twopointer;

import java.util.Arrays;

public class SortTwoColors {
    static void sortTwoColors(int[] nums) {
        int i = 0;
        int j = nums.length - 1;

        while (i < j) {
            if (nums[i] == 0) {
                i++;
            } else if (nums[j] == 1) {
                j--;
            } else {
                swap(i, j, nums);
                i++;
                j--;
            }
        }
    }

    static void swap(int i, int j, int[] nums) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 1, 0, 0};
        sortTwoColors(nums);
        System.out.println(Arrays.toString(nums));
    }
}