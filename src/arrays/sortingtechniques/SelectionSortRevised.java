package arrays.sortingtechniques;

import java.util.Arrays;

public class SelectionSortRevised {

    // This method sorts the array using Selection Sort (Max version)
    static void selectionSort(int[] arr){

        int n = arr.length;

        // Outer loop runs n times
        // After every iteration, the largest element
        // from the unsorted part is placed at its correct position
        for(int i = 0; i < n; i++){

            // Last index of current unsorted portion
            int lastIdx = n - i - 1;

            // Find index of maximum element in range [0, lastIdx]
            int maxIdx = getMax(arr, 0, lastIdx);

            // Swap the maximum element with the last element
            // of unsorted portion
            swap(arr, maxIdx, lastIdx);
        }
    }

    // Returns index of maximum element between start and end
    static int getMax(int[] arr, int start, int end){

        int max = start;

        for(int i = start; i <= end; i++){
            if(arr[i] > arr[max]){
                max = i;
            }
        }

        return max;
    }

    // Swaps two elements in the array
    static void swap(int[] arr, int first, int second){

        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void main(String[] args) {

        int[] arr = {5, 1, 4, 3, 2};

        selectionSort(arr);

        System.out.println(Arrays.toString(arr));
    }
}
