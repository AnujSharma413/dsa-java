package bytexl.strings;

import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextLine()) return;
        String s1 = sc.nextLine();

        if (!sc.hasNextLine()) return;
        String s2 = sc.nextLine();

        int result = s1.compareTo(s2);
        System.out.println(result);

        sc.close();
    }
}
