package arrays.basics;

public class ArrayBasics {

    public static void main(String[] args) {

        /**
         * 1. Array Creation
         * An array is a fixed-size container that stores elements
         * of the same data type in contiguous memory locations.
         */
        int[] arr = new int[5]; // capacity = 5

        /**
         * 2. Logical size
         * Size represents how many elements are actually used.
         * This is NOT the same as arr.length.
         */
        int size = 0;

        /**
         * 3. Adding elements manually
         * Indexing starts from 0 (0-based indexing)
         */
        arr[size++] = 10; // index 0
        arr[size++] = 20; // index 1
        arr[size++] = 30; // index 2

        /**
         * 4. Accessing elements using index
         */
        System.out.println("Element at index 0: " + arr[0]);
        System.out.println("Element at index 1: " + arr[1]);

        /**
         * 5. Traversing array (IMPORTANT)
         * Always loop till 'size', not arr.length
         */
        System.out.println("Array elements:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        /**
         * 6. Array length vs logical size
         */
        System.out.println("Array capacity (length): " + arr.length);
        System.out.println("Logical size (used elements): " + size);

        /**
         * 7. Common mistakes (DO NOT RUN)
         */

        // --> Accessing invalid index
        // System.out.println(arr[5]);

        // --> Looping till arr.length (prints garbage values)
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i] + " ");
        // }
    }
}

