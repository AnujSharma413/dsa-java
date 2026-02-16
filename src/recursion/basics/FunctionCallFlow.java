package recursion.basics;

/**
 * PURPOSE:
 * This class is NOT recursion.
 * It is used to understand how function calls work
 * and how stack grows when one function calls another.
 *
 * Key Idea:
 * - Each function waits until the function it called finishes.
 * - Stack works in LIFO (Last In First Out).
 */
public class FunctionCallFlow {

    static void print1(int num) {
        System.out.println(num);
        print2(num + 1);   // waits until print2 finishes
    }

    static void print2(int num) {
        System.out.println(num);
        print3(num + 1);   // waits until print3 finishes
    }

    static void print3(int num) {
        System.out.println(num);
        print4(num + 1);
    }

    static void print4(int num) {
        System.out.println(num);
        print5(num + 1);
    }

    static void print5(int num) {
        System.out.println(num); // last call, stack starts clearing
    }

    public static void main(String[] args) {
        print1(1);
    }
}
