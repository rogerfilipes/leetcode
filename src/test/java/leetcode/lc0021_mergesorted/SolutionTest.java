package leetcode.lc0021_mergesorted;


import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {
    @Test
    void example1() {

        int[] list1 = {1, 2, 4}, list2 = {1, 3, 4};
        int[] expected = {1, 1, 2, 3, 4, 4};

        Solution.ListNode list1Nodes = from(list1);
        Solution.ListNode list2Nodes = from(list2);
        Solution.ListNode output = new Solution().mergeTwoLists(list1Nodes, list2Nodes);

        assertArrayEquals(expected, toArray(output));

    }

    @Test
    void example2() {

        int[] list1 = {1, 2, 4}, list2 = {1, 3, 4};
        int[] expected = {1, 1, 2, 3, 4, 4};

        Solution.ListNode list1Nodes = from(list1);
        Solution.ListNode list2Nodes = from(list2);
        Solution.ListNode output = new Solution().mergeTwoLists(list1Nodes, list2Nodes);

        assertArrayEquals(expected, toArray(output));

    }

    @Test
    void example3() {

        int[] list1 = {}, list2 = {0};
        int[] expected = {0};

        Solution.ListNode list1Nodes = from(list1);
        Solution.ListNode list2Nodes = from(list2);
        Solution.ListNode output = new Solution().mergeTwoLists(list1Nodes, list2Nodes);

        assertArrayEquals(expected, toArray(output));

    }

    private int[] toArray(Solution.ListNode node) {
        List<Integer> result = new ArrayList<>();
        Solution.ListNode cursor = node;

        while (cursor != null) {
            result.add(cursor.val);
            cursor = cursor.next;
        }

        return result.stream().mapToInt(i -> i).toArray();

    }

    public Solution.ListNode from(int[] values) {
        Solution.ListNode previous = null;
        Solution.ListNode current = null;
        for (int i = values.length - 1; i >= 0; i--) {
            current = new Solution.ListNode(values[i], previous);
            previous = current;
        }

        return current;
    }

}