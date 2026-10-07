package babua90daysdsa.slidingwindow;

public class MinimumSizeSubArraySum {
    static int minSubArrayLen(int target, int[] nums) {
        int size = Integer.MAX_VALUE;
        int sum = 0;

        for(int i = 0; i < nums.length; i++){
            sum = 0;
            for(int j = i; j < nums.length; j++){
                sum = sum + nums[j];

                if(sum >= target){
                    size = Math.min(size, j - i + 1);
                    break;
                }
            }
        }

        return size == Integer.MAX_VALUE ? 0 : size;
    }

    public static void main(String[] args) {
        int[] nums = {2,3,1,6,4,3};
        int target = 7;
        System.out.println(minSubArrayLen(target,nums));
    }
}
