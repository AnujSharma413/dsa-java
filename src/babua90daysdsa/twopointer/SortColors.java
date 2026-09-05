package babua90daysdsa.twopointer;

import java.util.Arrays;

public class SortColors {
    static void sortColors(int[] nums){
        int i = 0;
        int j = nums.length - 1;
        int k = 0;

        while(k <= j){
            if(nums[k] == 1){
                k++;
            }else if(nums[k] == 2){
                swap(j,k,nums);
                j--;
            }else{
                swap(i,k,nums);
                i++;
                k++;
            }
        }
    }
    static void swap(int first, int second, int[] nums){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,0,0,1,2,2,0,1};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
}
