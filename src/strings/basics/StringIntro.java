package strings.basics;

public class StringIntro {

    public static void main(String[] args) {

        // 1. String Creation:

        // String Literal (Stored in String Constant Pool - SCP)
        String s1 = "hello";
        String s2 = "hello";

        // Proof: Both point to same SCP object
        System.out.println(s1 == s2); // true

        // new keyword (Heap Memory)
        // Creates a new object in heap
        // Literal "hello" already exists in SCP
        String s3 = new String("hello");


        // 2. == vs equals():

        // == compares reference (memory address)
        System.out.println(s1 == s3); // false

        // equals() compares value/content
        System.out.println(s1.equals(s3)); // true


        // 3. Immutability

        String s4 = "Hello";
        s4.concat(" World"); // creates new object, does NOT change s4
        System.out.println(s4); // Hello

        // Correct way
        String s5 = "Hello";
        s5 = s5.concat(" World");
        System.out.println(s5); // Hello World


        // 4. String Interning:

        String s6 = new String("java").intern();
        String s7 = "java";

        // intern() moves reference to SCP
        System.out.println(s6 == s7); // true


        // 5. Performance Issue with String

        String s = "";
        for (int i = 0; i < 5; i++) {
            s = s + i; // creates new object every time
        }
        System.out.println(s);
    }
}

