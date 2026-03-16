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

        Node node = new Node(val);

        node.next = head;

        head = node;

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

        if(tail == null){
            insertFirst(val);
            return;
        }

        Node node = new Node(val);

        tail.next = node;

        tail = node;

        size++;
    }

    /*
        Insert element at specific index
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

        Node temp = head;

        for(int i = 1; i < index; i++){
            temp = temp.next;
        }

        Node newNode = new Node(val,temp.next);

        temp.next = newNode;

        size++;
    }

    /*
        Insert using recursion

        Example:
        List: 17 -> 8 -> 2 -> 3 -> 100 -> 99
        insertRec(22,2)

        Result:
        17 -> 8 -> 22 -> 2 -> 3 -> 100 -> 99
     */

    public void insertRec(int val, int index){
        head = insertRec(val,index,head);
    }

    private Node insertRec(int val,int index,Node node){

        if(index == 0){
            Node temp = new Node(val,node);
            size++;
            return temp;
        }

        node.next = insertRec(val,index-1,node.next);

        return node;
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

        while(temp != null){

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