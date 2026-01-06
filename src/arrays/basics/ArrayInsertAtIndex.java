package arrays.basics;

import java.util.Arrays;

public class ArrayInsertAtIndex {

    // insert value at a given index in array
    static int insertAtIndex(int[] arr, int size, int index, int value) {

        // if array is already full, cannot insert
        if (size == arr.length) {
            System.out.println("Array is full");
            return size;
        }

        // index should be between 0 and size
        // index == size means insert at end
        if (index < 0 || index > size) {
            System.out.println("Invalid index");
            return size;
        }

        // shift elements to the right
        // start from last used element
        for (int i = size - 1; i >= index; i--) {
            arr[i + 1] = arr[i];
        }

        // place the value at required index
        arr[index] = value;

        // increase logical size
        return size + 1;
    }

    public static void main(String[] args) {

        int[] arr = new int[5]; // fixed size array
        int size = 0;           // logical size

        // initial elements
        arr[size++] = 10;
        arr[size++] = 20;
        arr[size++] = 30;

        // insert in middle
        size = insertAtIndex(arr, size, 1, 99);

        // insert at beginning
        size = insertAtIndex(arr, size, 0, 77);

        // try inserting at end (works only if space is available)
        size = insertAtIndex(arr, size, size, 55);

        // print full array (including unused places)
        System.out.println(Arrays.toString(arr));
    }
}

