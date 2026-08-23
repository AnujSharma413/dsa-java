package babua90daysdsa.twopointer;

import java.util.Arrays;

public class SquaresOfASortedArray {
    static int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int left = 0;
        int right = n - 1;
        int j = n - 1;
        while(left <= right){
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];

            if(leftSquare < rightSquare){
                result[j] = rightSquare;
                right--;
            }else{
                result[j] = leftSquare;
                left++;
            }
            j--;
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {-4,-1,0,3,10};
        int[] ans = sortedSquares(arr);
        System.out.println(Arrays.toString(ans));
    }
}
