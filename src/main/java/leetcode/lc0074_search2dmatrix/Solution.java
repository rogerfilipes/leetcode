package leetcode.lc0074_search2dmatrix;

/**
 * 74. Search a 2D Matrix <a href="https://leetcode.com/problems/search-a-2d-matrix/" />
 * <p>
 * Write an efficient algorithm that searches for a value target in an m x n integer matrix matrix. This matrix has the following properties:
 * <p>
 * Integers in each row are sorted from left to right.
 * The first integer of each row is greater than the last integer of the previous row.
 */
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rowTopPointer = 0;
        int rowBottomPointer = matrix.length - 1;

        while (rowTopPointer <= rowBottomPointer) {
            int verticalSearchPointer = (rowTopPointer + rowBottomPointer) / 2;
            if (matrix[verticalSearchPointer][matrix[verticalSearchPointer].length - 1] < target) {
                rowTopPointer = verticalSearchPointer + 1;
            } else if (matrix[verticalSearchPointer][0] > target) {
                rowBottomPointer = verticalSearchPointer - 1;
            } else {
                break;
            }
        }

        if (rowTopPointer > rowBottomPointer)
            return false;

        int verticalSearchPointer = (rowTopPointer + rowBottomPointer) / 2;

        int leftPointer = 0;
        int rightPointer = matrix[verticalSearchPointer].length - 1;

        while (leftPointer <= rightPointer) {
            int horizontalSearchPointer = (leftPointer + rightPointer) / 2;
            if (matrix[verticalSearchPointer][horizontalSearchPointer] == target) {
                return true;
            }
            if (matrix[verticalSearchPointer][horizontalSearchPointer] < target) {
                leftPointer = horizontalSearchPointer + 1;
            }
            if (matrix[verticalSearchPointer][horizontalSearchPointer] > target) {
                rightPointer = horizontalSearchPointer - 1;
            }
        }

        return false;
    }
}

