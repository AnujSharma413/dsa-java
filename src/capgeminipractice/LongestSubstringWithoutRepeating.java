package capgeminipractice;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeating {
    static int longestSubstringWithoutRepeating(String str) {
        Set<Character> charSet = new HashSet<>();

        int left = 0;
        int maxLength = 0;

        for(int right = 0; right < str.length(); right++){

            while(charSet.contains(str.charAt(right))){
                charSet.remove(str.charAt(left));
                left++;
            }

            charSet.add(str.charAt(right));
            maxLength = Math.max(maxLength,right-left+1);
        }
        return maxLength;
    }
    public static void main(String[] args) {
        String str = "abcabcbb";
        System.out.println(longestSubstringWithoutRepeating(str));
    }
}
