package linkedlist.leetcode;

/*
    Problems Covered:
    1. Detect if a cycle exists in a linked list
    2. Find the length of the cycle (if present)

    Approach:
    - Use Floyd’s Cycle Detection Algorithm (Tortoise & Hare)
    - Use two pointers:
        slow -> moves 1 step
        fast -> moves 2 steps

    Key Idea:
    - If a cycle exists, slow and fast will meet inside the cycle
    - Once they meet, traverse the loop to calculate its length

    Time Complexity:
        hasCycle() -> O(n)
        lengthOfCycle() -> O(n)

    Space Complexity:
        O(1) (no extra space used)
*/

public class LinkedListCycle {

    /*
        Method: hasCycle
        Purpose: Check if linked list contains a cycle

        Logic:
        - Move slow by 1 step
        - Move fast by 2 steps
        - If they meet → cycle exists
        - If fast reaches null → no cycle
    */
    public static boolean hasCycle(ListNode head) {

        // Edge case: empty list
        if(head == null) return false;

        ListNode slow = head;
        ListNode fast = head;

        // Traverse list
        while(fast != null && fast.next != null){

            slow = slow.next;           // move 1 step
            fast = fast.next.next;      // move 2 steps

            // If both pointers meet, cycle is present
            if(slow == fast){
                return true;
            }
        }

        // No cycle found
        return false;
    }

    /*
        Method: lengthOfCycle
        Purpose: Return length of cycle (0 if no cycle)

        Logic:
        1. Detect cycle using slow & fast pointers
        2. When they meet:
            - Start from meeting point
            - Traverse entire loop
            - Count number of nodes

        Important:
        - Use do-while loop because we must move at least once
    */
    public static int lengthOfCycle(ListNode head) {

        // Edge case
        if(head == null) return 0;

        ListNode slow = head;
        ListNode fast = head;

        // Step 1: Detect cycle
        while(fast != null && fast.next != null){

            slow = slow.next;           // move 1 step
            fast = fast.next.next;      // move 2 steps

            // Cycle detected
            if(slow == fast){

                int length = 0;

                // Start from meeting point
                ListNode temp = slow;

                /*
                    Traverse the entire cycle until
                    we reach the same node again
                */
                do{
                    temp = temp.next;
                    length++;
                }while(temp != slow);

                return length;
            }
        }

        // No cycle found
        return 0;
    }

    /*
        Definition for singly-linked list node
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