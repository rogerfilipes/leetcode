package leetcode.lc0746_mincostclimbstars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    void example1() {
        int[] input = {10, 15, 20};
        int expected = 15;
        int output = new Solution().minCostClimbingStairs(input);
        assertEquals(expected, output);
    }

    @Test
    void example2() {
        int[] input = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        int expected = 6;
        int output = new Solution().minCostClimbingStairs(input);
        assertEquals(expected, output);
    }
}