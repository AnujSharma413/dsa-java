package strings.basics;

/**
 * Problem:
 * Find the second largest digit present in a given string.
 *
 * Notes:
 * - The string may contain alphabets and digits
 * - Only numeric characters ('0' to '9') are considered
 * - If the second largest digit does not exist, return -1
 *
 * Idea:
 * - Traverse the string character by character
 * - Track the largest and second largest digits seen so far
 * - Characters are digits, so comparison happens using ASCII values
 * - Convert final character digit to integer using ('digit' - '0')
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Related Problem:
 * - LeetCode 1796: Second Largest Digit in a String
 */
public class SecondLargestDigitInString {

    static int secondLargestDigitInString(String s) {

        // stores ASCII value of largest digit character
        int largest = -1;

        // stores ASCII value of second largest digit character
        int secondLargest = -1;

        // traverse each character in the string
        for (char ch : s.toCharArray()) {

            // process only digit characters
            if (Character.isDigit(ch)) {

                if (ch > largest) {
                    secondLargest = largest;
                    largest = ch;
                }
                else if (ch != largest && ch > secondLargest) {
                    secondLargest = ch;
                }
            }
        }

        // if second largest digit doesn't exist, return -1
        // else convert digit character to integer
        return secondLargest == -1 ? -1 : secondLargest - '0';
    }

    public static void main(String[] args) {
        String str = "dfa12321afd";
        System.out.println(secondLargestDigitInString(str));
    }
}
