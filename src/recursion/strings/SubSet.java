package recursion.strings;

import java.util.ArrayList;
import java.util.List;

public class SubSet {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3};

        // Calling subset function
        List<List<Integer>> ans = subset(arr);

        // Printing all subsets
        for (List<Integer> list : ans) {
            System.out.println(list);
        }
    }

    /*
        This method generates all subsets of an array.

        Idea:
        For every number in the array
        copy existing subsets and add the number to them
    */

    static List<List<Integer>> subset(int[] arr) {

        // outer list will store all subsets
        List<List<Integer>> outer = new ArrayList<>();

        // first subset is always empty
        outer.add(new ArrayList<>());

        // iterate through every number in the array
        for (int num : arr) {

            // current size of outer list
            int n = outer.size();

            /*
                we only iterate through the subsets
                that existed before adding current number
            */
            for (int i = 0; i < n; i++) {

                // copy the existing subset
                List<Integer> internal = new ArrayList<>(outer.get(i));

                // add current number to copied subset
                internal.add(num);

                // add new subset into outer list
                outer.add(internal);
            }
        }

        // return all subsets
        return outer;
    }
}