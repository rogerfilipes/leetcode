package leetcode.lc0733_floodfill;

/**
 * 733. Flood Fill <a href="https://leetcode.com/problems/flood-fill" />
 * <p>
 * An image is represented by an m x n integer grid image where image[i][j] represents the pixel value of the image.
 * <p>
 * You are also given three integers sr, sc, and color. You should perform a flood fill on the image starting from the pixel image[sr][sc].
 * <p>
 * To perform a flood fill, consider the starting pixel, plus any pixels connected 4-directionally to the starting pixel of the same color as the starting pixel, plus any pixels connected 4-directionally to those pixels (also with the same color), and so on. Replace the color of all of the aforementioned pixels with color.
 * <p>
 * Return the modified image after performing the flood fill.
 */
public class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {

        int original = image[sr][sc];
        if (image[sr][sc] != color)
            paint(image, original, color, sr, sc);
        return image;
    }

    private void paint(int[][] image, int original, int target, int x, int y) {

        if (x < 0 || y < 0 || x >= image.length || y >= image[0].length || image[x][y] != original)
            return;

        image[x][y] = target;

        paint(image, original, target, x - 1, y);
        paint(image, original, target, x + 1, y);
        paint(image, original, target, x, y - 1);
        paint(image, original, target, x, y + 1);
    }

}