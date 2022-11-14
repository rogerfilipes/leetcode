package leetcode.lc0062_uniquepaths;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    void example1() {
        int m = 3, n = 7, expected = 28;
        int output = new Solution().uniquePaths(m, n);
        assertEquals(expected, output);
    }

    @Test
    void example2() {
        int m = 2, n = 2, expected = 2;
        int output = new Solution().uniquePaths(m, n);
        assertEquals(expected, output);
    }

}