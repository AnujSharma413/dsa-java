package arrays.basics;

/**
 * Reverse an array in-place using two pointers
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class ReverseArray {

    static void reverse(int[] arr) {
        if (arr == null || arr.length <= 1) return;

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        reverse(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
