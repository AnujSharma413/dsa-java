package dsa_sheet_problems.recursion;

/**
 * Problem: Print N to 1 using recursion.
 * Link: https://www.geeksforgeeks.org/problems/print-n-to-1-without-loop/1
 * * Logic:
 * 1. Base Case: If N == 0, stop (return).
 * 2. Action: Print N immediately.
 * 3. Recursive Step: Call printNos(N - 1) with the decremented value.
 * * Time Complexity: O(N)
 * Space Complexity: O(N) (stack space)
 */
public class PrintNos {

    public static void printNos(int n) {
        // Base case: Stop when we reach 0
        if (n == 0) {
            return;
        }

        // Action: Print the current number
        System.out.print(n + " ");

        // Recursive call: move to the next smaller number
        printNos(n - 1);
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("Printing numbers " + n + " to 1:");
        printNos(n);
    }
}