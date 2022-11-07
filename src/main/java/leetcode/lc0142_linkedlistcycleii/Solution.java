package leetcode.lc0142_linkedlistcycleii;

import leetcode.common.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * 142. Linked List Cycle II <a href="https://leetcode.com/problems/linked-list-cycle-ii" />
 * <p>
 * Given the head of a linked list, return the node where the cycle begins. If there is no cycle, return null.
 * <p>
 * There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to (0-indexed). It is -1 if there is no cycle. Note that pos is not passed as a parameter.
 * <p>
 * Do not modify the linked list.
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {

        Set<ListNode> processed = new HashSet<>();

        while (head != null) {
            if (head.next != null && processed.contains(head.next)) {
                return head.next;
            }
            processed.add(head);
            head = head.next;
        }
        return null;
    }
}
