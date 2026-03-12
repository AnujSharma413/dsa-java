package recursion.strings;

import java.util.ArrayList;

public class Permutations {

    public static void main(String[] args) {

        // initial call
        // p = processed string
        // up = unprocessed string

        ArrayList<String> ans = permutationsList("", "abc");

        // print all permutations
        System.out.println(ans);
    }

    /*
        METHOD 1
        Prints permutations directly
     */
    static void permutations(String p, String up){

        // base condition
        // when no characters remain to process
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        // take first character of unprocessed string
        char ch = up.charAt(0);

        /*
            insert this character at every position
            of processed string
         */
        for(int i = 0; i <= p.length(); i++){

            // part before insertion
            String f = p.substring(0, i);

            // part after insertion
            String s = p.substring(i, p.length());

            // recursive call with new processed string
            permutations(f + ch + s, up.substring(1));
        }
    }

    /*
        METHOD 2
        Returns permutations as ArrayList
     */
    static ArrayList<String> permutationsList(String p, String up){

        // base condition
        // when no characters remain
        if(up.isEmpty()){

            // create list to store permutation
            ArrayList<String> list = new ArrayList<>();

            // add the final permutation
            list.add(p);

            return list;
        }

        // take first character
        char ch = up.charAt(0);

        // list to store all permutations from this level
        ArrayList<String> ans = new ArrayList<>();

        /*
            try inserting the character
            at every position in processed string
         */
        for(int i = 0; i <= p.length(); i++){

            // split processed string
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());

            // recursive call
            ArrayList<String> temp =
                    permutationsList(f + ch + s, up.substring(1));

            // add all returned permutations
            ans.addAll(temp);
        }

        return ans;
    }
}