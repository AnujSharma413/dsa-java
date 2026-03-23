package linkedlist.leetcode;

/*
    Problem: Palindrome Linked List

    Approach:
    1. Find middle using slow-fast pointer
    2. Reverse second half
    3. Compare both halves
    4. Restore list

    Time Complexity: O(n)
    Space Complexity: O(1)
*/

public class PalindromeLinkedList {

    public boolean isPalindrome(ListNode head) {

        // base case
        if(head == null || head.next == null){
            return true;
        }

        // step 1: find middle
        ListNode mid = getMiddle(head);

        // step 2: reverse second half
        ListNode secondHead = reverseList(mid);

        // step 3: compare both halves
        ListNode p1 = head;
        ListNode p2 = secondHead;

        boolean result = true;

        while(p2 != null){

            if(p1.val != p2.val){
                result = false;
                break;
            }

            p1 = p1.next;
            p2 = p2.next;
        }

        // step 4: restore list
        reverseList(secondHead);

        return result;
    }

    /*
        Find middle using slow-fast
    */
    public static ListNode getMiddle(ListNode head){

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
    public static ListNode reverseList(ListNode head){

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