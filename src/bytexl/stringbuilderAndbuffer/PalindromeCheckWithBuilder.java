package bytexl.stringbuilderAndbuffer;

import java.util.Scanner;

public class PalindromeCheckWithBuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextLine()) return;
        String str = sc.nextLine();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                sb.append(Character.toLowerCase(ch));
            }
        }

        String cleaned = sb.toString();
        String reversed = sb.reverse().toString();

        System.out.println(cleaned.equals(reversed));
        sc.close();
    }
}
