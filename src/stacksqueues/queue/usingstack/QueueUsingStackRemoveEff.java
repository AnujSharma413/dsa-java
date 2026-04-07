package stacksqueues.queue.usingstack;

import java.util.Stack;

/*
 * Queue using Stack (Remove Efficient Approach)
 * - Insert: O(n)
 * - Remove: O(1)
 */

public class QueueUsingStackRemoveEff {

    private Stack<Integer> first;
    private Stack<Integer> second;

    public QueueUsingStackRemoveEff() {
        first = new Stack<>();
        second = new Stack<>();
    }

    // Insert (costly)
    public void add(int item) {

        // Move all elements to second stack
        while (!first.isEmpty()) {
            second.push(first.pop());
        }

        // Insert new element
        first.push(item);

        // Move back
        while (!second.isEmpty()) {
            first.push(second.pop());
        }
    }

    // Remove (fast)
    public int remove() throws Exception {
        if (first.isEmpty()) {
            throw new Exception("Queue is empty");
        }
        return first.pop();
    }

    public int peek() throws Exception {
        if (first.isEmpty()) {
            throw new Exception("Queue is empty");
        }
        return first.peek();
    }

    public boolean isEmpty() {
        return first.isEmpty();
    }
}