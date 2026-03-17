package linkedlist.leetcode;

/*
    Problem: Remove Duplicates from Sorted Linked List

    Given the head of a sorted linked list,
    delete all duplicates such that each element appears only once.

    Example:
    Input:  1 -> 1 -> 2 -> 3 -> 3
    Output: 1 -> 2 -> 3

    Approach:
    - Traverse the list
    - Compare current node with next node
    - If equal → skip next node
    - Else → move forward

    Time Complexity: O(n)
    Space Complexity: O(1)
*/

public class RemoveDuplicates {

    public static ListNode deleteDuplicates(ListNode node) {

        // base case: empty list
        if(node == null){
            return node;
        }

        // keep reference to head
        ListNode head = node;

        // traverse list
        while(node.next != null){

            // if duplicate found
            if(node.val == node.next.val){

                // skip duplicate node
                node.next = node.next.next;

            } else {

                // move to next node
                node = node.next;
            }
        }

        return head;
    }

    /*
        Definition for singly-linked list node
    */
    public static class ListNode {

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