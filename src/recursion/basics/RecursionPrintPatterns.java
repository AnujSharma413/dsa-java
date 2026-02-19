package recursion.basics;

/**
 * PURPOSE:
 * Demonstrates different recursion printing patterns
 * and common recursion pitfalls.
 *
 * Concepts Covered:
 * - Printing before recursive call
 * - Printing after recursive call
 * - Printing both before and after
 * - Infinite recursion due to n-- vs --n
 */
public class RecursionPrintPatterns {

    // Prints numbers from n to 1
    // Work happens BEFORE recursive call
    static void printDescending(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        printDescending(n - 1);
    }

    // Prints numbers from 1 to n
    // Work happens AFTER recursive call
    static void printAscending(int n) {
        if (n == 0) {
            return;
        }
        printAscending(n - 1);
        System.out.println(n);
    }

    // Prints numbers in both directions
    // Demonstrates stack going down and coming up
    static void printBoth(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);     // before recursive call
        printBoth(n - 1);
        System.out.println(n);     // after recursive call
    }

    // Demonstrates n-- vs --n in recursion
    static void recursionConcept(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);

        // Wrong: causes infinite recursion
        // recursionConcept(n--);

        // Correct: value is reduced before passing
        recursionConcept(--n);
    }

    public static void main(String[] args) {
        printDescending(5);
        printAscending(5);
        printBoth(5);
        recursionConcept(5);
    }
}
