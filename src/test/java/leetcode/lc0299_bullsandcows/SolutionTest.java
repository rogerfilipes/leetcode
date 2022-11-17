package leetcode.lc0299_bullsandcows;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    void example1() {
        String secret = "1807", guess = "7810", expected = "1A3B";
        String output = new Solution().getHint(secret, guess);

        assertEquals(expected, output);
    }

    @Test
    void example2() {
        String secret = "1123", guess = "0111", expected = "1A1B";
        String output = new Solution().getHint(secret, guess);

        assertEquals(expected, output);
    }
}