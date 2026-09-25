package babua90daysdsa.fastslow;

public class MaximumTwinSumOfALinkedListOptimize {

    static int pairSum(ListNode head){
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode p2 = reverseLL(slow);
        ListNode p1 = head;

        int max = Integer.MIN_VALUE;

        while(p1 != null && p2 != null){
            int candidate = p1.val + p2.val;
            max = Math.max(max,candidate);

            p1 = p1.next;
            p2 = p2.next;
        }

        return max;
    }

    static ListNode reverseLL(ListNode curr){
        ListNode prev = null;

        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
}
