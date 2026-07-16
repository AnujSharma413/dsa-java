package capgeminipractice;

import java.util.Arrays;

public class FindPairsWithGivenSum {
    static void findPairsWithSum(int[] arr, int target) {
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length-1;
        while(left < right){
            int currTarget = arr[left] + arr[right];
            if(currTarget == target){
                System.out.println("(" + arr[left] + "," + arr[right] + ")");
                left++;
                right--;
            }else if(currTarget < target){
                left++;
            }else{
                right--;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {2, 4, 3, 5, 7, 8, 9};
        int target = 9;
        findPairsWithSum(arr,target);
    }
}
