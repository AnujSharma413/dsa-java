package dsa_sheet_problems.stackqueues.medium;

import java.util.Stack;

/*
 * Problem: Valid Parentheses
 * LeetCode: 20
 * Difficulty: Easy
 *
 * Approach:
 * 1. Push all opening brackets onto the stack.
 * 2. For every closing bracket:
 *    - Check if stack is empty.
 *    - Check if top element matches corresponding opening bracket.
 * 3. At the end, stack should be empty.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

public class ValidParentheses {

    public static boolean isValid(String s) {

        // Stack to store opening brackets
        Stack<Character> stack = new Stack<>();

        // Traverse through each character
        for (char ch : s.toCharArray()) {

            // Push opening brackets
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {

                // Handle closing parenthesis ')'
                if (ch == ')') {
                    if (stack.isEmpty() || stack.pop() != '(') {
                        return false;
                    }
                }

                // Handle closing square bracket ']'
                if (ch == ']') {
                    if (stack.isEmpty() || stack.pop() != '[') {
                        return false;
                    }
                }

                // Handle closing curly brace '}'
                if (ch == '}') {
                    if (stack.isEmpty() || stack.pop() != '{') {
                        return false;
                    }
                }
            }
        }

        // Stack should be empty if all brackets matched
        return stack.isEmpty();
    }

    public static void main(String[] args) {

        String s = "([{])";

        System.out.println("Is Valid? " + isValid(s));
    }
}