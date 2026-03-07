package recursion.strings;

import java.util.ArrayList;

public class SubSeq {
    public static void main(String[] args) {

        // Printing all subsequences by passing processed and unprocessed strings
        subseq("", "abc");

        // Returning all subsequences inside an ArrayList
        System.out.println(subseqRet("", "abc"));

        // Printing subsequences including ASCII values of characters
        subseqAscii("", "ab");
    }

    /*
        Method 1: Printing subsequences

        p -> processed string
        up -> unprocessed string

        At each step we have two choices:
        1. Include the character
        2. Exclude the character
    */
    static void subseq(String p, String up) {

        // Base condition: when unprocessed string becomes empty
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        // Take the first character
        char ch = up.charAt(0);

        // Include the character
        subseq(p + ch, up.substring(1));

        // Exclude the character
        subseq(p, up.substring(1));
    }

    /*
        Method 2: Returning subsequences in ArrayList

        Instead of printing, we collect results and return them
    */
    static ArrayList<String> subseqRet(String p, String up) {

        // Base condition
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        // Include character
        ArrayList<String> left = subseqRet(p + ch, up.substring(1));

        // Exclude character
        ArrayList<String> right = subseqRet(p, up.substring(1));

        // Merge results
        left.addAll(right);

        return left;
    }

    /*
        Method 3: ASCII subsequences

        At each step we have 3 choices:

        1. Include the character
        2. Exclude the character
        3. Include ASCII value of character

        Example for 'a':
        a
        (skip)
        97
    */
    static void subseqAscii(String p, String up) {

        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        // Include character
        subseqAscii(p + ch, up.substring(1));

        // Exclude character
        subseqAscii(p, up.substring(1));

        // Include ASCII value of character
        subseqAscii(p + (ch + 0), up.substring(1));
    }
}