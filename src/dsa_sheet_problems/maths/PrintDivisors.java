package dsa_sheet_problems.maths;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Problem: Print all divisors of a number in ascending order.
 * Optimization: Loop runs up to sqrt(n) to achieve O(sqrt(n)) time complexity.
 * Sorting: Results are stored in a list and sorted to meet output requirements.
 */
public class PrintDivisors {

    public static void printDivisors(int n) {
        ArrayList<Integer> list = new ArrayList<>();

        // Iterate up to the square root of n
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                // Add the divisor
                list.add(i);

                // Add the paired divisor (n/i) if it's not the same as i
                // Example: for n=36 and i=6, we only add 6 once.
                if (i != n / i) {
                    list.add(n / i);
                }
            }
        }

        // Sort the list to ensure ascending order for the judge
        Collections.sort(list);

        // Print all stored divisors
        for (int num : list) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        int n = 20;
        System.out.println("Divisors of " + n + ":");
        printDivisors(n);
    }
}