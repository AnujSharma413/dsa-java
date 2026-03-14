package linkedlist.basics;

/*
    Driver class to test Linked List operations
*/

public class Main {

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

        // display list
        list.display();

        // delete first node
        System.out.println(list.deleteFirst());

        list.display();

        // delete last node
        System.out.println(list.deleteLast());

        list.display();

        // delete node at index
        System.out.println(list.delete(2));

        list.display();
    }
}