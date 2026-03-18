package linkedlist.leetcode;

/*
    Problem: Merge Two Sorted Linked Lists

    Given two sorted linked lists,
    merge them into one sorted list.

    Example:
    Input:
    list1 = 1 -> 3 -> 5
    list2 = 2 -> 4 -> 6

    Output:
    1 -> 2 -> 3 -> 4 -> 5 -> 6

    Approach:
    - Use dummy node
    - Compare nodes from both lists
    - Attach smaller node to result
    - Move pointer
    - Attach remaining nodes

    Time Complexity: O(n + m)
    Space Complexity: O(1)
*/

public class MergeSortedLists {

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        // dummy node to simplify logic
        ListNode dummyHead = new ListNode(-1);

        // tail pointer for result list
        ListNode tail = dummyHead;

        // traverse both lists
        while(list1 != null && list2 != null){

            if(list1.val <= list2.val){
                tail.next = list1;
                list1 = list1.next;
            }else{
                tail.next = list2;
                list2 = list2.next;
            }

            tail = tail.next;
        }

        // attach remaining nodes
        tail.next = (list1 != null) ? list1 : list2;

        return dummyHead.next;
    }

    /*
        Definition for singly-linked list
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