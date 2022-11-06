package leetcode.lc0001_twosum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {
    @Test
    void example1() {
        int[] input = {2,7,11,15};
        int target = 9;
        int[] expected = {0,1};

        int[] actual = new Solution().twoSum(input, target);

        assertArrayEquals(expected, actual);
    }

    @Test
    void example2() {
        int[] input = {3,2,4};
        int target = 6;
        int[] expected = {1,2};

        int[] actual = new Solution().twoSum(input, target);

        assertArrayEquals(expected, actual);
    }

    @Test
    void example3() {
        int[] input = {3,3};
        int target = 6;
        int[] expected = {0,1};

        int[] actual = new Solution().twoSum(input, target);

        assertArrayEquals(expected, actual);
    }
}