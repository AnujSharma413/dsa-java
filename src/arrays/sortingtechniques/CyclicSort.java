package arrays.sortingtechniques;

import java.util.Arrays;

/**
 * Concept:
 * Cyclic Sort is a non-comparison based sorting technique.
 * It is used when the array contains numbers in a continuous range.
 *
 * Core Idea:
 * - Every element has a correct index.
 * - We keep swapping elements until each element is at its correct position.
 *
 * For range [1 - n]:
 * - Correct index of an element = value - 1
 *
 * Explanation:
 * - Start from index i = 0.
 * - Find the correct index of arr[i].
 * - If arr[i] is not at its correct position, swap it.
 * - If it is already at correct position, move to next index.
 * - Continue until the entire array is sorted.
 *
 * Why it works:
 * - Each swap places at least one element at its correct index.
 * - No unnecessary comparisons.
 *
 * Key Points (VERY IMPORTANT):
 * - Works ONLY when elements are in range [1 - n]
 * - No duplicates allowed (unless problem explicitly handles them)
 * - Array size = n, values must also map to n positions
 *
 * Time Complexity:
 * - Best Case: O(n)
 * - Worst Case: O(n)
 *
 * Space Complexity:
 * - O(1) (In-place sorting)
 *
 * Source:
 * - Learned from Kunal Kushwaha (DSA Playlist)
 */
public class CyclicSort {

    static void cyclicSort(int[] arr){
        int i = 0;

        // Loop until entire array is processed
        while(i < arr.length){

            // Correct index for current element
            int correct = arr[i] - 1;

            // If element is not at correct position, swap it
            if(arr[i] != arr[correct]){
                swap(arr, i, correct);
            }
            // If element is already at correct position, move ahead
            else{
                i++;
            }
        }
    }

    // Swap two elements
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 1, 4};

        cyclicSort(arr);

        System.out.println(Arrays.toString(arr));
    }
}
