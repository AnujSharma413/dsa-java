package arrays.sortingtechniques;

import java.util.Arrays;

public class InsertionSortRevised {

    // This method performs insertion sort on the array
    static void insertionSort(int[] arr){

        // Outer loop:
        // i represents the index till which the array is assumed to be sorted
        // Initially, first element is considered sorted
        for(int i = 0; i < arr.length - 1; i++){

            // Inner loop:
            // j starts from the element just after the sorted part
            // and moves backwards to place the element at correct position
            for(int j = i + 1; j > 0; j--){

                // If current element is smaller than previous,
                // swap them (shifting the element left)
                if(arr[j] < arr[j - 1]){
                    swap(arr, j, j - 1);
                }
                // If element is already in correct position,
                // break because left side is already sorted
                else {
                    break;
                }
            }
        }
    }

    // swap two elements in array
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 1, 4, 2};

        insertionSort(arr);

        System.out.println(Arrays.toString(arr));
    }
}
