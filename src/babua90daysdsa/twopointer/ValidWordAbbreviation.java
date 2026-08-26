package babua90daysdsa.twopointer;

public class ValidWordAbbreviation {
    static boolean validAbbreviation(String word, String abbr){
        int i = 0;
        int j = 0;

        while(i < word.length() && j < abbr.length()){
            char wordChar = word.charAt(i);
            char abbrChar = abbr.charAt(j);

            if(Character.isDigit(abbrChar)){
                if(abbrChar == '0'){
                    return false;
                }

                int curr = 0;

                while(j < abbr.length() && Character.isDigit(abbr.charAt(j))){
                    curr = curr * 10 + (abbr.charAt(j) - '0');
                    j++;
                }

                i = i + curr;
            }else{
                if(abbrChar != wordChar){
                    return false;
                }
                i++;
                j++;
            }
        }
        return i == word.length() && j == abbr.length();
    }

    public static void main(String[] args) {
        String word = "apple";
        String abbr = "a3e";
        System.out.println((validAbbreviation(word,abbr)));
    }
}
