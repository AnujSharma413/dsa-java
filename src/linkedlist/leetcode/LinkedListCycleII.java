package linkedlist.leetcode;

/*
    File: LinkedListCycleII.java

    Problem:
    Find the starting node of a cycle in a linked list.

    Approach:
    1. Detect cycle using Floyd’s algorithm
    2. Find length of cycle
    3. Move one pointer ahead by cycle length
    4. Move both pointers together → meeting point = cycle start

    Time Complexity: O(n)
    Space Complexity: O(1)
*/

public class LinkedListCycleII {

    /*
        Step 1: Find length of cycle
    */
    public static int lengthOfCycle(ListNode head) {

        if(head == null) return 0;

        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){

            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){

                int length = 0;
                ListNode temp = slow;

                // count cycle length
                do{
                    temp = temp.next;
                    length++;
                }while(temp != slow);

                return length;
            }
        }

        return 0;
    }

    /*
        Step 2: Find start of cycle
    */
    public static ListNode detectCycle(ListNode head) {

        if(head == null) return null;

        int length = lengthOfCycle(head);

        // no cycle
        if(length == 0) return null;

        ListNode f = head;
        ListNode s = head;

        // move one pointer ahead by cycle length
        while(length > 0){
            s = s.next;
            length--;
        }

        // move both pointers together
        while(f != s){
            f = f.next;
            s = s.next;
        }

        // meeting point is start of cycle
        return f;
    }

    /*
        Node definition
    */
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}