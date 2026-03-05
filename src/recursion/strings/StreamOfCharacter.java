package recursion.strings;

public class StreamOfCharacter {

    public static void main(String[] args) {

        // Method 1: passing processed and unprocessed strings
        skip1("", "ababdac");

        // Method 2: returning string
        System.out.println(skip2("ababdac"));

    }


    /**
     * METHOD 1
     * Passing processed (p) and unprocessed (up)
     *
     * p  -> processed string
     * up -> remaining string to process
     */
    static void skip1(String p, String up) {

        // Base condition
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        // Skip character 'a'
        if (ch == 'a') {
            skip1(p, up.substring(1));
        }
        // Include character
        else {
            skip1(p + ch, up.substring(1));
        }
    }


    /**
     * METHOD 2
     * Only pass unprocessed string
     * Build result using return value
     */
    static String skip2(String up) {

        // Base condition
        if (up.isEmpty()) {
            return "";
        }

        char ch = up.charAt(0);

        // Skip 'a'
        if (ch == 'a') {
            return skip2(up.substring(1));
        }

        // Include character
        return ch + skip2(up.substring(1));
    }

}