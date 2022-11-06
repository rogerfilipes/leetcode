package leetcode.lc0167_twosumii;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {
    @Test
    void example1() {
        int[] input = {2, 7, 11, 15};
        int target = 9;
        int[] expected = {1, 2};
        int[] output = new Solution().twoSum(input, target);
        assertArrayEquals(expected, output);
    }

    @Test
    void example2() {
        int[] input = {2, 3, 4};
        int target = 6;
        int[] expected = {1, 3};
        int[] output = new Solution().twoSum(input, target);
        assertArrayEquals(expected, output);
    }
}