package linkedlist.basics;

/*
    Driver class to test Doubly Linked List operations
*/

public class MainDLL {

    public static void main(String[] args) {

        DLL list = new DLL();

        // inserting at beginning
        list.insertFirst(3);
        list.insertFirst(5);
        list.insertFirst(7);
        list.insertFirst(8);

        // inserting at end
        list.insertLastWithTail(22);

        // inserting after element
        list.insert(7,65);

        System.out.println("Initial DLL:");
        list.display();

        System.out.println("\nDeleted First Node: " + list.deleteFirst());
        list.display();

        System.out.println("\nDeleted Last Node: " + list.deleteLast());
        list.display();

        System.out.println("\nDeleted Node at Index 2: " + list.delete(2));
        list.display();
    }
}