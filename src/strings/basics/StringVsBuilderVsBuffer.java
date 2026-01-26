package strings.basics;

/**
 * This class demonstrates the difference between:
 * 1. String
 * 2. StringBuilder
 * 3. StringBuffer
 *
 * Focus:
 * - Mutability
 * - Performance
 * - DSA usage
 */
public class StringVsBuilderVsBuffer {

    public static void main(String[] args) {

        // STRING:
        // String is IMMUTABLE
        // Every modification creates a NEW object in memory
        String s1 = "hello";
        s1 = s1.concat(" world");
        System.out.println(s1);

        // Using String inside loop -> BAD PRACTICE (DSA)
        for (int i = 0; i < 5; i++) {
            s1 = s1 + i; // creates new object each iteration
        }
        System.out.println("String result: " + s1);


        // STRING BUILDER:
        // StringBuilder is MUTABLE
        // Modifies the SAME object -> FAST
        // NOT thread-safe (but BEST for DSA)
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        System.out.println(sb);

        // Efficient string modification
        for (int i = 0; i < 5; i++) {
            sb.append(i); // no new object creation
        }
        System.out.println("StringBuilder result: " + sb);


        // STRING BUFFER:
        // StringBuffer is MUTABLE
        // Thread-safe (synchronized)
        // Slower than StringBuilder
        StringBuffer sbf = new StringBuffer("Welcome");
        sbf.append(" Home");
        System.out.println(sbf);

        for (int i = 0; i < 5; i++) {
            sbf.append(i);
        }
        System.out.println("StringBuffer result: " + sbf);
    }
}
