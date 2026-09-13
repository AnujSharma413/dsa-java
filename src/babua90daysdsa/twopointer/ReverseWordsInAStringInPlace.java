package babua90daysdsa.twopointer;

public class ReverseWordsInAStringInPlace {
    public static String reverseWords(String s) {
        int l = 0;
        int r = s.length() - 1;

        // Trim leading spaces
        while (l < s.length() && s.charAt(l) == ' ') {
            l++;
        }

        // Trim trailing spaces
        while (r >= 0 && s.charAt(r) == ' ') {
            r--;
        }

        // If string is empty or contains only spaces
        if (l > r) {
            return "";
        }

        // Build cleaned StringBuilder (single spaces between words)
        StringBuilder sb = new StringBuilder();

        while (l <= r) {
            if (s.charAt(l) != ' ') {
                sb.append(s.charAt(l));
                l++;
            } else {
                if (sb.charAt(sb.length() - 1) != ' ') {
                    sb.append(' ');
                }
                l++;
            }
        }

        // Step 1: Reverse entire StringBuilder
        int i = 0;
        int j = sb.length() - 1;

        while (i < j) {
            char temp = sb.charAt(i);
            sb.setCharAt(i, sb.charAt(j)); // FIXED: was sb.charAt(i)
            sb.setCharAt(j, temp);
            i++;
            j--;
        }

        // Step 2: Reverse word by word
        int start = 0;
        int end = 0;

        while (start < sb.length()) {
            while (end < sb.length() && sb.charAt(end) != ' ') {
                end++;
            }

            int p1 = start;
            int p2 = end - 1;

            while (p1 < p2) {
                char temp = sb.charAt(p1);
                sb.setCharAt(p1, sb.charAt(p2));
                sb.setCharAt(p2, temp);
                p1++;
                p2--;
            }

            start = end + 1;
            end = start;
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "  hello world  ";
        System.out.println(reverseWords(s));
    }
}