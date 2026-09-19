package babua90daysdsa.fastslow;

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

public class LengthOfCycleInLL {
    public int lengthOfLoop(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                // Cycle
                break;
            }
        }

        if(fast == null || fast.next == null){
            return 0;
        }

        Node n1 = slow;
        Node n2 = head;

        while(n1 != n2){
            n1 = n1.next;
            n2 = n2.next;
        }

        int len = 1;

        Node curr = n1.next;

        while(curr != n1){
            len++;
            curr = curr.next;
        }

        return len;
    }
}
