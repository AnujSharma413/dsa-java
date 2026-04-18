package dsa_sheet_problems.recursion;

/**
 * Problem: Print "GFG" N times using recursion.
 * Link: https://www.geeksforgeeks.org/problems/print-gfg-n-times/1
 * * Logic:
 * 1. Base Case: If N == 0, stop the recursion (return).
 * 2. Action: Print "GFG ".
 * 3. Recursive Step: Call printGfg(N - 1) to solve the smaller sub-problem.
 * * Time Complexity: O(N)
 * Space Complexity: O(N) (due to the recursive call stack)
 */
public class PrintNTimes {

    public static void printGfg(int N) {
        // Base case: This prevents infinite recursion
        if (N == 0) {
            return;
        }

        // Action: Print the string
        System.out.print("GFG ");

        // Recursive call: reduce N by 1
        printGfg(N - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Printing GFG " + n + " times:");
        printGfg(n);
    }
}