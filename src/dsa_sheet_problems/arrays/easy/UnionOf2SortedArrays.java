package dsa_sheet_problems.arrays.easy;

import java.util.ArrayList;

/**
 * Problem: Find the Union of two sorted arrays.
 * Logic:
 * 1. Use two pointers 'i' and 'j' to traverse arrays 'a' and 'b'.
 * 2. Compare elements: add the smaller one to the list and increment its pointer.
 * 3. If elements are equal, add one and increment both pointers.
 * 4. Crucial: Before adding, check if the element is already the last element in 'res' to avoid duplicates.
 * * Time Complexity: O(n + m) - Each element is visited once.
 * * Space Complexity: O(n + m) - To store the result.
 */
public class UnionOf2SortedArrays {

    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        ArrayList<Integer> res = new ArrayList<>();
        int i = 0;
        int j = 0;

        while (i < a.length && j < b.length) {
            if (a[i] == b[j]) {
                // Add only if it's not a duplicate of the last element
                if (res.isEmpty() || res.get(res.size() - 1) != a[i]) {
                    res.add(a[i]);
                }
                i++;
                j++;
            } else if (a[i] < b[j]) {
                if (res.isEmpty() || res.get(res.size() - 1) != a[i]) {
                    res.add(a[i]);
                }
                i++;
            } else {
                if (res.isEmpty() || res.get(res.size() - 1) != b[j]) {
                    res.add(b[j]);
                }
                j++;
            }
        }

        // Add remaining elements from array 'a'
        while (i < a.length) {
            if (res.isEmpty() || res.get(res.size() - 1) != a[i]) {
                res.add(a[i]);
            }
            i++;
        }

        // Add remaining elements from array 'b'
        while (j < b.length) {
            if (res.isEmpty() || res.get(res.size() - 1) != b[j]) {
                res.add(b[j]);
            }
            j++;
        }

        return res;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 3, 5};
        int[] b = {2, 3, 4, 6};

        System.out.println("Array A: {1, 2, 3, 3, 5}");
        System.out.println("Array B: {2, 3, 4, 6}");

        ArrayList<Integer> res = findUnion(a, b);
        System.out.println("Union: " + res); // Output: [1, 2, 3, 4, 5, 6]
    }
}