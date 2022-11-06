package leetcode.lc0036_validsudoku;

import java.util.HashSet;
import java.util.Set;

/**
 * 36. Valid Sudoku <a href="https://leetcode.com/problems/valid-sudoku/" />
 *
 * Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:
 *
 * Each row must contain the digits 1-9 without repetition.
 * Each column must contain the digits 1-9 without repetition.
 * Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.
 * Note:
 *
 * A Sudoku board (partially filled) could be valid but is not necessarily solvable.
 * Only the filled cells need to be validated according to the mentioned rules.
 */
class Solution {

    char EMPTY = '.';

    public boolean isValidSudoku(char[][] board) {


        return validRow(board) && validColumn(board) && validSquares(board);
    }

    private boolean validRow(char[][] board) {
        for (int r = 0; r < 9; r++) {
            Set<String> seen = new HashSet<>(9);
            for (int c = 0; c < 9; c++) {
                if (EMPTY == board[r][c])
                    continue;
                if (seen.contains(String.valueOf(board[r][c])))
                    return false;
                seen.add(String.valueOf(board[r][c]));
            }
        }

        return true;
    }

    private boolean validColumn(char[][] board) {
        for (int c = 0; c < 9; c++) {
            Set<String> seen = new HashSet<>(9);
            for (int r = 0; r < 9; r++) {
                if (EMPTY == board[r][c])
                    continue;
                if (seen.contains(String.valueOf(board[r][c])))
                    return false;
                seen.add(String.valueOf(board[r][c]));
            }
        }

        return true;
    }

    private boolean validSquares(char[][] board) {
        for (int r = 0; r < 9; r = r + 3) {
            for (int c = 0; c < 9; c = c + 3) {

                Set<String> seen = new HashSet<>(9);
                for (int rp = r; rp < r + 3; rp++) {
                    for (int cp = c; cp < c + 3; cp++) {

                        if (EMPTY == board[rp][cp])
                            continue;

                        if (seen.contains(String.valueOf(board[rp][cp])))
                            return false;

                        seen.add(String.valueOf(board[rp][cp]));
                    }
                }
            }
        }

        return true;
    }

}