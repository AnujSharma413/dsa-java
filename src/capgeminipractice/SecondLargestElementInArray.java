package capgeminipractice;

public class SecondLargestElementInArray {
    static int secondLargest(int[] arr) {
        int firstMax = arr[0];
        int secondMax = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > firstMax){
                secondMax = firstMax;
                firstMax = arr[i];
            }else if(arr[i] > secondMax && arr[i] != firstMax){
                secondMax = arr[i];
            }
        }
        return secondMax;
    }
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        System.out.println(secondLargest(arr));
    }
}
