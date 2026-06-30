package bytexl.arrays.commonArrayOperations;

import java.util.*;

public class MergeTwoArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];

        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];

        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        int[] arr3 = new int[n1 + n2];
        int index = 0;

        for (int i = 0; i < n1; i++) {
            arr3[index++] = arr1[i];
        }

        for (int i = 0; i < n2; i++) {
            arr3[index++] = arr2[i];
        }

        System.out.println("Merged array: " + Arrays.toString(arr3));
    }
}
