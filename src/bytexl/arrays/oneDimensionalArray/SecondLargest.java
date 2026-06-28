package bytexl.arrays.oneDimensionalArray;

//Enhance your coding skills, start writing your code here!!
import java.util.*;

public class SecondLargest{
    static int secondLargest(int[] arr){
        Arrays.sort(arr);

        int n = arr.length;
        int max = arr[n-1];

        for(int i = n - 1; i >= 0; i--){
            if(arr[i] != max){
                return arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(secondLargest(arr));
    }
}
