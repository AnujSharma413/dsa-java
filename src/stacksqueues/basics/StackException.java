package stacksqueues.basics;

/*
 * Custom Exception for Stack operations
 * - Used to handle invalid operations like:
 *   - pop from empty stack
 *   - peek from empty stack
 */

public class StackException extends Exception {

    public StackException(String message) {
        super(message); // pass message to Exception class
    }
}