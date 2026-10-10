package babua90daysdsa.slidingwindow;

import java.util.HashSet;
import java.util.Set;

public class LongestSubStringWithoutRepeatingCharactersOptimize {
    static int lengthOfLongestSubstring(String s) {

        int max = 0;
        int i = 0;
        int j = 0;

        Set<Character> set = new HashSet<>();

        while(j < s.length()){
            char ch = s.charAt(j);

            while(set.contains(ch)){
                set.remove(s.charAt(i));
                i++;
            }

            set.add(ch);
            max = Math.max(max,j - i + 1);

            j++;
        }

        return max;
    }
    public static void main(String[] args) {
        String s = "bacda";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
