package strings.basics;
/**
 * CharArrayConversion
 *
 * Purpose:
 * - Understand conversion between String and char[]
 * - Learn why char[] is preferred in DSA problems
 *
 * Key Points:
 * - String is immutable
 * - char[] is mutable
 * - Most string-based DSA problems internally work on char[]
 */
public class CharArrayConversion {

    public static void main(String[] args) {

        // String -> char[]

        String str = "hello";

        // Convert String to char array
        char[] chars = str.toCharArray();

        // Print char array using loop
        System.out.print("String to char[]: ");
        for (char ch : chars) {
            System.out.print(ch + " ");
        }
        System.out.println();

        // Modify char array (possible)
        chars[0] = 'H';
        System.out.println("Modified char[]: " + new String(chars));

        // Original string remains unchanged (immutability proof)
        System.out.println("Original String: " + str);


        // char[] -> String

        char[] arr = {'j', 'a', 'v', 'a'};

        // Convert char array to String
        String newStr = new String(arr);

        System.out.println("char[] to String: " + newStr);


        // Access difference

        // String access
        System.out.println("String charAt(1): " + str.charAt(1));

        // char[] access
        System.out.println("char[] index 1: " + chars[1]);

        /*
         * Conclusion:
         * - String cannot be modified directly
         * - char[] allows in-place changes
         * - Hence, DSA problems prefer char[] over String
         */
    }
}

