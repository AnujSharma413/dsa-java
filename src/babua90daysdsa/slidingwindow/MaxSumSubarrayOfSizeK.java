package babua90daysdsa.slidingwindow;

public class MaxSumSubarrayOfSizeK {
    static int maxSubarraySum(int[] arr, int k) {

        if (arr == null || arr.length < k || k <= 0) {
            return 0;
        }

        int sum = 0;
        int max = 0;

        for(int i = 0; i < k; i++){
            sum = sum + arr[i];
        }

        max = Math.max(sum,max);

        for(int i = k; i < arr.length; i++){
            sum = sum + arr[i];
            sum = sum - arr[i - k];

            max = Math.max(sum,max);
        }

        return max;
    }

    public static void main(String[] args) {
        int[] arr = {100, 200, 300, 400};
        int k = 2;
        System.out.println(maxSubarraySum(arr,k));
    }
}
