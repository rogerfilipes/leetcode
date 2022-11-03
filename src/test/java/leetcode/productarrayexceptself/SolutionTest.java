package leetcode.productarrayexceptself;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {
    @Test
    void example1() {
        int[] input = {1, 2, 3, 4};
        int[] expected = {24, 12, 8, 6};
        int[] output = new Solution().productExceptSelf(input);

        assertArrayEquals(expected, output);
    }

    @Test
    void example2() {
        int[] input = {-1, 1, 0, -3, 3};
        int[] expected = {0, 0, 9, 0, 0};
        int[] output = new Solution().productExceptSelf(input);

        assertArrayEquals(expected, output);
    }
}