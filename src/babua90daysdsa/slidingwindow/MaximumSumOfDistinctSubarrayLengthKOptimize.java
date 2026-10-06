package babua90daysdsa.slidingwindow;


import java.util.HashMap;
import java.util.Map;

public class MaximumSumOfDistinctSubarrayLengthKOptimize {
    static long maximumSubarraySum(int[] nums, int k) {
       long max = 0;
       long sum = 0;
       int dups = 0;

       Map<Integer,Integer> counts = new HashMap<>();

       for(int i = 0; i < k; i++){
           if(!counts.containsKey(nums[i])){
               counts.put(nums[i],0);
           }
           counts.put(nums[i], counts.get(nums[i]) + 1);

           sum = sum + nums[i];

           if(counts.get(nums[i]) > 1){
               dups = dups + 1;
           }
       }

       if(dups == 0){
           max = Math.max(sum,max);
       }

       for(int i = k; i < nums.length; i++){
           int numToAdd = nums[i];
           int numToRemove = nums[i - k];

           if(!counts.containsKey(numToAdd)){
               counts.put(numToAdd,0);
           }
           counts.put(numToAdd, counts.get(numToAdd) + 1);

           if(counts.get(numToAdd) > 1){
               dups = dups + 1;
           }

           sum = sum + numToAdd;

           if(counts.get(numToRemove) > 1){
               dups = dups - 1;
           }

           counts.put(numToRemove, counts.get(numToRemove) - 1);

           sum = sum - numToRemove;

           if(dups == 0){
               max = Math.max(sum,max);
           }
       }

       return max;
    }

    public static void main(String[] args) {
        int[] nums = {1,5,4,2,9,9,9};
        int k = 3;
        System.out.println(maximumSubarraySum(nums,k));
    }
}
