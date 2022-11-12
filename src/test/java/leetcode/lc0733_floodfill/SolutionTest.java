package leetcode.lc0733_floodfill;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {
    @Test
    void example1() {
        int[][] image = {
                {1, 1, 1},
                {1, 1, 0},
                {1, 0, 1}
        };
        int sr = 1, sc = 1, color = 2;
        int[][] expected = {
                {2, 2, 2},
                {2, 2, 0},
                {2, 0, 1}
        };

        int[][] output = new Solution().floodFill(image, sr, sc, color);

        assertArrayEquals(expected, output);
    }

    @Test
    void example2() {
        int[][] image = {
                {0,0,0},
                {0,0,0}
        };
        int sr = 0, sc = 0, color = 0;
        int[][] expected = {
                {0,0,0},
                {0,0,0}
        };

        int[][] output = new Solution().floodFill(image, sr, sc, color);

        assertArrayEquals(expected, output);
    }
}