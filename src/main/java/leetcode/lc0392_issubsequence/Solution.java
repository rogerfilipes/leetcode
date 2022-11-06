package leetcode.lc0392_issubsequence;

/**
 * 392. Is Subsequence <a href="https://leetcode.com/problems/is-subsequence/" />
 * <p>
 * Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
 * <p>
 * A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
 */
class Solution {
    public boolean isSubsequence(String s, String t) {
        char[] leftchars = s.toCharArray();
        char[] rigthChars = t.toCharArray();
        int rightPointer = 0;

        for (int i = 0; i < s.length(); i++) {

            for (int y = rightPointer; y < t.length(); y++) {

                rightPointer = y;
                if (leftchars[i] == rigthChars[y]) {
                    rightPointer++;
                    break;
                } else if (y == t.length() - 1) {
                    return false;
                }
            }

            if (rightPointer >= t.length() && i < s.length() - 1) return false;
        }

        return true;
    }
}