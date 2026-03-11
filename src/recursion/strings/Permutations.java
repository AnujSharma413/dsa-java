package recursion.strings;

public class Permutations {

    public static void main(String[] args) {

        // initial call
        // p = processed string (initially empty)
        // up = unprocessed string
        permutations("", "abc");
    }

    /*
        This method prints all permutations of a string.

        p  -> processed part (where characters are already placed)
        up -> unprocessed part (characters still remaining)
     */

    static void permutations(String p, String up){

        // base condition
        // when unprocessed string becomes empty
        // it means one permutation is ready
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        // take first character from unprocessed string
        char ch = up.charAt(0);

        /*
            insert this character at every possible position
            inside the processed string
        */
        for(int i = 0; i <= p.length(); i++){

            // first part before insertion index
            String f = p.substring(0, i);

            // second part after insertion index
            String s = p.substring(i, p.length());

            /*
                insert character between f and s
                and recursively process remaining string
             */
            permutations(f + ch + s, up.substring(1));
        }
    }
}