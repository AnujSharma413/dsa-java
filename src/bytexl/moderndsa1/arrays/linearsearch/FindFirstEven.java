package bytexl.moderndsa1.arrays.linearsearch;

public class FindFirstEven {
    static int returnFirstEven(int[] arr){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,5,2,6,7,8};
        System.out.println(returnFirstEven(arr));
    }
}
