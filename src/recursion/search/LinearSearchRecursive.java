package recursion.search;

import java.util.ArrayList;

/**
 * PURPOSE:
 * Demonstrates LINEAR SEARCH using RECURSION.
 *
 * Implementations included:
 * 1. Check if an element exists (boolean)
 * 2. Find first index of target
 * 3. Find last index of target
 * 4. Find ALL indices using:
 *    a) Global list (side effects)
 *    b) Passing ArrayList as argument (pure recursion)
 *
 * Core Recursion Idea:
 * - Reduce problem size by moving index
 * - Base condition stops recursion
 */
public class LinearSearchRecursive {

     // 1. CHECK IF ELEMENT EXISTS (BOOLEAN):
    static boolean find(int[] arr, int target) {

        // Edge case: empty array
        if (arr.length == 0) {
            return false;
        }

        return helperFind(arr, target, 0);
    }

    static boolean helperFind(int[] arr, int target, int index) {

        // Base Condition:
        // Index moved outside array
        if (index == arr.length) {
            return false;
        }

        // If found at current index → true
        // Else continue recursion
        return arr[index] == target
                || helperFind(arr, target, index + 1);
    }

    // 2. FIND FIRST INDEX OF TARGET:
    static int findIndex(int[] arr, int target) {

        if (arr.length == 0) {
            return -1;
        }

        return helperFirstIndex(arr, target, 0);
    }

    static int helperFirstIndex(int[] arr, int target, int index) {

        // Base Condition:
        // Entire array searched
        if (index == arr.length) {
            return -1;
        }

        // Return immediately when found
        if (arr[index] == target) {
            return index;
        }

        return helperFirstIndex(arr, target, index + 1);
    }


    // 3. FIND LAST INDEX OF TARGET:
    static int findIndexLast(int[] arr, int target) {

        if (arr.length == 0) {
            return -1;
        }

        // Start searching from end
        return helperLastIndex(arr, target, arr.length - 1);
    }

    static int helperLastIndex(int[] arr, int target, int index) {

        // Base Condition:
        // Crossed array start
        if (index < 0) {
            return -1;
        }

        if (arr[index] == target) {
            return index;
        }

        return helperLastIndex(arr, target, index - 1);
    }


    // 4. FIND ALL INDICES (USING GLOBAL LIST):
    static ArrayList<Integer> list = new ArrayList<>();

    static void findAllIndex(int[] arr, int target, int index) {

        // Base Condition
        if (index == arr.length) {
            return;
        }

        // Add index if match found
        if (arr[index] == target) {
            list.add(index);
        }

        findAllIndex(arr, target, index + 1);
    }


    // 5. FIND ALL INDICES (PASSING LIST AS ARGUMENT):
    static ArrayList<Integer> findAllIndexAL(
            int[] arr,
            int target,
            int index,
            ArrayList<Integer> list) {

        // Base Condition
        if (index == arr.length) {
            return list;
        }

        if (arr[index] == target) {
            list.add(index);
        }

        return findAllIndexAL(arr, target, index + 1, list);
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 5, 5, 3, 7, 12};
        int target = 5;

        System.out.println(find(arr, target));          // true
        System.out.println(findIndex(arr, target));     // 2
        System.out.println(findIndexLast(arr, target)); // 3

        findAllIndex(arr, target, 0);
        System.out.println(list); // [2, 3]

        ArrayList<Integer> temp = new ArrayList<>();
        ArrayList<Integer> ans = findAllIndexAL(arr, target, 0, temp);
        System.out.println(ans);  // [2, 3]
    }
}