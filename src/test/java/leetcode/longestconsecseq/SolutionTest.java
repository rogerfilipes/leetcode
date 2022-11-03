package leetcode.longestconsecseq;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    void example1() {
        int[] input = {100, 4, 200, 1, 3, 2};
        int expected = 4;

        int output = new Solution().longestConsecutive(input);
        assertEquals(expected, output);
    }

    @Test
    void example2() {
        int[] input = {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
        int expected = 9;

        int output = new Solution().longestConsecutive(input);
        assertEquals(expected, output);
    }
}