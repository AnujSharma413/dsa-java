package strings.basics;

public class ToggleCase {

    // Using String (IMMUTABLE)
    // Every concatenation creates a NEW String object
    // Time Complexity: O(n²) in worst case
    static String toggleCase1(String str) {
        String res = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // If uppercase → convert to lowercase
            if (isUpperCase(ch)) {
                res = res + Character.toLowerCase(ch);
            }
            // If lowercase → convert to uppercase
            else if (isLowerCase(ch)) {
                res = res + Character.toUpperCase(ch);
            }
            // Digits / spaces / symbols → keep as it is
            else {
                res = res + ch;
            }
        }
        return res;
    }

    // Using StringBuilder (MUTABLE) — Preferred
    // No new object creation on append
    // Time Complexity: O(n)
    static String toggleCase2(String str) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (isUpperCase(ch)) {
                sb.append(Character.toLowerCase(ch));
            }
            else if (isLowerCase(ch)) {
                sb.append(Character.toUpperCase(ch));
            }
            else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    // Checks if character is uppercase alphabet
    static boolean isUpperCase(char ch) {
        return ch >= 'A' && ch <= 'Z';
    }

    // Checks if character is lowercase alphabet
    static boolean isLowerCase(char ch) {
        return ch >= 'a' && ch <= 'z';
    }

    public static void main(String[] args) {
        String str = "jAvA WoRlD 123!";
        System.out.println(toggleCase1(str));
        System.out.println(toggleCase2(str));
    }
}
