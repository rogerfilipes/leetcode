package leetcode.lc0200_numberofislands;

/**
 * 200. Number of Islands  <a href="https://leetcode.com/problems/number-of-islands"/>
 * <p>
 * Given an m x n 2D binary grid <i>grid</i> which represents a map of '1's (land) and '0's (water), return the number of islands.
 * <p>
 * An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.
 */
public class Solution {
    char LAND = '1';
    char VISITED = '2';

    public int numIslands(char[][] grid) {
        int count = 0;

        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {

                if (grid[r][c] == LAND) {
                    count++;
                    search(grid, r, c);
                }

            }
        }
        return count;
    }

    private void search(char[][] grid, int x, int y) {
        if (x < 0 || y < 0 || x >= grid.length || y >= grid[0].length || grid[x][y] != LAND)
            return;

        grid[x][y] = VISITED;

        search(grid, x - 1, y);
        search(grid, x + 1, y);
        search(grid, x, y - 1);
        search(grid, x, y + 1);

    }
}
