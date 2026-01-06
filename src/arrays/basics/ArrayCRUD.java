package arrays.basics;

public class ArrayCRUD {

    /**
     * INSERT operation
     * Adds a value at the end of the array (logical insertion)
     */
    static int insert(int[] arr, int size, int value) {
        // Check if array is already full
        if (size == arr.length) {
            System.out.println("Array is full. Cannot insert.");
            return size;
        }

        // Insert value at the next free index
        arr[size] = value;

        // Return increased size
        return size + 1;
    }

    /**
     * UPDATE operation
     * Updates the value at a given index
     */
    static void update(int[] arr, int size, int index, int newValue) {
        // Validate index
        if (index < 0 || index >= size) {
            System.out.println("Invalid index. Update failed.");
            return;
        }

        // Update value at the given index
        arr[index] = newValue;
    }

    /**
     * DELETE operation (Logical delete)
     * Removes an element by shifting elements to the left
     */
    static int delete(int[] arr, int size, int index) {
        // Validate index
        if (index < 0 || index >= size) {
            System.out.println("Invalid index. Delete failed.");
            return size;
        }

        // Shift elements to the left
        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }

        // Reduce logical size
        return size - 1;
    }

    public static void main(String[] args) {

        // Fixed-size array (capacity = 5)
        int[] arr = new int[5];

        // Logical size (number of elements currently stored)
        int size = 0;

        // CREATE
        size = insert(arr, size, 10);
        size = insert(arr, size, 20);
        size = insert(arr, size, 30);

        // UPDATE (change element at index 2)
        update(arr, size, 2, 99);

        // DELETE (remove element at index 1)
        size = delete(arr, size, 1);

        // READ (print all valid elements)
        System.out.println("Final array elements:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
