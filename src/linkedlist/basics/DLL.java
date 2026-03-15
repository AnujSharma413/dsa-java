package linkedlist.basics;

/*
    Doubly Linked List Implementation

    Each node contains:
    1. value
    2. reference to next node
    3. reference to previous node

    Structure:

    null ← prev | value | next → null

    head → first node
    tail → last node

    Advantage over singly LL:
    • bidirectional traversal
    • easier deletion

    Learned from Kunal Kushwaha DSA Series
*/

public class DLL {

    private Node head;
    private Node tail;
    private int size;

    public DLL(){
        this.size = 0;
    }

    /*
        Insert node at beginning
        Time Complexity: O(1)
    */
    public void insertFirst(int val){

        Node node = new Node(val);

        node.next = head;
        node.prev = null;

        if(head != null){
            head.prev = node;
        }

        head = node;

        if(tail == null){
            tail = head;
        }

        size++;
    }

    /*
        Insert node at end using tail pointer
        Time Complexity: O(1)
    */
    public void insertLastWithTail(int val){

        if(head == null){
            insertFirst(val);
            return;
        }

        Node node = new Node(val);

        node.prev = tail;
        node.next = null;

        tail.next = node;

        tail = node;

        size++;
    }

    /*
        Insert node at end without using tail
        Time Complexity: O(n)
    */
    public void insertLastWithoutTail(int val){

        Node node = new Node(val);

        if(head == null){
            insertFirst(val);
            return;
        }

        Node temp = head;

        while(temp.next != null){
            temp = temp.next;
        }

        temp.next = node;
        node.prev = temp;

        tail = node;

        size++;
    }

    /*
        Insert value after a specific element
    */
    public void insert(int after,int val){

        Node p = find(after);

        if(p == null){
            System.out.println("Value does not exist");
            return;
        }

        Node node = new Node(val);

        node.next = p.next;
        node.prev = p;

        p.next = node;

        if(node.next != null){
            node.next.prev = node;
        }else{
            tail = node;
        }

        size++;
    }

    /*
        Find node by value
    */
    public Node find(int value){

        Node temp = head;

        while(temp != null){

            if(temp.value == value){
                return temp;
            }

            temp = temp.next;
        }

        return null;
    }

    /*
        Delete first node
    */
    public int deleteFirst(){

        if(head == null){
            return -1;
        }

        int val = head.value;

        head = head.next;

        if(head != null){
            head.prev = null;
        }else{
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

        int val = tail.value;

        tail = tail.prev;
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
        Node target = prev.next;

        int val = target.value;

        prev.next = target.next;

        if(target.next != null){
            target.next.prev = prev;
        }

        size--;

        return val;
    }

    /*
        Return node at index
    */
    public Node get(int index){

        Node temp = head;

        for(int i = 0; i < index; i++){
            temp = temp.next;
        }

        return temp;
    }

    /*
        Display list forward and backward
    */
    public void display(){

        Node node = head;
        Node last = null;

        while(node != null){

            System.out.print(node.value + " -> ");

            last = node;

            node = node.next;
        }

        System.out.println("END");

        System.out.println("Print in reverse");

        while(last != null){

            System.out.print(last.value + " -> ");

            last = last.prev;
        }

        System.out.println("START");
    }

    /*
        Node class
    */
    private class Node{

        private int value;
        private Node next;
        private Node prev;

        public Node(int value){
            this.value = value;
        }

        public Node(int value, Node next, Node prev){
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
}