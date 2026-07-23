package capgeminipractice;

public class CheckTwoStringsAnagrams {
    static boolean isAnagram(String a, String b) {

        if(a.length() != b.length()){
            return false;
        }

        int[] charArray = new int[26];

        for(int i = 0; i < a.length(); i++){
            charArray[a.charAt(i) - 'a']++;
            charArray[b.charAt(i) - 'a']--;
        }

        for(int num : charArray){
            if(num != 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isAnagram("listen","silent"));
    }
}
