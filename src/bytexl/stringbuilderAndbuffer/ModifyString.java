package bytexl.stringbuilderAndbuffer;

import java.util.Scanner;

public class ModifyString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextLine()) return;
        String originalString = sc.nextLine();

        if (!sc.hasNextLine()) return;
        String insertSubstring = sc.nextLine();

        if (!sc.hasNextInt()) return;
        int insertIndex = sc.nextInt();

        if (!sc.hasNextInt()) return;
        int startIndex = sc.nextInt();
        if (!sc.hasNextInt()) return;
        int endIndex = sc.nextInt();
        sc.nextLine();

        if (!sc.hasNextLine()) return;
        String replaceSubstring = sc.nextLine();

        StringBuilder sb = new StringBuilder(originalString);
        sb.insert(insertIndex, insertSubstring);
        sb.replace(startIndex, endIndex, replaceSubstring);

        System.out.println(sb.toString());
        sc.close();
    }
}