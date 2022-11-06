package leetcode.lc0003_longestsubstringwhtrepeat;

/**
 * 3. Longest Substring Without Repeating Characters <a href="https://leetcode.com/problems/longest-substring-without-repeating-characters/"/>
 *
 * Given a string s, find the length of the longest substring without repeating characters.
 */

import java.util.HashSet;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) return s.length();

        int left = 0, right = 0;
        int longest = 0;
        int n = s.length();
        HashSet<Character> window = new HashSet<>();
        while (right < n) {
            if (!window.contains(s.charAt(right))) {
                window.add(s.charAt(right));
                right++;
            } else {
                window.remove(s.charAt(left));
                left++;
            }
            longest = Math.max(longest, right - left);
        }

        return longest;
    }
}
