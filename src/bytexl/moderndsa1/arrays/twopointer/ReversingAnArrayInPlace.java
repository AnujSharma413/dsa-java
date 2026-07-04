package bytexl.moderndsa1.arrays.twopointer;

import java.util.Arrays;

public class ReversingAnArrayInPlace {
    static void reverseArray(int[] arr){
        int left = 0;
        int right = arr.length - 1;
        while(left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        reverseArray(arr);
        System.out.println(Arrays.toString(arr));
    }
}
