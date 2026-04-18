package dsa_sheet_problems.maths;

/**
 * Problem: Count the number of digits in an integer.
 * Logic: Repeatedly divide the number by 10 until it becomes 0.
 * Time Complexity: O(log10(N))
 */
public class CountDigits {

    /**
     * Counts digits by stripping the last digit in each iteration.
     * Note: This returns 0 if the input is 0.
     * To return 1 for input 0, use: if(num == 0) return 1;
     */
    public static int countDigits(int num) {
        int count = 0;

        // Loop runs until the number is reduced to 0
        while (num != 0) {
            // Shifting the number right by one digit (num / 10)
            num = num / 10;
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        int num = 9999;
        System.out.println("Number of digits in " + num + " is: " + countDigits(num));

        // Testing with a negative number
        int negNum = -12345;
        System.out.println("Number of digits in " + negNum + " is: " + countDigits(negNum));
    }
}