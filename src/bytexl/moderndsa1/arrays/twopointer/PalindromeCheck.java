package bytexl.moderndsa1.arrays.twopointer;

public class PalindromeCheck {
    static boolean isPalindrome(String str){
        int left = 0;
        int right = str.length() - 1;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "madam";
        System.out.println(isPalindrome(str));
    }
}
