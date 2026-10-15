package babua90daysdsa.slidingwindow;

import java.util.*;

public class RepeatedDNASequences {
    static List<String> findRepeatedDnaSequences(String s){
        Set<String> seen = new HashSet<>();
        Set<String> result = new HashSet<>();

        for(int i = 0; i <= s.length() - 10; i++){
            String dna = s.substring(i, i+10);

            if(seen.contains(dna)){
                result.add(dna);
            }

            seen.add(dna);
        }

        return new ArrayList<String>(result);
    }
    public static void main(String[] args) {
        String s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
        List<String> res = findRepeatedDnaSequences(s);
        System.out.println(res);
    }
}
