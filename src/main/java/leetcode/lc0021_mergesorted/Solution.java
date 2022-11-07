package leetcode.lc0021_mergesorted;

/**
 * 21. Merge Two Sorted Lists <a href="https://leetcode.com/problems/merge-two-sorted-lists"/>
 * <p>
 * You are given the heads of two sorted linked lists list1 and list2.
 * <p>
 * Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.
 * <p>
 * Return the head of the merged linked list.
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null)
            return null;

        if (list1 != null && list2 == null) {
            return new ListNode(list1.val, mergeTwoLists(list1.next, list2));
        } else if (list1 == null && list2 != null) {
            return new ListNode(list2.val, mergeTwoLists(list1, list2.next));
        }

        if (list1.val < list2.val) {
            return new ListNode(list1.val, mergeTwoLists(list1.next, list2));
        } else {
            return new ListNode(list2.val, mergeTwoLists(list1, list2.next));
        }
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}


