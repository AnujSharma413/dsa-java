package capgeminipractice;

public class FindTheMissingNumber {
    static int findMissingNumber(int[] arr, int n) {
        int xorTillN = 0;
        int xorOfArray = 0;
        int finalAns = 0;

        for(int i = 1; i <= n; i++){
            xorTillN = i ^ xorTillN;
        }
        for(int i = 0; i < arr.length; i++){
            xorOfArray = arr[i] ^ xorOfArray;
        }

        finalAns = xorTillN ^ xorOfArray;
        return finalAns;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6};
        int n = 6;
        System.out.println(findMissingNumber(arr,n));
    }
}
