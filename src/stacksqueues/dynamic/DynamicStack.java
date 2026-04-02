package stacksqueues.dynamic;

/*
 * Dynamic Stack
 * - Extends CustomStack
 * - Automatically resizes when full
 */

import stacksqueues.basics.CustomStack;

public class DynamicStack extends CustomStack {

    public DynamicStack() {
        super();
    }

    public DynamicStack(int size) {
        super(size);
    }

    @Override
    public boolean push(int item) {

        // If stack is full → resize
        if (isFull()) {

            // Create new array double the size
            int[] temp = new int[data.length * 2];

            // Copy old elements
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }

            // Assign new array
            data = temp;
        }

        // Insert using parent method
        return super.push(item);
    }
}