package leetcode.validpalindrome;

/**
 * 125. Valid Palindrome <a href="https://leetcode.com/problems/valid-palindrome/"/>
 * <p>
 * A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
 * <p>
 * Given a string s, return true if it is a palindrome, or false otherwise.
 */
class Solution {
    public boolean isPalindrome(String s) {
        String sanitized = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        for (int i = 0; i < sanitized.length() / 2; i++) {
            if (sanitized.charAt(i) != sanitized.charAt(sanitized.length() - 1 - i))
                return false;
        }
        return true;
    }
}