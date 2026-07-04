package bytexl.moderndsa1.arrays.twopointer;

// Pattern 1: Opposite Ends
public class TwoSumInSortedArray {
    static int[] twoSumSorted(int[] arr, int target){
        int left = 0;
        int right = arr.length - 1;
        while(left < right){
            int currSum = arr[left] + arr[right];
            if(currSum == target){
                return new int[]{left,right};
            }else if(target < currSum){
                right--;
            }else{
                left++;
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15, 19, 23};
        int target = 26;
        int[] ans = twoSumSorted(arr,target);
        System.out.println(ans[0] + ", " + ans[1]);
    }
}
