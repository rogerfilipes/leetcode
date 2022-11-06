package leetcode.lc0121_besttimebuysellstock;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void example1(){
        int[] input = {7,1,5,3,6,4};
        int expected = 5;

        int output = new Solution().maxProfit(input);
        assertEquals(expected, output);
    }

    @Test
    void example2(){
        int[] input = {7,6,4,3,1};
        int expected = 0;

        int output = new Solution().maxProfit(input);
        assertEquals(expected, output);
    }
}