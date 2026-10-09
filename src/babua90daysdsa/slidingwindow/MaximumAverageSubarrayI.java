package babua90daysdsa.slidingwindow;

public class MaximumAverageSubarrayI {
    static double findMaxAverage(int[] nums, int k) {
        double sum = 0;
        double max = Integer.MIN_VALUE;

        for(int i = 0; i < k; i++){
            sum = sum + nums[i];
        }

        max = Math.max(max,sum);

        for(int i = k; i < nums.length; i++){
            int numToAdd = nums[i];
            int numToRemove = nums[i - k];

            sum = sum + numToAdd;
            sum = sum - numToRemove;

            max = Math.max(sum,max);
        }

        return max/k;
    }
    public static void main(String[] args) {
        int[] nums = {1,12,-5,-6,50,3};
        int k = 4;
        System.out.println(findMaxAverage(nums,k));
    }
}
