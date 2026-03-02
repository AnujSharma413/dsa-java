package recursion.pattern;

/**
 * PURPOSE:
 * Print triangle patterns using RECURSION.
 *
 * This file demonstrates:
 * 1. How recursion can replace nested loops
 * 2. How PRINTING BEFORE recursion vs AFTER recursion
 *    changes the pattern
 *
 * Core Idea:
 * - `row` controls number of rows
 * - `col` controls number of columns in current row
 */
public class Triangle {

    public static void main(String[] args) {

        // Pattern 1
        triangle1(4, 0);

        System.out.println();

        // Pattern 2
        triangle2(4, 0);
    }

    /**
     * Pattern 1:
     * * * *
     * * *
     * *
     * *
     *
     * Printing happens BEFORE recursive call
     * → Work happens during DOWNWARD recursion
     */
    static void triangle1(int row, int col) {

        // Base Condition:
        // All rows printed
        if (row == 0) {
            return;
        }

        // Print stars in current row
        if (col < row) {
            System.out.print("* ");
            triangle1(row, col + 1);
        }
        // Move to next row
        else {
            System.out.println();
            triangle1(row - 1, 0);
        }
    }

    /**
     * Pattern 2:
     * *
     * * *
     * * * *
     * * * * *
     *
     * Printing happens AFTER recursive call
     * → Work happens during BACKTRACKING
     */
    static void triangle2(int row, int col) {

        // Base Condition:
        // All rows printed
        if (row == 0) {
            return;
        }

        if (col < row) {

            // First go deeper
            triangle2(row, col + 1);

            // Print while returning (backtracking)
            System.out.print("* ");
        }
        else {

            // Move to next row
            triangle2(row - 1, 0);
            System.out.println();
        }
    }
}