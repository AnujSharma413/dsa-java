package stacksqueues.queue.usingstack;

import java.util.Stack;

/*
 * Queue using Stack (Remove Costly Approach)
 * - Insert: O(1)
 * - Remove: O(n)
 */

public class QueueUsingStack {

    private Stack<Integer> first;
    private Stack<Integer> second;

    public QueueUsingStack() {
        first = new Stack<>();
        second = new Stack<>();
    }

    // Insert element (fast)
    public void add(int item) {
        first.push(item);
    }

    // Remove element (costly)
    public int remove() throws Exception {

        if (first.isEmpty()) {
            throw new Exception("Queue is empty");
        }

        // Move all elements to second stack
        while (!first.isEmpty()) {
            second.push(first.pop());
        }

        // Remove front element
        int removed = second.pop();

        // Move elements back
        while (!second.isEmpty()) {
            first.push(second.pop());
        }

        return removed;
    }

    public int peek() throws Exception {

        if (first.isEmpty()) {
            throw new Exception("Queue is empty");
        }

        while (!first.isEmpty()) {
            second.push(first.pop());
        }

        int peeked = second.peek();

        while (!second.isEmpty()) {
            first.push(second.pop());
        }

        return peeked;
    }

    public boolean isEmpty() {
        return first.isEmpty();
    }
}