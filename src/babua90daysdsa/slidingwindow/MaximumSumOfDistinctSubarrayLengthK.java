package babua90daysdsa.slidingwindow;

import java.util.HashSet;
import java.util.Set;

public class MaximumSumOfDistinctSubarrayLengthK {
    static long maximumSubarraySum(int[] nums, int k) {
        long max = 0;
        long sum = 0;
        int n = nums.length;

        for(int i = 0; i <= n - k ; i++){
            Set<Integer> set = new HashSet<>();
            boolean isDup = false;

            sum = 0;

            for(int j = i; j <= i + k - 1; j++){
                if(set.contains(nums[j])){
                    isDup = true;
                    break;
                }
                set.add(nums[j]);
                sum = sum + nums[j];
            }

            if(!isDup){
                max = Math.max(max,sum);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] nums = {1,5,4,2,9,9,9};
        int k = 3;
        System.out.println(maximumSubarraySum(nums,k));
    }
}
