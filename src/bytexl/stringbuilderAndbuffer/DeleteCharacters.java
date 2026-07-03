package bytexl.stringbuilderAndbuffer;

import java.util.Scanner;

public class DeleteCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextLine()) return;
        String s = sc.nextLine();

        if (!sc.hasNextInt()) return;
        int startIndex = sc.nextInt();
        if (!sc.hasNextInt()) return;
        int endIndex = sc.nextInt();

        StringBuffer sb = new StringBuffer(s);
        sb.delete(startIndex, endIndex);

        System.out.println(sb.toString());
        sc.close();
    }
}
