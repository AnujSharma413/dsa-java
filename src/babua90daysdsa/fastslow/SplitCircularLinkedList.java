package babua90daysdsa.fastslow;

// Utility class to return two nodes as a tuple
class Pair<K, V> {
    public K first;
    public V second;

    public Pair(K first, V second) {
        this.first = first;
        this.second = second;
    }
}

public class SplitCircularLinkedList {

    public Pair<Node, Node> splitList(Node head) {

        if (head == null || head.next == head) {
            return new Pair<>(head, null);
        }

        Node slow = head;
        Node fast = head.next;

        while (fast != head && fast.next != head) {
            slow = slow.next;
            fast = fast.next;

            if (fast.next != head) {
                fast = fast.next;
            }
        }

        Node head2 = slow.next;
        fast.next = head2;

        slow.next = head;

        return new Pair<>(head, head2);
    }
}