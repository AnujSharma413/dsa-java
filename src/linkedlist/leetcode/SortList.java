package linkedlist.leetcode;

/*
    Problem: Sort Linked List

    Approach:
    - Use Merge Sort
    - Divide list into halves
    - Recursively sort both halves
    - Merge sorted halves

    Time Complexity: O(n log n)
    Space Complexity: O(log n) (recursion stack)
*/

public class SortList {

    public ListNode sortList(ListNode head) {

        // base case: 0 or 1 node
        if (head == null || head.next == null) {
            return head;
        }

        // find middle using slow-fast
        ListNode prev = null;
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        // break list into two halves
        prev.next = null;

        // sort left half
        ListNode left = sortList(head);

        // sort right half
        ListNode right = sortList(slow);

        // merge both halves
        return mergeTwoLists(left, right);
    }

    /*
        Merge two sorted linked lists
    */
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode dummyHead = new ListNode(-1);
        ListNode tail = dummyHead;

        while (list1 != null && list2 != null) {

            if (list1.val <= list2.val) {
                tail.next = list1;
                list1 = list1.next;
            } else {
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
        Utility to print list
    */
    public static void printList(ListNode head) {

        while (head != null) {
            System.out.print(head.val + (head.next != null ? " -> " : ""));
            head = head.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        SortList solution = new SortList();

        // Example list
        ListNode head = new ListNode(4,
                new ListNode(2,
                        new ListNode(1,
                                new ListNode(3))));

        System.out.print("Original: ");
        printList(head);

        ListNode sorted = solution.sortList(head);

        System.out.print("Sorted:   ");
        printList(sorted);
    }

    /*
        Node definition
    */
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) { this.val = val; }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}