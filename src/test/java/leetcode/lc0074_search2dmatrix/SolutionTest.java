package leetcode.lc0074_search2dmatrix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    void example1() {
        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        int target = 3;
        boolean expected = true;

        boolean output = new Solution().searchMatrix(matrix, target);
        assertEquals(expected, output);
    }

    @Test
    void example2() {
        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        int target = 13;
        boolean expected = false;

        boolean output = new Solution().searchMatrix(matrix, target);
        assertEquals(expected, output);
    }

    @Test
    void example3() {
        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        int target = 11;
        boolean expected = true;

        boolean output = new Solution().searchMatrix(matrix, target);
        assertEquals(expected, output);
    }

    @Test
    void example4() {
        int[][] matrix = {{1}};
        int target = 2;
        boolean expected = false;

        boolean output = new Solution().searchMatrix(matrix, target);
        assertEquals(expected, output);
    }
}