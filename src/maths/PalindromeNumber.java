package maths;

public class PalindromeNumber {
    static boolean palindromeNumber(int num){
        if(num < 0){
            return false;
        }
        int org = num;
        int rev = 0;
        while(num != 0){
            int rem = num % 10;
            num = num / 10;
            rev = (rev * 10) + rem;
        }
        return org == rev;
    }
    public static void main(String[] args) {
        int num = -121;
        System.out.println(palindromeNumber(num));
    }
}
