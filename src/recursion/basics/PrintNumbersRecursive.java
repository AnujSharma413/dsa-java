package recursion.basics;

/**
 * PURPOSE:
 * Print numbers from 1 to 5 using recursion.
 *
 * IMPORTANT NOTES:
 * 1. Every recursive function must have:
 *    - Base Condition (to stop recursion)
 *    - Recursive Call (to move towards base condition)
 *
 * 2. If base condition is missing → StackOverflowError
 *
 * 3. This is an example of TAIL RECURSION
 *    because recursive call is the last statement.
 */
public class PrintNumbersRecursive {

    static void print(int num) {

        // Base Condition
        if (num == 5) {
            System.out.println(num);
            return;
        }

        System.out.println(num);

        // Recursive Call
        // Function calls itself with updated value
        print(num + 1);
    }

    public static void main(String[] args) {
        print(1);
    }
}
