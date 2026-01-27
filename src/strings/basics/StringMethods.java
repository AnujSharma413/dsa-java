package strings.basics;

/**
 * StringMethods
 *
 * Purpose:
 * - Learn commonly used String methods in Java
 * - Understand their behavior for interviews and DSA
 *
 * Important:
 * - String is immutable
 * - Most methods return NEW String objects
 */
public class StringMethods {

    public static void main(String[] args) {

        String str = "  Hello Java World  ";

        // length()
        System.out.println("Length: " + str.length());

        // charAt(index)
        System.out.println("Char at index 2: " + str.charAt(2));

        // toLowerCase() & toUpperCase()
        System.out.println("Lowercase: " + str.toLowerCase());
        System.out.println("Uppercase: " + str.toUpperCase());

        // trim()
        System.out.println("Trimmed: '" + str.trim() + "'");

        // substring(beginIndex)
        System.out.println("Substring from index 6: " + str.substring(6));

        // substring(beginIndex, endIndex)
        System.out.println("Substring (6,10): " + str.substring(6, 10));

        // contains()
        System.out.println("Contains 'Java': " + str.contains("Java"));

        // startsWith() & endsWith()
        System.out.println("Starts with '  He': " + str.startsWith("  He"));
        System.out.println("Ends with 'ld  ': " + str.endsWith("ld  "));

        // equals() vs equalsIgnoreCase()
        String a = "Java";
        String b = "java";

        System.out.println("equals(): " + a.equals(b));
        System.out.println("equalsIgnoreCase(): " + a.equalsIgnoreCase(b));

        // compareTo()
        System.out.println("compareTo(): " + a.compareTo("Java"));
        System.out.println("compareTo(): " + a.compareTo("Python"));

        // replace()
        System.out.println("Replace 'Java' with 'DSA': " + str.replace("Java", "DSA"));

        // split()
        String sentence = "Learn Java DSA Patterns";
        String[] words = sentence.split(" ");

        System.out.print("Split words: ");
        for (String word : words) {
            System.out.print(word + " | ");
        }
        System.out.println();

        // indexOf() & lastIndexOf()
        System.out.println("Index of 'a': " + sentence.indexOf('a'));
        System.out.println("Last index of 'a': " + sentence.lastIndexOf('a'));

        /*
         * Final Notes:
         * - Most String methods return new String objects
         * - Always be careful with index-based methods
         * - Avoid heavy String concatenation inside loops
         */
    }
}
