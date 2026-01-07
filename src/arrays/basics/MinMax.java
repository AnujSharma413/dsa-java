package arrays.basics;

/**
 * Find minimum and maximum element in an array
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class MinMax {

    static int max(int[] arr) {
        int maxEle = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxEle) {
                maxEle = arr[i];
            }
        }
        return maxEle;
    }

    static int min(int[] arr) {
        int minEle = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minEle) {
                minEle = arr[i];
            }
        }
        return minEle;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 6, 3, 7, 4};

        System.out.println("Max: " + max(arr));
        System.out.println("Min: " + min(arr));
    }
}
