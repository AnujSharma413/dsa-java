package patterns.twopointers.sliding_window.fixed_size;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Problem:
 * First Negative Number in Every Window of Size K
 *
 * Given an array and an integer k, find the first negative number
 * in every contiguous window of size k.
 * If a window does not contain a negative number, store 0.
 *
 * Pattern Used:
 * Fixed Size Sliding Window + Queue
 *
 * Why Queue?
 * - To store negative numbers of current window
 * - Front of queue always gives the first negative element
 *
 * Time Complexity: O(n)
 * Space Complexity: O(k) (queue can store at most k elements)
 *
 * Platform:
 * - GFG: First Negative Integer in Every Window of Size K
 */
public class FirstNegInt {

    static List<Integer> firstNegInt(int[] arr, int k) {

        int i = 0; // window start
        int j = 0; // window end

        Queue<Integer> q = new LinkedList<>(); // stores negatives of current window
        List<Integer> res = new ArrayList<>(); // final answer

        while (j < arr.length) {

            // Step 1: calculation
            if (arr[j] < 0) {
                q.add(arr[j]);
            }

            // Step 2: window not hit size k yet
            if (j - i + 1 < k) {
                j++;
            }

            // Step 3: window size == k
            else if (j - i + 1 == k) {

                // Answer for current window
                if (q.isEmpty()) {
                    res.add(0);
                } else {
                    res.add(q.peek());
                }

                // Step 4: slide the window
                if (!q.isEmpty() && arr[i] == q.peek()) {
                    q.poll(); // remove element leaving the window
                }

                i++;
                j++;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr = {12, -1, -7, 8, -15, 30, 16, 28};
        int k = 3;
        System.out.println(firstNegInt(arr, k));
    }
}
