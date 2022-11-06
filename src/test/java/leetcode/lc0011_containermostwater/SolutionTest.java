package leetcode.lc0011_containermostwater;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    void example1() {
        int[] intput = {1,8,6,2,5,4,8,3,7};
        int expected = 49;
        int output = new Solution().maxArea(intput);

        assertEquals(expected, output);
    }

    @Test
    void example2() {
        int[] intput = {1, 1};
        int expected = 1;
        int output = new Solution().maxArea(intput);

        assertEquals(expected, output);
    }
}