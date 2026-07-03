package bytexl.stringbuilderAndbuffer;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextLine()) return;
        String s = sc.nextLine();

        StringBuilder sb = new StringBuilder(s);
        sb.reverse();

        System.out.println(sb.toString());
        sc.close();
    }
}