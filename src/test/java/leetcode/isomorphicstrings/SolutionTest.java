package leetcode.isomorphicstrings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void example1() {
        String input1 = "egg", input2 = "add";
        boolean expected = true;
        boolean output = new Solution().isIsomorphic(input1, input2);

        assertEquals(expected, output);
    }

    @Test
    void example2() {
        String input1 = "foo", input2 = "bar";
        boolean expected = false;
        boolean output = new Solution().isIsomorphic(input1, input2);

        assertEquals(expected, output);
    }

    @Test
    void example3() {
        String input1 = "paper", input2 = "title";
        boolean expected = true;
        boolean output = new Solution().isIsomorphic(input1, input2);

        assertEquals(expected, output);
    }

    @Test
    void example4() {
        String input1 = "badc", input2 = "baba";
        boolean expected = false;
        boolean output = new Solution().isIsomorphic(input1, input2);

        assertEquals(expected, output);
    }


}