package capgeminipractice;

import java.util.Arrays;

public class MoveAllZerosToTheEnd {
    static void moveZerosToEnd(int[] arr) {
        int slow = 0;
        for(int fast = 0; fast < arr.length; fast++){
            if(arr[fast] != 0){
                arr[slow] = arr[fast];
                slow++;
            }
        }
        while(slow != arr.length){
            arr[slow] = 0;
            slow++;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr = {0, 4, 0, 3, 0, 5, 8};
        moveZerosToEnd(arr);
    }
}
