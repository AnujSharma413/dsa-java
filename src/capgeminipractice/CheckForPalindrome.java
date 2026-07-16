package capgeminipractice;

public class CheckForPalindrome {
    public static boolean isPalindrome(String str) {
        str = str.toLowerCase();
        char[] charArray = str.toCharArray();
        int left = 0;
        int right = str.length()-1;
        while(left < right){
            if(charArray[left] != charArray[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "Madam";
        System.out.println(isPalindrome(str));
    }
}
