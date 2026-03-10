package recursion.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSet {

    public static void main(String[] args) {

        int[] arr = {1, 2, 2};

        // calling subset method for duplicates
        List<List<Integer>> ans = subsetDuplicate(arr);

        // printing all subsets
        for (List<Integer> list : ans) {
            System.out.println(list);
        }
    }

    /*
        Normal subset generation
        Works only when array has unique elements
    */
    static List<List<Integer>> subset(int[] arr) {

        List<List<Integer>> outer = new ArrayList<>();

        // start with empty subset
        outer.add(new ArrayList<>());

        for (int num : arr) {

            int n = outer.size();

            for (int i = 0; i < n; i++) {

                // copy existing subset
                List<Integer> internal = new ArrayList<>(outer.get(i));

                // add current element
                internal.add(num);

                // store new subset
                outer.add(internal);
            }
        }

        return outer;
    }

    /*
        Subset generation with duplicate handling
    */
    static List<List<Integer>> subsetDuplicate(int[] arr) {

        // sorting is required to detect duplicates
        Arrays.sort(arr);

        List<List<Integer>> outer = new ArrayList<>();

        // first subset
        outer.add(new ArrayList<>());

        int start = 0;
        int end = 0;

        for (int i = 0; i < arr.length; i++) {

            start = 0;

            /*
                if current element is same as previous
                we only extend subsets created in previous iteration
            */
            if (i > 0 && arr[i] == arr[i - 1]) {
                start = end + 1;
            }

            // store previous end
            end = outer.size() - 1;

            int n = outer.size();

            for (int j = start; j < n; j++) {

                // copy existing subset
                List<Integer> internal = new ArrayList<>(outer.get(j));

                // add current number
                internal.add(arr[i]);

                // add new subset
                outer.add(internal);
            }
        }

        return outer;
    }
}