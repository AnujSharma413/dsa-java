package patternsprinting.triangle;

import java.util.Scanner;

/**
 * Triangle Pattern Programs in Java
 *
 * Concepts Covered:
 * 1. Increasing Star Triangle
 * 2. Increasing Number Triangle
 * 3. Increasing Alphabet Triangle
 * 4. Row Number Triangle
 * 5. Row Alphabet Triangle
 * 6. Continuous Number Triangle
 * 7. Continuous Alphabet Triangle
 * 8. Inverted Star Triangle
 * 9. Inverted Number Triangle
 * 10. Inverted Alphabet Triangle
 */
public class TrianglePatterns {

    /*
     * Pattern 1
     * *
     * * *
     * * * *
     * * * * *
     * * * * * *
     */
    static void pattern1(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /*
     * Pattern 2
     * 1
     * 1 2
     * 1 2 3
     * 1 2 3 4
     * 1 2 3 4 5
     */
    static void pattern2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    /*
     * Pattern 3
     * A
     * A B
     * A B C
     * A B C D
     * A B C D E
     */
    static void pattern3(int n) {
        for (int i = 1; i <= n; i++) {
            char ch = 'A';

            for (int j = 1; j <= i; j++) {
                System.out.print(ch + " ");
                ch++;
            }

            System.out.println();
        }
    }

    /*
     * Pattern 4
     * 1
     * 2 2
     * 3 3 3
     * 4 4 4 4
     * 5 5 5 5 5
     */
    static void pattern4(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    /*
     * Pattern 5
     * A
     * B B
     * C C C
     * D D D D
     * E E E E E
     */
    static void pattern5(int n) {
        char ch = 'A';

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch + " ");
            }

            ch++;
            System.out.println();
        }
    }

    /*
     * Pattern 6
     * 1
     * 2 3
     * 4 5 6
     * 7 8 9 10
     * 11 12 13 14 15
     */
    static void pattern6(int n) {
        int x = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(x + " ");
                x++;
            }

            System.out.println();
        }
    }

    /*
     * Pattern 7
     * A
     * B C
     * D E F
     * G H I J
     * K L M N O
     */
    static void pattern7(int n) {
        char ch = 'A';

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch + " ");
                ch++;
            }

            System.out.println();
        }
    }

    /*
     * Pattern 8
     * * * * *
     * * * *
     * * *
     * *
     * *
     */
    static void pattern8(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    /*
     * Pattern 9
     * 1 2 3 4 5
     * 1 2 3 4
     * 1 2 3
     * 1 2
     * 1
     */
    static void pattern9(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }

    /*
     * Pattern 10
     * A B C D E
     * A B C D
     * A B C
     * A B
     * A
     */
    static void pattern10(int n) {
        for (int i = 1; i <= n; i++) {
            char ch = 'A';

            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(ch + " ");
                ch++;
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of n: ");
        int n = sc.nextInt();

        pattern1(n);
        System.out.println();

        pattern2(n);
        System.out.println();

        pattern3(n);
        System.out.println();

        pattern4(n);
        System.out.println();

        pattern5(n);
        System.out.println();

        pattern6(n);
        System.out.println();

        pattern7(n);
        System.out.println();

        pattern8(n);
        System.out.println();

        pattern9(n);
        System.out.println();

        pattern10(n);

        sc.close();
    }
}