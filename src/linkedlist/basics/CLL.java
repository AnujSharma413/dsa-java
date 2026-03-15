package linkedlist.basics;

/*
    Circular Linked List Implementation

    Properties:
    - Last node points to first node
    - tail.next = head

    Operations:
    1. Insert
    2. Delete
    3. Display
*/

public class CLL {

    // pointer to first node
    private Node head;

    // pointer to last node
    private Node tail;

    // size of list
    private int size;

    // constructor
    public CLL(){
        this.size = 0;
        this.head = null;
        this.tail = null;
    }

    // insert element at end
    public void insert(int val){

        // create new node
        Node node = new Node(val);

        // if list empty
        if(head == null){
            head = node;
            tail = node;

            // circular link
            node.next = head;

            size++;
            return;
        }

        // link last node to new node
        tail.next = node;

        // new node points to head
        node.next = head;

        // update tail
        tail = node;

        size++;
    }

    // delete node by value
    public void delete(int val){

        Node node = head;

        // empty list
        if(node == null){
            return;
        }

        // deleting head node
        if(node.value == val){
            head = head.next;
            tail.next = head;
            return;
        }

        // traverse circular list
        do{

            Node n = node.next;

            // if value found
            if(n.value == val){

                // bypass node
                node.next = n.next;
                break;
            }

            node = node.next;

        }while(node != head);
    }

    // display circular list
    public void display(){

        Node temp = head;

        if(head != null){

            do{
                System.out.print(temp.value + " -> ");
                temp = temp.next;
            }while(temp != head);

        }

        System.out.println("HEAD");
    }

    // node class
    private class Node{

        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }
    }
}