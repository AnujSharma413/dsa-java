package dsa_sheet_problems.hashing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;

/**
 * Hashing Module Overview:
 * 1. HashMap: Key-Value pairs, average O(1) time. No order.
 * 2. HashSet: Stores unique elements only. No duplicates allowed.
 * 3. TreeMap: Stores Key-Value pairs, sorted by Key (O(log N)).
 */
public class HashMapExample {
    public static void main(String[] args) {

        // 1. Understanding HashCodes
        System.out.println("1. Understanding HashCodes:");
        String str = "Kunal";
        System.out.println("HashCode of 'Kunal': " + str.hashCode());
        Integer obj = 45;
        System.out.println("HashCode of 45: " + obj.hashCode());

        // 2. HashMap Example (Key-Value)
        System.out.println("\n2. HashMap (Unordered):");
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Kunal", 90);
        map.put("Anuj", 90);
        map.put("Arun", 33);

        System.out.println("Value for 'Anuj': " + map.get("Anuj"));
        System.out.println("Default value for 'Apoorv': " + map.getOrDefault("Apoorv", 78));
        System.out.println("Contains 'Anuj'? " + map.containsKey("Anuj"));

        // 3. HashSet Example (Unique Elements Only)
        System.out.println("\n3. HashSet (Unique Only):");
        HashSet<Integer> set = new HashSet<>();
        set.add(56);
        set.add(32);
        set.add(55);
        set.add(32); // Duplicate: will be ignored
        set.add(53);
        set.add(22);

        System.out.println("HashSet content: " + set);

        // 4. TreeMap Example (Sorted by Key)
        System.out.println("\n4. TreeMap (Sorted):");
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Zebra", 100);
        treeMap.put("Apple", 50);
        treeMap.put("Banana", 75);

        System.out.println("Sorted TreeMap: " + treeMap);
    }
}