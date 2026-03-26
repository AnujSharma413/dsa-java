package linkedlist.leetcode;

/*
    Problem: Reverse Nodes in K Group

    Reverse every group of k nodes

    Approach:
    1. Check if k nodes exist
    2. Reverse first k nodes
    3. Recursively process remaining list
    4. Connect both parts

    Time Complexity: O(n)
    Space Complexity: O(n) (due to recursion)
*/

public class ReverseNodesInkGroup {

    public ListNode reverseKGroup(ListNode head, int k) {

        // step 1: check if k nodes exist
        ListNode check = head;

        for(int i = 0; i < k; i++){
            if(check == null) return head;
            check = check.next;
        }

        // step 2: reverse k nodes
        ListNode curr = head;
        ListNode prev = null;
        ListNode next = null;

        for(int i = 0; i < k; i++){

            next = curr.next;

            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // step 3: recursive call for remaining list
        if(next != null){
            head.next = reverseKGroup(next, k);
        }

        // step 4: return new head
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