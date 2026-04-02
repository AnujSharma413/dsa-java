package stacksqueues.circular;

/*
 * Driver class for CircularQueue
 */

import stacksqueues.circular.CircularQueue;

public class CircularQueueMain {
    public static void main(String[] args) throws Exception {

        CircularQueue queue = new CircularQueue(5);

        queue.insert(8);
        queue.insert(9);
        queue.insert(10);
        queue.insert(12);
        queue.insert(14);


        queue.display();

        System.out.println(queue.remove());

        queue.insert(133);

        queue.display();
    }
}