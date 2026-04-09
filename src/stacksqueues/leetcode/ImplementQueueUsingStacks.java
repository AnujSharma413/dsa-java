package stacksqueues.leetcode;

import java.util.Stack;

/*
 * Problem: Implement Queue using Stacks
 * Source: LeetCode 232
 *
 * Goal:
 * Implement FIFO Queue using two LIFO stacks
 *
 * Approach: Amortized O(1)
 * ----------------------------------------
 * We use two stacks:
 * 1. in  → for insertion (push operation)
 * 2. out → for removal/peek operations
 *
 * Key Idea:
 * - Push always goes to 'in'
 * - Pop/Peek comes from 'out'
 * - If 'out' is empty → transfer all elements from 'in' to 'out'
 *
 * Why this works:
 * - Reverses order once → gives FIFO behavior
 * - Each element moves at most once → O(1) amortized
 */

public class ImplementQueueUsingStacks {

    private Stack<Integer> in;   // stack for input
    private Stack<Integer> out;  // stack for output

    // Constructor
    public ImplementQueueUsingStacks() {
        in = new Stack<>();
        out = new Stack<>();
    }

    /*
     * PUSH → Insert element at back of queue
     * Time Complexity: O(1)
     */
    public void push(int x) {
        in.push(x);
    }

    /*
     * POP → Remove element from front of queue
     * Time Complexity: Amortized O(1)
     *
     * If 'out' is empty:
     * - Transfer all elements from 'in' → 'out'
     * - This reverses order
     */
    public int pop() {

        if (out.isEmpty()) {
            while (!in.isEmpty()) {
                out.push(in.pop());
            }
        }

        return out.pop();
    }

    /*
     * PEEK → Get front element without removing
     * Time Complexity: Amortized O(1)
     */
    public int peek() {

        if (out.isEmpty()) {
            while (!in.isEmpty()) {
                out.push(in.pop());
            }
        }

        return out.peek();
    }

    /*
     * EMPTY → Check if queue is empty
     * Time Complexity: O(1)
     */
    public boolean empty() {
        return in.isEmpty() && out.isEmpty();
    }
}

/*
 * Example Usage (LeetCode format):
 *
 * ImplementQueueUsingStacks obj = new ImplementQueueUsingStacks();
 * obj.push(1);
 * obj.push(2);
 * int a = obj.peek();  // returns 1
 * int b = obj.pop();   // returns 1
 * boolean c = obj.empty(); // false
 */