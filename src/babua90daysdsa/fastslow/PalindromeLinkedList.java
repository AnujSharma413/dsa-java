package babua90daysdsa.fastslow;

public class PalindromeLinkedList {
    static boolean isPalindrome(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode p1 = reverseLL(slow);
        ListNode p2 = head;

        while (p1 != null && p2 != null){
            if(p1.val != p2.val){
                return false;
            }

            p1 = p1.next;
            p2 = p2.next;
        }

        return true;
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
