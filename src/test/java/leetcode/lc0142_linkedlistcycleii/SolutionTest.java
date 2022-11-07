package leetcode.lc0142_linkedlistcycleii;

import leetcode.common.ListNode;
import leetcode.common.ListNodeUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void example1() {
        int[] head = {3, 2, 0, -4};
        int pos = 1;
        int expected = 2;

        ListNode output = new Solution().detectCycle(ListNodeUtils.from(head, pos));
        assertNotNull(output);
        assertEquals(expected, output.val);
    }

    @Test
    void example2() {
        int[] head = {1, 2};
        int pos = 0;
        int expected = 1;

        ListNode output = new Solution().detectCycle(ListNodeUtils.from(head, pos));
        assertNotNull(output);
        assertEquals(expected, output.val);
    }

    @Test
    void example3() {
        int[] head = {1};
        int pos = -1;

        ListNode output = new Solution().detectCycle(ListNodeUtils.from(head, pos));
        assertNull(output);
    }
}