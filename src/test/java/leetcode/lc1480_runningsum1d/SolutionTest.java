package leetcode.lc1480_runningsum1d;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {
    @Test
    void example1() {
        int[] input = {1, 2, 3, 4};
        int[] expected = {1, 3, 6, 10};
        int[] output = new Solution().runningSum(input);
        assertArrayEquals(expected, output);
    }

    @Test
    void example2() {
        int[] input = {1, 1, 1, 1, 1};
        int[] expected = {1, 2, 3, 4, 5};
        int[] output = new Solution().runningSum(input);
        assertArrayEquals(expected, output);
    }

    @Test
    void example3() {
        int[] input = {3, 1, 2, 10, 1};
        int[] expected = {3, 4, 6, 16, 17};
        int[] output = new Solution().runningSum(input);
        assertArrayEquals(expected, output);
    }
}