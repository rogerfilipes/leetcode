package leetcode.lc0206_reverselinkedlist;

import leetcode.common.ListNode;
import leetcode.common.ListNodeUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {
    @Test
    void example1() {
        int[] head = {1, 2, 3, 4, 5};
        int[] expected = {5, 4, 3, 2, 1};
        ListNode output = new Solution().reverseList(ListNodeUtils.from(head));

        int[] actual = ListNodeUtils.toArray(output);
        assertArrayEquals(expected, actual);
    }

    @Test
    void example2() {
        int[] head = {1, 2};
        int[] expected = {2, 1};
        ListNode output = new Solution().reverseList(ListNodeUtils.from(head));

        int[] actual = ListNodeUtils.toArray(output);
        assertArrayEquals(expected, actual);
    }

}