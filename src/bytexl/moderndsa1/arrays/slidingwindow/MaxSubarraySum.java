package bytexl.moderndsa1.arrays.slidingwindow;

public class MaxSubarraySum {
    static int maxSubarraySum(int[] arr, int k) {

        int n = arr.length;

        // Sum of first window
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        int maxSum = sum;

        // Slide the window
        for (int i = k; i < n; i++) {
            sum = sum - arr[i - k] + arr[i];
            maxSum = Math.max(maxSum, sum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {100, 200, 300, 400};
        int k = 2;

        System.out.println("Maximum Sum = " + maxSubarraySum(arr, k));
    }
}
