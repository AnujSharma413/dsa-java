package linkedlist.basics;

/*
    Driver class to test Singly Linked List operations
*/

public class MainLL {

    public static void main(String[] args) {

        LL list = new LL();

        // inserting at beginning
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(8);
        list.insertFirst(17);

        // inserting at end
        list.insertLast(99);

        // inserting at index
        list.insert(100,3);

        System.out.println("Initial List:");
        list.display();

        System.out.println("\nDeleted First Node: " + list.deleteFirst());
        list.display();

        System.out.println("\nDeleted Last Node: " + list.deleteLast());
        list.display();

        System.out.println("\nDeleted Node at Index 2: " + list.delete(2));
        list.display();

        // inserting using recursion
        System.out.println("\nInserted Node at index 2 using recursion:");
        list.insertRec(22,2);

        list.display();
    }
}