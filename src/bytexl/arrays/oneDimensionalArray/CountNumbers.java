package bytexl.arrays.oneDimensionalArray;

import java.util.Scanner;

public class CountNumbers{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int posNum = 0;
        int negNum = 0;
        int zeros = 0;
        int evenNum = 0;
        int oddNum = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > 0){
                posNum++;
            }
            if(arr[i] < 0){
                negNum++;
            }
            if(arr[i] == 0){
                zeros++;
            }
            if(arr[i] != 0){
                if(arr[i] % 2 == 0){
                    evenNum++;
                }else{
                    oddNum++;
                }
            }
        }

        System.out.println("Enter 10 integers:");
        System.out.println("Number of positive numbers: " + posNum);
        System.out.println("Number of negative numbers: " + negNum);
        System.out.println("Number of zeros: " + zeros);
        System.out.println("Number of even numbers: " + evenNum);
        System.out.println("Number of odd numbers: " + oddNum);
    }
}
