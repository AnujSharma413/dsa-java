package bytexl.moderndsa1.arrays.linearsearch;

public class FindMaxMin {
    static int[] findMaxMin(int[] arr){
        int max = arr[0];
        int min = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return new int[]{max,min};
    }
    public static void main(String[] args) {
        int[] arr = {11,33,22,55,54,9};
        int[] ans = findMaxMin(arr);
        System.out.println("Max: " + ans[0] + ", Min: " + ans[1]);
    }
}
