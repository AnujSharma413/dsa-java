package capgeminipractice;

public class CountVowelsAndConsonants {
    static void countVowelsConsonants(String str) {
        int vowelCount = 0;
        int consonantCount = 0;
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch == 'A' || ch == 'a' || ch == 'E'|| ch == 'e' || ch == 'I' || ch == 'i' || ch == 'O' || ch == 'o' || ch == 'U' || ch == 'u'){
                vowelCount++;
            }else if((ch >= 'a' && ch <='z') || (ch >= 'A' && ch <='Z')){
                consonantCount++;
            }
        }
        System.out.println("Vowels: " + vowelCount + ", Consonants: " + consonantCount);
    }
    public static void main(String[] args) {
        String str = "Capgemini 2026";
        countVowelsConsonants(str);
    }
}
