package leetcode.lc0125_validpalindrome;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    void example1() {
        String input = "A man, a plan, a canal: Panama";
        boolean expected = true;

        boolean output = new Solution().isPalindrome(input);
        assertEquals(expected, output);
    }

    @Test
    void example2() {
        String input = "race a car";
        boolean expected = false;

        boolean output = new Solution().isPalindrome(input);
        assertEquals(expected, output);
    }

    @Test
    void example3() {
        String input = " ";
        boolean expected = true;

        boolean output = new Solution().isPalindrome(input);
        assertEquals(expected, output);
    }
}