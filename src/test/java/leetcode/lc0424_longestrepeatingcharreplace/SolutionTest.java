package leetcode.lc0424_longestrepeatingcharreplace;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void example1(){
        String input = "ABAB";
        int replacements = 2;
        int expected = 4;
        int output = new Solution().characterReplacement(input, replacements);
        assertEquals(expected, output);
    }

    @Test
    void example2(){
        String input = "AABABBA";
        int replacements = 1;
        int expected = 4;
        int output = new Solution().characterReplacement(input, replacements);
        assertEquals(expected, output);
    }

}