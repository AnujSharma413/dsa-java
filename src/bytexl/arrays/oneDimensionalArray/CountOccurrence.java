package bytexl.arrays.oneDimensionalArray;

import java.util.Scanner;

public class CountOccurrence{
    static int countOccurrence(int[] arr, int num){
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == num){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int num = sc.nextInt();

        System.out.println("The element " + num + " occurs " + countOccurrence(arr, num) + " time(s) in the array");
    }
}
