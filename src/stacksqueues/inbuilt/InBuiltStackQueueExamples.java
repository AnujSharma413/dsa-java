package stacksqueues;

import java.util.*;

public class InBuiltStackQueueExamples {
    public static void main(String[] args) {

        // STACK (LIFO):

        // Stack is a legacy class (extends Vector → synchronized → slower)
        Stack<Integer> stack = new Stack<>();

        // push() → insert element at top
        stack.push(12);
        stack.push(2);
        stack.push(3);

        // pop() → removes and returns top element
        System.out.println(stack.pop()); // 3

        // peek() → returns top element without removing
        System.out.println(stack.peek()); // 2

        // empty() → checks if stack is empty
        System.out.println(stack.empty()); // false

        // search() → returns 1-based position from top
        // top = position 1
        System.out.println(stack.search(12)); // position of 12 from top


        // QUEUE (FIFO):

        // Using LinkedList as Queue (internally doubly linked list)
        Queue<Integer> queue = new LinkedList<>();

        // add() → inserts element, throws exception if fails
        queue.add(12);

        // offer() → inserts element, returns false if fails (safer)
        queue.offer(1);

        queue.add(11);

        // remove() → removes head, throws exception if empty
        System.out.println(queue.remove()); // 12

        // poll() → removes head, returns null if empty
        System.out.println(queue.poll()); // 1

        // peek() → returns head, null if empty
        System.out.println(queue.peek());

        // element() → returns head, throws exception if empty
        System.out.println(queue.element());


        // DEQUE AS STACK:

        // ArrayDeque → best implementation (faster than Stack)
        Deque<Integer> dq1 = new ArrayDeque<>();

        // push() → acts like stack (insert at front)
        dq1.push(1);
        dq1.push(2);
        dq1.push(3);

        // peek() → top element
        System.out.println(dq1.peek()); // 3

        // pop() → removes top element
        System.out.println(dq1.pop()); // 3


        // DEQUE AS QUEUE:

        Deque<Integer> dq2 = new ArrayDeque<>();

        // add() / offer() → insert at rear
        dq2.add(1);
        dq2.offer(2);
        dq2.add(3);

        // peek() → front element
        System.out.println(dq2.peek()); // 1

        // remove() → removes front (exception if empty)
        System.out.println(dq2.remove()); // 1

        // poll() → removes front (null if empty)
        System.out.println(dq2.poll()); // 2


        // IMPORTANT DIFFERENCES:
        /*
         * STACK vs DEQUE:
         * - Stack is legacy and synchronized (slow)
         * - ArrayDeque is faster and preferred
         *
         * LinkedList vs ArrayDeque:
         * - LinkedList uses nodes → more memory (data + 2 pointers)
         * - ArrayDeque uses circular array → less memory, better cache performance
         *
         * add() vs offer():
         * - add() → throws exception if fails
         * - offer() → returns false (safe)
         *
         * remove() vs poll():
         * - remove() → exception if empty
         * - poll() → returns null
         *
         * element() vs peek():
         * - element() → exception if empty
         * - peek() → returns null
         */
    }
}