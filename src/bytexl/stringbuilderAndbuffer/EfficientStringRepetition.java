package bytexl.stringbuilderAndbuffer;

import java.util.Scanner;

public class EfficientStringRepetition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextLine()) return;
        String str = sc.nextLine();

        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(str);
        }

        System.out.println(sb);
        sc.close();
    }
}
