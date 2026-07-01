package bytexl.strings;

import java.util.Scanner;

public class ExtractSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextLine()) return;
        String str = sc.nextLine();

        if (!sc.hasNextInt()) return;
        int start = sc.nextInt();

        if (!sc.hasNextInt()) return;
        int end = sc.nextInt();

        // Validation check for platform index protection constraints
        if (start < 0 || end > str.length() || start >= end) {
            System.out.println("");
        } else {
            String subString = str.substring(start, end);
            System.out.println(subString);
        }
    }
}