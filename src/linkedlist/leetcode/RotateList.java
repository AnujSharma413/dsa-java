package linkedlist.leetcode;

/*
    Problem: Rotate List

    Rotate list to the right by k places

    Approach:
    1. Find length
    2. Make list circular
    3. Find new tail (length - k % length)
    4. Break cycle

    Time Complexity: O(n)
    Space Complexity: O(1)
*/

public class RotateList {

    public ListNode rotateRight(ListNode head, int k) {

        // edge cases
        if(head == null || head.next == null || k <= 0){
            return head;
        }

        // step 1: find length and last node
        ListNode last = head;
        int length = 1;

        while(last.next != null){
            last = last.next;
            length++;
        }

        // step 2: make circular
        last.next = head;

        // step 3: effective rotations
        int rotations = k % length;

        int skip = length - rotations;

        // step 4: find new tail
        ListNode newLast = head;

        for(int i = 0; i < skip-1; i++){
            newLast = newLast.next;
        }

        // step 5: new head
        head = newLast.next;

        // step 6: break cycle
        newLast.next = null;

        return head;
    }

    // Node definition
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