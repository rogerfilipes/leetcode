package leetcode.lc0062_uniquepaths;

/**
 * 62. Unique Paths <a href="https://leetcode.com/problems/unique-paths"/>
 * <p>
 * There is a robot on an m x n grid. The robot is initially located at the top-left corner (i.e., grid[0][0]). The robot tries to move to the bottom-right corner (i.e., grid[m - 1][n - 1]). The robot can only move either down or right at any point in time.
 * <p>
 * Given the two integers m and n, return the number of possible unique paths that the robot can take to reach the bottom-right corner.
 * <p>
 * The test cases are generated so that the answer will be less than or equal to 2 * 109.
 */
public class Solution {
    public int uniquePaths(int m, int n) {
        int[][] paths = new int[m][n];

        return transverse(paths, 0, 0, paths.length, paths[0].length);
    }

    public int transverse(int[][] paths, int x, int y, int m, int n) {
        if (x == m - 1 && y == n - 1)
            return 1;

        if (x >= m || y >= n)
            return 0;

        if (paths[x][y] != 0)
            return paths[x][y];

        paths[x][y] = transverse(paths, x + 1, y, m, n) + transverse(paths, x, y + 1, m, n);
        return paths[x][y];
    }
}
