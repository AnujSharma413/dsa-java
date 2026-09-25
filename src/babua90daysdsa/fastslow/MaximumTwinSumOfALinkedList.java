package babua90daysdsa.fastslow;

import java.util.*;

public class MaximumTwinSumOfALinkedList {
    static int pairSum(ListNode head){
        List<Integer> list = new ArrayList<>();

        // Iterate through the linked list and add values in the list
        while(head != null){
            list.add(head.val);
            head = head.next;
        }

        int i = 0;
        int j = list.size() - 1;

        int max = Integer.MIN_VALUE;

        while (i < j){
            int candidate = list.get(i) + list.get(j);
            max = Math.max(max,candidate);

            i++;
            j--;
        }

        return max;
    }
}
