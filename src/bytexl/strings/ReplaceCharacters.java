package bytexl.strings;

import java.util.Scanner;

public class ReplaceCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextLine()) return;
        String str = sc.nextLine();

        if (!sc.hasNext()) return;
        char replaceChar = sc.next().charAt(0);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            if (current == ' ') {
                sb.append(replaceChar);
            } else {
                sb.append(current);
            }
        }

        System.out.println(sb.toString());
    }
}
