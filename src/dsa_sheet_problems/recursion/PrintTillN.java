package dsa_sheet_problems.recursion;

/**
 * Problem: Print 1 to N using recursion (no loops).
 * Link: https://www.geeksforgeeks.org/problems/print-1-to-n-without-using-loops3621/1
 * * Logic:
 * 1. Base Case: If N == 0, return.
 * 2. Recursive Step: Call printTillN(N - 1) first.
 * 3. Action: Print N only after the recursive call returns (stack unwinding).
 * * Time Complexity: O(N)
 * Space Complexity: O(N) (due to call stack space)
 */
public class PrintTillN {

    public static void printTillN(int N) {
        // Base case: Stop recursion when N is 0
        if (N == 0) {
            return;
        }

        // Recursive call first: Go all the way down to N=1
        printTillN(N - 1);

        // Print happens as the stack "unwinds" from 1 back up to N
        System.out.print(N + " ");
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Printing numbers 1 to " + n + ":");
        printTillN(n);
    }
}