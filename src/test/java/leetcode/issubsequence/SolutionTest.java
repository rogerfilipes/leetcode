package leetcode.issubsequence;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    void example1() {
        String s = "abc", t = "ahbgdc";
        boolean expected = true;

        boolean output = new Solution().isSubsequence(s, t);
        assertEquals(expected, output);
    }

    @Test
    void example2() {
        String s = "axc", t = "ahbgdc";
        boolean expected = false;

        boolean output = new Solution().isSubsequence(s, t);
        assertEquals(expected, output);
    }

    @Test
    void example3() {
        String s = "aaaaaa", t = "bbaaaa";
        boolean expected = false;

        boolean output = new Solution().isSubsequence(s, t);
        assertEquals(expected, output);
    }

    @Test
    void example4() {
        String s = "b", t = "c";
        boolean expected = false;

        boolean output = new Solution().isSubsequence(s, t);
        assertEquals(expected, output);
    }

    @Test
    void example5() {
        String s = "bb",
                t = "ahbgdc";
        boolean expected = false;

        boolean output = new Solution().isSubsequence(s, t);
        assertEquals(expected, output);
    }
}