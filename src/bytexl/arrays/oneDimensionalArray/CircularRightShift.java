package bytexl.arrays.oneDimensionalArray;

import java.util.*;

public class CircularRightShift{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int last = arr[n-1];

        for(int i = n - 2; i >= 0; i--){
            arr[i+1] = arr[i];
        }

        arr[0] = last;

        System.out.println("Enter " + n + " elements:");
        System.out.println("Array after circular right shift:");
        System.out.println(Arrays.toString(arr));
    }
}
