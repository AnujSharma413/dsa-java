package babua90daysdsa.slidingwindow;

import java.util.HashSet;
import java.util.Set;

public class LongestSubStringWithoutRepeatingCharacters {
    static int lengthOfLongestSubstring(String s) {

        int max = 0;

        for(int i = 0; i < s.length(); i++){
            Set<Character> set = new HashSet<>();
            for(int j = i; j < s.length(); j++){
                char ch = s.charAt(j);

                if(set.contains(ch)){
                    break;
                }

                set.add(ch);
                max = Math.max(max,j - i + 1);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
