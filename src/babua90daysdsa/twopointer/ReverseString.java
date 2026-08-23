package babua90daysdsa.twopointer;

import java.util.Arrays;

public class ReverseString {
    static void reverseString(char[] ch){
        int left = 0;
        int right = ch.length-1;
        while(left < right){
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        char[] ch = {'h','e','l','l','o'};
        reverseString(ch);
        System.out.println(Arrays.toString(ch));
    }
}
