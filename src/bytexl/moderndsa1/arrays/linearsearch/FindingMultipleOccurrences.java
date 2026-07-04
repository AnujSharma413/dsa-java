package bytexl.moderndsa1.arrays.linearsearch;

import java.util.ArrayList;

public class FindingMultipleOccurrences {
    static ArrayList<Integer> returnMultipleOccurrences(int[] arr, int target){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                list.add(i);
            }
        }
        return list;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,2,6,7,2};
        int target = 2;
        ArrayList<Integer> ans = returnMultipleOccurrences(arr,target);
        System.out.println(ans);
    }
}
