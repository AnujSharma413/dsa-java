package recursion.strings;

/**
 * PURPOSE:
 * Demonstrates recursion with STRING PATTERN SKIPPING.
 *
 * Problems solved:
 *
 * 1. Remove the substring "apple" from a string
 * 2. Remove the substring "app" ONLY if it is NOT part of "apple"
 *
 * Core Recursion Idea:
 * - Check prefix of the current string
 * - Skip characters depending on pattern
 * - Reduce problem size using substring()
 */
public class SkipStringRecursive {

    public static void main(String[] args) {

        String str1 = "apapapplele";
        String str2 = "apapapplle";

        System.out.println(skipApple(str1));
        System.out.println(skipAppNotApple(str2));
    }

    /**
     * PROBLEM 1:
     * Remove "apple" from the string
     *
     * Example:
     * Input  : apapapplele
     * Output : apaple
     */
    static String skipApple(String str) {

        // Base Condition
        if (str.isEmpty()) {
            return "";
        }

        // If string starts with "apple"
        // skip entire word
        if (str.startsWith("apple")) {
            return skipApple(str.substring(5));
        }

        // Otherwise include current character
        return str.charAt(0) + skipApple(str.substring(1));
    }


    /**
     * PROBLEM 2:
     * Remove "app" but NOT "apple"
     *
     * Example:
     * Input  : apapapplle
     * Output : aplle
     */
    static String skipAppNotApple(String str) {

        // Base Condition
        if (str.isEmpty()) {
            return "";
        }

        /*
        Condition explanation:

        startsWith("app") → word begins with "app"
        !startsWith("apple") → but it is NOT "apple"

        So remove only "app"
         */
        if (str.startsWith("app") && !str.startsWith("apple")) {
            return skipAppNotApple(str.substring(3));
        }

        // Otherwise keep character
        return str.charAt(0) + skipAppNotApple(str.substring(1));
    }
}