package bytexl.moderndsa1.arrays.slidingwindow;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class FirstNegativeNumberInWindowSizeK {
    static long[] printFirstNegativeInteger(long[] A, int N, int K) {
        Queue<Long> queue = new LinkedList<>();
        long[] res = new long[N - K + 1];

        // Process the initial window
        for (int i = 0; i < K; i++) {
            if (A[i] < 0) {
                queue.offer(A[i]);
            }
        }
        res[0] = queue.isEmpty() ? 0 : queue.peek();

        // Slide the window across the remaining elements
        for (int i = 1; i < N - K + 1; i++) {
            // Remove the element sliding out of the window boundary
            if (A[i - 1] < 0 && !queue.isEmpty() && queue.peek() == A[i - 1]) {
                queue.poll();
            }
            // Add the new element sliding into the window boundary
            if (A[i + K - 1] < 0) {
                queue.offer(A[i + K - 1]);
            }
            res[i] = queue.isEmpty() ? 0 : queue.peek();
        }
        return res;
    }

    public static void main(String[] args) {
        long[] arr = {-8, 2, 3, -6, 10};
        int k = 2;
        long[] res = printFirstNegativeInteger(arr, arr.length, k);
        System.out.println(Arrays.toString(res));
    }
}