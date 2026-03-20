package linkedlist.leetcode;

/*
    Problem: Happy Number

    Definition:
    A number is happy if repeatedly replacing it
    with sum of squares of its digits leads to 1.

    Approach:
    - Treat numbers as nodes in a sequence
    - Use Floyd’s Cycle Detection Algorithm
    - If cycle exists and not 1 → not happy
    - If reaches 1 → happy

    Time Complexity: O(log n)
    Space Complexity: O(1)
*/

public class HappyNumber {

    public static boolean isHappy(int n) {

        int slow = n;
        int fast = n;

        /*
            Using Floyd’s Algorithm:
            slow → 1 step
            fast → 2 steps
        */
        do{
            slow = findSquare(slow);                    // move 1 step
            fast = findSquare(findSquare(fast));        // move 2 steps
        }while(slow != fast);

        // if both meet at 1 → happy number
        return slow == 1;
    }

    /*
        Helper method:
        Returns sum of squares of digits
    */
    static int findSquare(int number){

        int ans = 0;

        while(number > 0){

            int rem = number % 10;     // get last digit
            ans += rem * rem;          // add square
            number /= 10;              // remove last digit
        }

        return ans;
    }

    public static void main(String[] args) {
        int n = 19;
        System.out.println(isHappy(n));
    }
}