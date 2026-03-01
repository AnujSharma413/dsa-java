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
 *    b) Passing ArrayList as argument
 *    c) Returning ArrayList from recursive calls (PURE FUNCTIONAL)
 *
 * Core Recursion Idea:
 * - Reduce problem size by moving index
 * - Base condition stops recursion
 */
public class LinearSearchRecursive {

    /* ---------------------------------------------------
       1️⃣ CHECK IF ELEMENT EXISTS (BOOLEAN)
       --------------------------------------------------- */

    static boolean find(int[] arr, int target) {

        // Edge case: empty array
        if (arr.length == 0) {
            return false;
        }

        return helperFind(arr, target, 0);
    }

    static boolean helperFind(int[] arr, int target, int index) {

        // Base Condition: index out of bounds
        if (index == arr.length) {
            return false;
        }

        // Check current index OR search in remaining array
        return arr[index] == target
                || helperFind(arr, target, index + 1);
    }

    /* ---------------------------------------------------
       2️⃣ FIND FIRST INDEX OF TARGET
       --------------------------------------------------- */

    static int findIndex(int[] arr, int target) {

        if (arr.length == 0) {
            return -1;
        }

        return helperFirstIndex(arr, target, 0);
    }

    static int helperFirstIndex(int[] arr, int target, int index) {

        // Base Condition
        if (index == arr.length) {
            return -1;
        }

        if (arr[index] == target) {
            return index;
        }

        return helperFirstIndex(arr, target, index + 1);
    }

    /* ---------------------------------------------------
       3️⃣ FIND LAST INDEX OF TARGET
       --------------------------------------------------- */

    static int findIndexLast(int[] arr, int target) {

        if (arr.length == 0) {
            return -1;
        }

        // Start from last index
        return helperLastIndex(arr, target, arr.length - 1);
    }

    static int helperLastIndex(int[] arr, int target, int index) {

        // Base Condition
        if (index < 0) {
            return -1;
        }

        if (arr[index] == target) {
            return index;
        }

        return helperLastIndex(arr, target, index - 1);
    }

    /* ---------------------------------------------------
       4️⃣ FIND ALL INDICES (USING GLOBAL LIST)
       ❌ Not recommended (side effects)
       --------------------------------------------------- */

    static ArrayList<Integer> list = new ArrayList<>();

    static void findAllIndex(int[] arr, int target, int index) {

        if (index == arr.length) {
            return;
        }

        if (arr[index] == target) {
            list.add(index);
        }

        findAllIndex(arr, target, index + 1);
    }

    /* ---------------------------------------------------
       5️⃣ FIND ALL INDICES (PASSING LIST AS ARGUMENT)
       ✔ Better approach
       --------------------------------------------------- */

    static ArrayList<Integer> findAllIndexAL1(
            int[] arr,
            int target,
            int index,
            ArrayList<Integer> list) {

        if (index == arr.length) {
            return list;
        }

        if (arr[index] == target) {
            list.add(index);
        }

        return findAllIndexAL1(arr, target, index + 1, list);
    }

    /* ---------------------------------------------------
       6️⃣ FIND ALL INDICES (RETURN LIST FROM EACH CALL)
       ⭐ MOST IMPORTANT PATTERN
       --------------------------------------------------- */

    static ArrayList<Integer> findAllIndexAL2(
            int[] arr,
            int target,
            int index) {

        // Create list for THIS function call
        ArrayList<Integer> list = new ArrayList<>();

        // Base Condition
        if (index == arr.length) {
            return list;
        }

        // Add current index if it matches
        if (arr[index] == target) {
            list.add(index);
        }

        // Get result from remaining calls
        ArrayList<Integer> ansFromBelowCalls =
                findAllIndexAL2(arr, target, index + 1);

        // Combine current answer with below calls
        list.addAll(ansFromBelowCalls);

        return list;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 5, 5, 7};
        int target = 5;

        System.out.println(find(arr, target));            // true
        System.out.println(findIndex(arr, target));       // 3
        System.out.println(findIndexLast(arr, target));   // 4

        findAllIndex(arr, target, 0);
        System.out.println(list); // [3, 4]

        ArrayList<Integer> temp = new ArrayList<>();
        System.out.println(findAllIndexAL1(arr, target, 0, temp)); // [3, 4]

        System.out.println(findAllIndexAL2(arr, target, 0));       // [3, 4]
    }
}