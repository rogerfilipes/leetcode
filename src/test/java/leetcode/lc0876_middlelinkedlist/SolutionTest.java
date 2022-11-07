package leetcode.lc0876_middlelinkedlist;

import leetcode.common.ListNode;
import leetcode.common.ListNodeUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {
    @Test
    void example1() {
        int[] head = {1, 2, 3, 4, 5};
        int[] expected = {3, 4, 5};
        ListNode output = new Solution().middleNode(ListNodeUtils.from(head));

        int[] actual = ListNodeUtils.toArray(output);
        assertArrayEquals(expected, actual);
    }

    @Test
    void example2() {
        int[] head = {1, 2, 3, 4, 5, 6};
        int[] expected = {4, 5, 6};
        ListNode output = new Solution().middleNode(ListNodeUtils.from(head));

        int[] actual = ListNodeUtils.toArray(output);
        assertArrayEquals(expected, actual);
    }
}