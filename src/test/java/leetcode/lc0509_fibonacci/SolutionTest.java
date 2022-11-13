package leetcode.lc0509_fibonacci;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    void example1() {
        int input = 2, expected = 1;
        int output = new Solution().fib(input);
        assertEquals(expected, output);
    }

    @Test
    void example2() {
        int input = 3, expected = 2;
        int output = new Solution().fib(input);
        assertEquals(expected, output);
    }

    @Test
    void example3() {
        int input = 4, expected = 3;
        int output = new Solution().fib(input);
        assertEquals(expected, output);
    }
}