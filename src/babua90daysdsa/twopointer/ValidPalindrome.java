package babua90daysdsa.twopointer;

public class ValidPalindrome {
    static boolean isPalindrome(String s){
        int left = 0;
        int right = s.length()-1;
        while(left < right){
            while(left < right && !isAlphaNumeric(s.charAt(left))){
                left++;
            }
            while(left < right && !isAlphaNumeric(s.charAt(right))){
                right--;
            }
            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
                return false;
            }

            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(str));
    }
    static boolean isAlphaNumeric(char ch){
        return (ch >= 'a' && ch <= 'z') ||
                (ch >= 'A' && ch <= 'Z') ||
                (ch >= '0' && ch <= '9');
    }
}
