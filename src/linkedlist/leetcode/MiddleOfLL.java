package linkedlist.leetcode;

/*
    Problem: Find Middle of Linked List

    Approach:
    - Use two pointers:
        slow → moves 1 step
        fast → moves 2 steps

    - When fast reaches end,
      slow will be at middle

    Note:
    - For even length → returns second middle

    Time Complexity: O(n)
    Space Complexity: O(1)
*/

public class MiddleOfLL {

    static ListNode middleNode(ListNode head){

        // slow pointer
        ListNode s = head;

        // fast pointer
        ListNode f = head;

        // traverse list
        while(f != null && f.next != null){

            s = s.next;           // move 1 step
            f = f.next.next;      // move 2 steps
        }

        // slow is at middle
        return s;
    }

    /*
        Definition for singly-linked list
    */
    static class ListNode {
        int val;
        ListNode next;

        ListNode(){}

        ListNode(int val){
            this.val = val;
        }

        ListNode(int val, ListNode next){
            this.val = val;
            this.next = next;
        }
    }
}