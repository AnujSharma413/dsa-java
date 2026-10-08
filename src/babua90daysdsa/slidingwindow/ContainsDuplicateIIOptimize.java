package babua90daysdsa.slidingwindow;

import java.util.*;

public class ContainsDuplicateIIOptimize {
    static boolean containsNearbyDuplicate(int[] nums, int k){
        Set<Integer> set = new HashSet<>();

        for(int i = 0; i < Math.min(k, nums.length); i++){
            if(set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);
        }

        for(int i = k; i < nums.length; i++){
            if(set.contains(nums[i])){
                return true;
            }

            set.add(nums[i]);
            set.remove(nums[i - k]);
        }

        return false;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        int k = 3;
        System.out.println(containsNearbyDuplicate(nums,k));
    }
}

