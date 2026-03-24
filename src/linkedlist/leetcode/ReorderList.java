package linkedlist.leetcode;

/*
    Problem: Reorder List

    Reorder:
    L0 → Ln → L1 → Ln-1 → L2 → Ln-2 ...

    Approach:
    1. Find middle
    2. Reverse second half
    3. Merge both halves alternately

    Time Complexity: O(n)
    Space Complexity: O(1)
*/

public class ReorderList {

    public void reorderList(ListNode head) {

        if(head == null || head.next == null){
            return;
        }

        // step 1: find middle
        ListNode mid = getMid(head);

        // step 2: reverse second half
        ListNode second = reverseList(mid.next);

        // break the list
        mid.next = null;

        ListNode first = head;

        // step 3: merge alternately
        while(second != null){

            ListNode temp1 = first.next;
            ListNode temp2 = second.next;

            first.next = second;
            second.next = temp1;

            first = temp1;
            second = temp2;
        }
    }

    /*
        Find middle using slow-fast
    */
    public ListNode getMid(ListNode head){

        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    /*
        Reverse linked list
    */
    public ListNode reverseList(ListNode head){

        ListNode prev = null;
        ListNode curr = head;

        while(curr != null){

            ListNode next = curr.next;

            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    /*
        Node definition
    */
    public class ListNode {
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