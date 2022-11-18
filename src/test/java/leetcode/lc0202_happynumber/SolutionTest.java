package leetcode.lc0202_happynumber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    void example1() {
        int input = 19;
        boolean expected = true;
        boolean output = new Solution().isHappy(input);

        assertEquals(expected, output);
    }

    @Test
    void example2() {
        int input = 2;
        boolean expected = false;
        boolean output = new Solution().isHappy(input);

        assertEquals(expected, output);
    }

    @Test
    void example3() {
        int input = 1111111;
        boolean expected = true;
        boolean output = new Solution().isHappy(input);

        assertEquals(expected, output);
    }
}