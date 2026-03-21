package linkedlist.leetcode;

/*
    Problem: Reverse a Singly Linked List

    Approach:
    - Use 3 pointers:
        prev → previous node
        pres → current node
        next → next node

    - Reverse link one by one

    Time Complexity: O(n)
    Space Complexity: O(1)
*/

public class ReverseLinkedList {

    public ListNode reverseList(ListNode head) {

        // previous node
        ListNode prev = null;

        // current node
        ListNode pres = head;

        // traverse list
        while(pres != null){

            // store next node
            ListNode next = pres.next;

            // reverse link
            pres.next = prev;

            // move prev forward
            prev = pres;

            // move current forward
            pres = next;
        }

        // new head
        return prev;
    }

    /*
        Node definition
    */
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {}

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}