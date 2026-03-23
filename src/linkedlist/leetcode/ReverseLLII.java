package linkedlist.leetcode;

/*
    Problem: Reverse Linked List II

    Reverse nodes from position left to right

    Approach:
    1. Use dummy node to handle edge cases
    2. Move to (left-1) node
    3. Reverse sublist using 3-pointer technique
    4. Reconnect list

    Time Complexity: O(n)
    Space Complexity: O(1)
*/

public class ReverseLLII {

    public static ListNode reverseBetween(ListNode head, int left, int right) {

        if (head == null || left == right) {
            return head;
        }

        // dummy node
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;

        // move prev to (left-1)
        for (int i = 0; i < left - 1; i++) {
            prev = prev.next;
        }

        // setup pointers
        ListNode current = prev.next;
        ListNode connection = prev; // node before sublist
        ListNode tail = current;    // will become tail

        // reverse sublist
        for (int i = 0; i < right - left + 1; i++) {

            ListNode next = current.next;

            current.next = prev;
            prev = current;
            current = next;
        }

        // reconnect
        connection.next = prev;
        tail.next = current;

        return dummy.next;
    }

    /*
        Node definition
    */
    public static class ListNode {
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