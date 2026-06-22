package patternsprinting.square;

import java.util.Scanner;

/**
 * Square Patterns in Java
 *
 * Topics Covered:
 * 1. Star Square
 * 2. Constant Number Square
 * 3. Number Sequence Square
 * 4. Alphabet Sequence Square
 * 5. Row Number Square
 * 6. Row Alphabet Square
 * 7. Reverse Row Number Square
 * 8. Reverse Row Alphabet Square
 * 9. Continuous Number Square
 * 10. Continuous Alphabet Square
 * 11. Incremental Number Square
 * 12. Incremental Alphabet Square
 * 13. Reverse Number Sequence Square
 * 14. Reverse Alphabet Sequence Square
 * 15. Multiplication Table Square
 * 16. Binary Checkerboard Pattern
 * 17. Alphabet Checkerboard Pattern
 *
 * Concepts Used:
 * - Nested Loops
 * - Character Arithmetic
 * - Modulus Operator
 * - Pattern Printing
 */
public class SquarePatterns {

    /*
     * Pattern 1
     * * * * *
     * * * * *
     * * * * *
     * * * * *
     * * * * *
     */
    static void pattern1(int rows, int cols) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /*
     * Pattern 2
     * 1 1 1 1 1
     * 1 1 1 1 1
     * 1 1 1 1 1
     * 1 1 1 1 1
     * 1 1 1 1 1
     */
    static void pattern2(int rows, int cols) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                System.out.print("1 ");
            }
            System.out.println();
        }
    }

    /*
     * Pattern 3
     * 1 2 3 4 5
     * 1 2 3 4 5
     * 1 2 3 4 5
     * 1 2 3 4 5
     * 1 2 3 4 5
     */
    static void pattern3(int rows, int cols) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    /*
     * Pattern 4
     * A B C D E
     * A B C D E
     * A B C D E
     * A B C D E
     * A B C D E
     */
    static void pattern4(int rows, int cols) {
        for (int i = 1; i <= rows; i++) {
            char ch = 'A';
            for (int j = 1; j <= cols; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }

    /*
     * Pattern 5
     * 1 1 1 1 1
     * 2 2 2 2 2
     * 3 3 3 3 3
     * 4 4 4 4 4
     * 5 5 5 5 5
     */
    static void pattern5(int rows, int cols) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    /*
     * Pattern 6
     * A A A A A
     * B B B B B
     * C C C C C
     * D D D D D
     * E E E E E
     */
    static void pattern6(int rows, int cols) {
        char ch = 'A';
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                System.out.print(ch + " ");
            }
            ch++;
            System.out.println();
        }
    }

    /*
     * Pattern 7
     * 5 5 5 5 5
     * 4 4 4 4 4
     * 3 3 3 3 3
     * 2 2 2 2 2
     * 1 1 1 1 1
     */
    static void pattern7(int rows, int cols) {
        int copyCols = cols;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                System.out.print(copyCols + " ");
            }
            copyCols--;
            System.out.println();
        }
    }

    /*
     * Pattern 8
     * E E E E E
     * D D D D D
     * C C C C C
     * B B B B B
     * A A A A A
     */
    static void pattern8(int rows, int cols) {
        char ch = (char) ('A' + cols - 1);

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                System.out.print(ch + " ");
            }
            ch--;
            System.out.println();
        }
    }

    /*
     * Pattern 9
     * 1 2 3 4 5
     * 6 7 8 9 10
     * 11 12 13 14 15
     * 16 17 18 19 20
     * 21 22 23 24 25
     */
    static void pattern9(int rows, int cols) {
        int x = 1;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                System.out.print(x + " ");
                x++;
            }
            System.out.println();
        }
    }

    /*
     * Pattern 10
     * A B C D E
     * F G H I J
     * K L M N O
     * P Q R S T
     * U V W X Y
     */
    static void pattern10(int rows, int cols) {
        char ch = 'A';

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }

    /*
     * Pattern 11
     * 1 2 3 4 5
     * 2 3 4 5 6
     * 3 4 5 6 7
     * 4 5 6 7 8
     * 5 6 7 8 9
     */
    static void pattern11(int rows, int cols) {
        int x = 0;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                System.out.print(j + x + " ");
            }
            x++;
            System.out.println();
        }
    }

    /*
     * Pattern 12
     * A B C D E
     * B C D E F
     * C D E F G
     * D E F G H
     * E F G H I
     */
    static void pattern12(int rows, int cols) {
        char ch = 'A';

        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print((char) (ch + j) + " ");
            }
            ch++;
            System.out.println();
        }
    }

    /*
     * Pattern 13
     * 5 4 3 2 1
     * 5 4 3 2 1
     * 5 4 3 2 1
     * 5 4 3 2 1
     * 5 4 3 2 1
     */
    static void pattern13(int rows, int cols) {
        for (int i = 1; i <= rows; i++) {
            int x = cols;

            for (int j = 1; j <= cols; j++) {
                System.out.print(x + " ");
                x--;
            }

            System.out.println();
        }
    }

    /*
     * Pattern 14
     * E D C B A
     * E D C B A
     * E D C B A
     * E D C B A
     * E D C B A
     */
    static void pattern14(int rows, int cols) {
        for (int i = 1; i <= rows; i++) {
            char ch = (char) ('A' + cols - 1);

            for (int j = 1; j <= cols; j++) {
                System.out.print(ch + " ");
                ch--;
            }

            System.out.println();
        }
    }

    /*
     * Pattern 15
     * 1  2  3  4  5
     * 2  4  6  8 10
     * 3  6  9 12 15
     * 4  8 12 16 20
     * 5 10 15 20 25
     *
     * Multiplication Table Pattern
     */
    static void pattern15(int rows, int cols) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                System.out.print(i * j + " ");
            }

            System.out.println();
        }
    }

    /*
     * Pattern 16
     * 1 0 1 0 1
     * 0 1 0 1 0
     * 1 0 1 0 1
     * 0 1 0 1 0
     * 1 0 1 0 1
     *
     * Binary Checkerboard Pattern
     */
    static void pattern16(int rows, int cols) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {

                if ((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }

            }

            System.out.println();
        }
    }

    /*
     * Pattern 17
     * A B A B A
     * B A B A B
     * A B A B A
     * B A B A B
     * A B A B A
     *
     * Alphabet Checkerboard Pattern
     */
    static void pattern17(int rows, int cols) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {

                if ((i + j) % 2 == 0) {
                    System.out.print("A ");
                } else {
                    System.out.print("B ");
                }

            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        pattern1(rows, cols);
        System.out.println();

        pattern2(rows, cols);
        System.out.println();

        pattern3(rows, cols);
        System.out.println();

        pattern4(rows, cols);
        System.out.println();

        pattern5(rows, cols);
        System.out.println();

        pattern6(rows, cols);
        System.out.println();

        pattern7(rows, cols);
        System.out.println();

        pattern8(rows, cols);
        System.out.println();

        pattern9(rows, cols);
        System.out.println();

        pattern10(rows, cols);
        System.out.println();

        pattern11(rows, cols);
        System.out.println();

        pattern12(rows, cols);
        System.out.println();

        pattern13(rows, cols);
        System.out.println();

        pattern14(rows, cols);
        System.out.println();

        pattern15(rows, cols);
        System.out.println();

        pattern16(rows, cols);
        System.out.println();

        pattern17(rows, cols);

        sc.close();
    }
}