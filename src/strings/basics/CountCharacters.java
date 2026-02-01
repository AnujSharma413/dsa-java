package strings.basics;

import java.util.Arrays;

public class CountCharacters {

    // Counts frequency of a-z characters (case-insensitive)
    static int[] countChar(String str) {

        // Convert to lowercase to handle case-insensitive counting
        str = str.toLowerCase();

        // Frequency array for 26 lowercase letters
        int[] freq = new int[26];

        // Traverse string character by character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Count only lowercase alphabet characters
            if (ch >= 'a' && ch <= 'z') {
                freq[ch - 'a']++;
            }
        }

        return freq;
    }

    public static void main(String[] args) {
        String str = "Hello World!";
        System.out.println(Arrays.toString(countChar(str)));
    }
}
