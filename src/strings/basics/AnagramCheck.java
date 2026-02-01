package strings.basics;

public class AnagramCheck {

    // Check if two strings are valid anagrams
    static boolean validAnagram(String str1, String str2) {

        // Case-insensitive comparison
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        int[] freq = new int[26];

        // Count frequency of characters in str1
        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);

            // Ignore non-alphabet characters (spaces, symbols)
            if (ch >= 'a' && ch <= 'z') {
                freq[ch - 'a']++;
            }
        }

        // Decrease frequency using str2
        for (int i = 0; i < str2.length(); i++) {
            char ch = str2.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                freq[ch - 'a']--;
            }
        }

        // If all frequencies are zero -> anagram
        for (int count : freq) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(validAnagram("listen", "silent"));          // true
        System.out.println(validAnagram("Dormitory", "Dirty room"));   // true
        System.out.println(validAnagram("rat", "car"));                // false
    }
}
