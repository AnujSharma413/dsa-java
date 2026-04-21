package dsa_sheet_problems.hashing;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

/**
 * Problem: Count the frequency of elements in an array.
 * Link: https://www.geeksforgeeks.org/problems/frequency-of-elements--111353/1
 * * Logic:
 * 1. Use a TreeMap to store element frequencies (TreeMap keeps keys sorted).
 * 2. Traverse the array and update the count in the map using getOrDefault.
 * 3. Convert the Map entries into a nested ArrayList for the final output.
 * * Time Complexity: O(N log K) where N is array size and K is unique elements (due to TreeMap).
 * Space Complexity: O(K) to store the frequencies.
 */
public class FrequencyOfElements {

    public static ArrayList<ArrayList<Integer>> countFreq(int[] arr) {
        // Map to store: Key -> Element, Value -> Frequency
        Map<Integer, Integer> map = new TreeMap<>();

        for (int x : arr) {
            // If x exists, increment count; else start at 0 and add 1
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        // Converting the Map into the required ArrayList<ArrayList<Integer>> format
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            ArrayList<Integer> pair = new ArrayList<>();
            pair.add(entry.getKey());
            pair.add(entry.getValue());
            ans.add(pair);
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 4, 4, 4, 5};

        System.out.println("Element Frequencies (Sorted):");
        System.out.println(countFreq(arr));
    }
}