package capgeminipractice;

public class FindTheFirstNonRepeatingCharacter {
    static char firstNonRepeatingChar(String str) {
        char[] arr = str.toCharArray();
        int[] charFreq = new int[26];
        for(int i = 0; i < arr.length; i++){
            char ch = arr[i];
            charFreq[ch - 'a']++;
        }
        for(int i = 0; i < arr.length; i++){
            char ch = arr[i];
            if(charFreq[ch - 'a'] == 1){
                return ch;
            }
        }
        return '-';
    }
    public static void main(String[] args) {
        String str = "aabbccd";
        System.out.println(firstNonRepeatingChar(str));
    }
}
