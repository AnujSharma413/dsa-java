package stacksqueues.queue.usingstack;

/*
 * Driver class to test Queue using Stack implementations
 */

public class QueueUsingStackMain {
    public static void main(String[] args) throws Exception {

        System.out.println("=== Remove Costly ===");
        QueueUsingStack q1 = new QueueUsingStack();
        q1.add(1);
        q1.add(2);
        q1.add(3);

        System.out.println(q1.remove()); // 1
        System.out.println(q1.peek());   // 2

        System.out.println("=== Remove Efficient ===");
        QueueUsingStackRemoveEff q2 = new QueueUsingStackRemoveEff();
        q2.add(1);
        q2.add(2);
        q2.add(3);

        System.out.println(q2.remove()); // 1
        System.out.println(q2.peek());   // 2
    }
}