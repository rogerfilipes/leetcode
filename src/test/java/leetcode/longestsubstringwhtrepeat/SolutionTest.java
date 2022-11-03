package leetcode.longestsubstringwhtrepeat;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    void example1() {
        String input = "abcabcbb";
        int expected = 3;

        int output = new Solution().lengthOfLongestSubstring(input);

        assertEquals(expected, output);
    }

    @Test
    void example2() {
        String input = "bbbbb";
        int expected = 1;

        int output = new Solution().lengthOfLongestSubstring(input);

        assertEquals(expected, output);
    }

    @Test
    void example3() {
        String input = "pwwkew";
        int expected = 3;

        int output = new Solution().lengthOfLongestSubstring(input);

        assertEquals(expected, output);
    }
}