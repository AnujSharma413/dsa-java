package stacksqueues.dynamicqueue;

/*
 * Dynamic Circular Queue
 * - Resizes when full
 */

import stacksqueues.circular.CircularQueue;

public class DynamicQueue extends CircularQueue {

    public DynamicQueue() {
        super();
    }

    public DynamicQueue(int size) {
        super(size);
    }

    @Override
    public boolean insert(int item) {

        // Resize if full
        if (this.isFull()) {

            int[] temp = new int[data.length * 2];

            // Copy in correct order
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[(front + i) % data.length];
            }

            front = 0;
            end = data.length;
            data = temp;
        }

        return super.insert(item);
    }
}