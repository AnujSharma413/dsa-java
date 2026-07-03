package bytexl.stringbuilderAndbuffer;

import java.util.Scanner;

public class BuildString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;

        int n = sc.nextInt();
        sc.nextLine();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (sc.hasNextLine()) {
                sb.append(sc.nextLine());
            }
        }

        System.out.println(sb.toString());
        sc.close();
    }
}
