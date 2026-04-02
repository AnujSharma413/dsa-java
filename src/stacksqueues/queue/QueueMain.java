package stacksqueues.queue;

/*
 * Driver class to test CustomQueue (Linear Queue)
 * - Demonstrates FIFO behavior
 * - Shows insertion, removal, and display operations
 */

public class QueueMain {
    public static void main(String[] args) throws Exception {

        // Create queue with fixed size = 5
        CustomQueue queue = new CustomQueue(5);

        // Insert elements (FIFO order)
        queue.insert(1);
        queue.insert(2);
        queue.insert(3);
        queue.insert(4);
        queue.insert(5);

        // Display queue elements
        // Expected: 1 <- 2 <- 3 <- 4 <- 5 <- END
        queue.display();

        // Remove element (removes front → FIFO)
        System.out.println(queue.remove()); // Expected: 1

        // Display after removal
        // Expected: 2 <- 3 <- 4 <- 5 <- END
        queue.display();
    }
}