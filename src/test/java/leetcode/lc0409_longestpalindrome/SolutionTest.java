package leetcode.lc0409_longestpalindrome;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    void example1() {
        String input = "abccccdd";
        int expected = 7;

        int output = new Solution().longestPalindrome(input);

        assertEquals(expected, output);
    }

    @Test
    void example2() {
        String input = "a";
        int expected = 1;

        int output = new Solution().longestPalindrome(input);

        assertEquals(expected, output);
    }
}