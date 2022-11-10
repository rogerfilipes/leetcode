package leetcode.lc0098_validatebst;

import leetcode.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    void example1() {
        TreeNode root = new TreeNode(2, new TreeNode(1), new TreeNode(3));
        boolean expected = true;
        boolean output = new Solution().isValidBST(root);
        assertEquals(expected, output);
    }

    @Test
    void example2() {
        TreeNode root = new TreeNode(5, new TreeNode(1), new TreeNode(4, new TreeNode(3), new TreeNode(6)));
        boolean expected = false;
        boolean output = new Solution().isValidBST(root);
        assertEquals(expected, output);
    }

    @Test
    void example3() {
        TreeNode root = new TreeNode(5, new TreeNode(1), new TreeNode(6, new TreeNode(2), new TreeNode(7)));
        boolean expected = false;
        boolean output = new Solution().isValidBST(root);
        assertEquals(expected, output);
    }

    @Test
    void example5() {
        TreeNode root = new TreeNode(2, new TreeNode(1), new TreeNode(3, null, new TreeNode(4)));
        boolean expected = true;
        boolean output = new Solution().isValidBST(root);
        assertEquals(expected, output);
    }

    @Test
    void example6() {
        TreeNode root = new TreeNode(
                2147483647);
        boolean expected = true;
        boolean output = new Solution().isValidBST(root);
        assertEquals(expected, output);
    }
}