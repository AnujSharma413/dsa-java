package patterns.twopointers.sliding_window.fixed_size;

import java.util.HashMap;
import java.util.Map;

/**
 * Problem:
 * Count occurrences of anagrams of a pattern string in a given text string.
 *
 * Pattern Used:
 * Fixed Size Sliding Window (Aditya Verma approach)
 *
 * Idea:
 * - Use a frequency map of pattern characters
 * - Maintain a window of size k (pattern length)
 * - Decrease frequency when character enters window
 * - Increase frequency when character leaves window
 * - Use `count` to track how many unique characters are still unmatched
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1) (since alphabet size is constant)
 *
 * Related Problems:
 * - LeetCode 438: Find All Anagrams in a String
 * - GFG: Count Occurrences of Anagrams
 */
public class CountOccurrencesOfAnagrams {

    static int countOccurrences(String txt, String pat){

        // Build frequency map for pattern
        Map<Character, Integer> map = new HashMap<>();
        for(char c : pat.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int i = 0;                  // window start
        int j = 0;                  // window end
        int k = pat.length();       // window size
        int count = map.size();     // number of unique chars to match
        int ans = 0;                // final answer

        while(j < txt.length()){
            char ch = txt.charAt(j);

            // If character exists in map, reduce its frequency
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch) - 1);
                if(map.get(ch) == 0) count--;
            }

            // If window size is less than k, expand window
            if(j - i + 1 < k){
                j++;
            }
            // When window size hits k
            else {
                // If all characters matched, count this window
                if(count == 0) ans++;

                // Remove the leftmost character from window
                char leftChar = txt.charAt(i);
                if(map.containsKey(leftChar)){
                    map.put(leftChar, map.get(leftChar) + 1);
                    if(map.get(leftChar) == 1) count++;
                }

                i++;    // slide window
                j++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String txt = "aabaabaa";
        String pat = "aaba";
        System.out.println(countOccurrences(txt, pat)); // Output: 4
    }
}
