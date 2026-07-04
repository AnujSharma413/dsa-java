package bytexl.moderndsa1.arrays.linearsearch;

public class SimpleSearch {
    static int linearSearch(int[] arr, int target){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,6,5,3,7};
        int target = 5;
        System.out.println(linearSearch(arr,target));
    }
}
