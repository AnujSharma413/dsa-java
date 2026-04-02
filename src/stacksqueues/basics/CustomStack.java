package stacksqueues.basics;

/*
 * Custom Stack Implementation using Array
 * - Follows LIFO (Last In First Out)
 * - Uses pointer (ptr) to track top element
 */

public class CustomStack {

    protected int[] data; // array to store elements
    private static final int DEFAULT_SIZE = 10;

    private int ptr = -1; // pointer to top (-1 means empty)

    // Default constructor → size = 10
    public CustomStack() {
        this(DEFAULT_SIZE); // constructor chaining
    }

    // Parameterized constructor
    public CustomStack(int size) {
        this.data = new int[size];
    }

    // PUSH → insert element at top
    public boolean push(int item) {
        if (isFull()) {
            System.out.println("Stack is full!!");
            return false;
        }
        data[++ptr] = item; // increment pointer then insert
        return true;
    }

    // POP → remove and return top element
    public int pop() throws StackException {
        if (isEmpty()) {
            throw new StackException("Cannot pop from empty stack");
        }
        return data[ptr--]; // return then decrement pointer
    }

    // PEEK → return top element without removing
    public int peek() throws StackException {
        if (isEmpty()) {
            throw new StackException("Stack is empty");
        }
        return data[ptr];
    }

    // Check if stack is full
    public boolean isFull() {
        return ptr == data.length - 1;
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return ptr == -1;
    }
}