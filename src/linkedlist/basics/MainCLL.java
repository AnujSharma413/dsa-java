package linkedlist.basics;

/*
    Driver Class for Circular Linked List

    Purpose:
    This class is used to test the operations
    implemented in the CLL class.

    Operations tested:
    1. Insert
    2. Delete
    3. Display
*/

public class MainCLL {

    public static void main(String[] args) {

        // Creating object of Circular Linked List
        CLL list = new CLL();

        // inserting elements
        list.insert(8);
        list.insert(9);
        list.insert(2);
        list.insert(7);

        // displaying list
        System.out.println("Initial Circular Linked List:");
        list.display();

        // deleting element
        System.out.println("\nDeleting element 9:");
        list.delete(9);

        // displaying list again
        list.display();
    }
}