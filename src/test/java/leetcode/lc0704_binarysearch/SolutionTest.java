package leetcode.lc0704_binarysearch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    void example1() {
        int[] input = {-1, 0, 3, 5, 9, 12};
        int target = 9;
        int expected = 4;
        int output = new Solution().search(input, target);
        assertEquals(expected, output);
    }

    @Test
    void example2() {
        int[] input = {-1, 0, 3, 5, 9, 12};
        int target = 2;
        int expected = -1;
        int output = new Solution().search(input, target);
        assertEquals(expected, output);
    }

    @Test
    void example3() {
        int[] input = {-1, 0, 3, 5, 9, 12};
        int target = 0;
        int expected = 1;
        int output = new Solution().search(input, target);
        assertEquals(expected, output);
    }

    @Test
    void example4() {
        int[] input = {-1, 0, 5};
        int target = -1;
        int expected = 0;
        int output = new Solution().search(input, target);
        assertEquals(expected, output);
    }

}