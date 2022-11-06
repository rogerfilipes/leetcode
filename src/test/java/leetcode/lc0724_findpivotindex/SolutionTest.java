package leetcode.lc0724_findpivotindex;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    void example1() {
        int[] input = {1, 7, 3, 6, 5, 6};
        int expected = 3;
        int output = new Solution().pivotIndex(input);
        assertEquals(expected, output);
    }

    @Test
    void example2() {
        int[] input = {1, 2, 3};
        int expected = -1;
        int output = new Solution().pivotIndex(input);
        assertEquals(expected, output);
    }

    @Test
    void example3() {
        int[] input = {2, 1, -1};
        int expected = 0;
        int output = new Solution().pivotIndex(input);
        assertEquals(expected, output);
    }
}