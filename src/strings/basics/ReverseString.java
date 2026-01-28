package strings.basics;

/**
 * ReverseString
 *
 * Purpose:
 * - Learn different ways to reverse a String in Java
 * - Understand which approach is best for DSA & interviews
 *
 * Approaches Covered:
 * 1. Using char[] + Two Pointers (BEST for DSA)
 * 2. Using StringBuilder (Quick & clean)
 * 3. Using loop + new String (NOT recommended for large input)
 */
public class ReverseString {

    public static void main(String[] args) {

        String input = "hello";

        System.out.println("Original String: " + input);

        // Approach 1: char[] + Two Pointers
        System.out.println("Reverse (Two Pointers): " + reverseUsingTwoPointers(input));

        // Approach 2: StringBuilder
        System.out.println("Reverse (StringBuilder): " + reverseUsingBuilder(input));

        // Approach 3: Loop + String (bad approach)
        System.out.println("Reverse (Loop): " + reverseUsingLoop(input));
    }

    /**
     * Approach 1: char[] + Two Pointers
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     *
     * BEST approach for DSA problems
     */
    static String reverseUsingTwoPointers(String s) {
        char[] arr = s.toCharArray();

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        return new String(arr);
    }

    /**
     * Approach 2: StringBuilder
     * Time Complexity: O(n)
     *
     * Clean and simple, used often in real projects
     */
    static String reverseUsingBuilder(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    /**
     * Approach 3: Loop + String Concatenation
     * Time Complexity: O(n^2)
     *
     * NOT recommended (String is immutable)
     */
    static String reverseUsingLoop(String s) {
        String result = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            result = result + s.charAt(i);
        }

        return result;
    }
}

