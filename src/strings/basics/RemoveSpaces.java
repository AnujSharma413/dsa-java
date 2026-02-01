package strings.basics;

public class RemoveSpaces {

    // Approach 1: Using String (IMMUTABLE)
    // Har concatenation par naya String object create hota hai
    // Time Complexity: O(n^2) in worst case
    static String removeSpaces1(String str) {
        String res = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Agar space nahi hai tabhi add karo
            if (ch != ' ') {
                // Yahan naya String object ban raha hai har baar
                res = res + ch;
            }
        }
        return res;
    }

    // Approach 2: Using StringBuilder (MUTABLE)
    // Same object modify hota hai, koi naya object create nahi hota
    // Time Complexity: O(n)
    static String removeSpaces2(String str) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Agar space nahi hai tabhi append karo
            if (ch != ' ') {
                sb.append(ch); // Same object update hota hai
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = " h e l l o ";

        System.out.println(removeSpaces1(str)); // hello
        System.out.println(removeSpaces2(str)); // hello
    }
}
