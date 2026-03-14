package linkedlist.basics;

/*
    Implementation of a Singly Linked List.

    Each node contains:
    1. value (data)
    2. reference to next node

    Structure:
    head → first node
    tail → last node
    size → number of nodes

    Learned from Kunal Kushwaha DSA Series
*/

public class LL {

    // Points to first node
    private Node head;

    // Points to last node
    private Node tail;

    // Stores number of elements in list
    private int size;

    // Constructor initializes empty list
    public LL(){
        this.size = 0;
    }

    /*
        Insert element at beginning
        Time Complexity: O(1)
     */
    public void insertFirst(int val){

        // create new node
        Node node = new Node(val);

        // new node points to current head
        node.next = head;

        // move head to new node
        head = node;

        // if list was empty, tail also points to head
        if(tail == null){
            tail = head;
        }

        size++;
    }

    /*
        Insert element at end
        Time Complexity: O(1)
     */
    public void insertLast(int val){

        // if list is empty, use insertFirst
        if(tail == null){
            insertFirst(val);
            return;
        }

        Node node = new Node(val);

        // attach new node after tail
        tail.next = node;

        // move tail to new node
        tail = node;

        size++;
    }

    /*
        Insert element at specific index
        Example:
        10 -> 20 -> 30

        insert(15,1)

        Result:
        10 -> 15 -> 20 -> 30
     */
    public void insert(int val,int index){

        if(index == 0){
            insertFirst(val);
            return;
        }

        if(index == size){
            insertLast(val);
            return;
        }

        // traverse to node before index
        Node temp = head;

        for(int i = 1; i < index; i++){
            temp = temp.next;
        }

        // create node and link it
        Node newNode = new Node(val,temp.next);

        temp.next = newNode;

        size++;
    }

    /*
        Delete first node
        Example:
        10 -> 20 -> 30

        becomes

        20 -> 30
     */
    public int deleteFirst(){

        if(head == null){
            return -1;
        }

        int val = head.value;

        // move head forward
        head = head.next;

        // if list becomes empty
        if(head == null){
            tail = null;
        }

        size--;

        return val;
    }

    /*
        Delete last node
     */
    public int deleteLast(){

        if(size <= 1){
            return deleteFirst();
        }

        // get second last node
        Node secondLast = get(size-2);

        int val = tail.value;

        tail = secondLast;

        tail.next = null;

        size--;

        return val;
    }

    /*
        Delete node at given index
     */
    public int delete(int index){

        if(index == 0){
            return deleteFirst();
        }

        if(index == size-1){
            return deleteLast();
        }

        Node prev = get(index-1);

        int val = prev.next.value;

        // skip the node
        prev.next = prev.next.next;

        size--;

        return val;
    }

    /*
        Returns node reference at given index
     */
    public Node get(int index){

        Node temp = head;

        for(int i = 0; i < index; i++){
            temp = temp.next;
        }

        return temp;
    }

    /*
        Search node by value
     */
    public Node findTheNode(int value){

        Node node = head;

        while(node != null){

            if(node.value == value){
                return node;
            }

            node = node.next;
        }

        return null;
    }

    /*
        Traverse and print list
     */
    public void display(){

        Node temp = head;

        while(temp != null) {

            System.out.print(temp.value + " -> ");

            temp = temp.next;
        }

        System.out.println("END");
    }

    /*
        Node class represents each element of list
     */
    private class Node{

        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }

        public Node(int value,Node next){
            this.value = value;
            this.next = next;
        }
    }
}