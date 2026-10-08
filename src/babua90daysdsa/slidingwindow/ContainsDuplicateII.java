package babua90daysdsa.slidingwindow;

import java.util.*;

public class ContainsDuplicateII {
    static boolean containsNearbyDuplicate(int[] nums, int k){
        for(int i = 0; i < nums.length; i++){
            Set<Integer> set = new HashSet<>();
            for(int j = i; j <= Math.min(j + k, nums.length - 1); j++){
                if(set.contains(nums[j])){
                    return true;
                }
                set.add(nums[j]);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        int k = 3;
        System.out.println(containsNearbyDuplicate(nums,k));
    }
}
