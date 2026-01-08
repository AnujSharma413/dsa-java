package arrays.basics;

public class CountEvenOdd {

    /**
     * Counts the number of even and odd elements in the array.
     *
     * Logic:
     * - Traverse the array once
     * - If element is divisible by 2 → even
     * - Otherwise → odd
     *
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    static int[] countEvenOdd(int[] arr) {

        int even = 0;
        int odd = 0;

        // Handle null or empty array
        if (arr == null || arr.length == 0) {
            return new int[]{0, 0};
        }

        for (int num : arr) {
            if (num % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        // index 0 → even count, index 1 → odd count
        return new int[]{even, odd};
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        int[] result = countEvenOdd(arr);
        System.out.println("Even = " + result[0]);
        System.out.println("Odd  = " + result[1]);
    }
}
