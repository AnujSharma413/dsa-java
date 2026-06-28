package bytexl.arrays.oneDimensionalArray;

import java.util.Scanner;

public class FindIndex{
    static int returnIndex(int[] arr){
        int totalSum = 0;
        int leftSum = 0;

        for(int num : arr){
            totalSum += num;
        }

        for(int i = 0; i < arr.length; i++){
            if(leftSum == (totalSum - leftSum - arr[i])){
                return i;
            }
            leftSum += arr[i];
        }
        return -1;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(returnIndex(arr));
    }
}
