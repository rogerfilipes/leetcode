package leetcode.lc0876_middlelinkedlist;

import leetcode.common.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 876. Middle of the Linked List <a href="https://leetcode.com/problems/middle-of-the-linked-list"/>
 * <p>
 * Given the head of a singly linked list, return the middle node of the linked list.
 * <p>
 * If there are two middle nodes, return the second middle node.
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        int size = 0;
        List<ListNode> list = new ArrayList<>();
        while (head != null) {

            list.add(head);
            size++;
            head = head.next;

        }

        int middle = size / 2;
        return list.get(middle);
    }
}
