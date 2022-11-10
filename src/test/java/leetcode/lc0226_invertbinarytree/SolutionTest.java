package leetcode.lc0226_invertbinarytree;

import leetcode.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {
    @Test
    void example1() {
        TreeNode root = new TreeNode(4, new TreeNode(2, new TreeNode(1), new TreeNode(3)), new TreeNode(7, new TreeNode(6), new TreeNode(9)));
        int[] expected = {4, 7, 2, 9, 6, 3, 1};

        TreeNode output = new Solution().invertTree(root);

        assertArrayEquals(expected, output.toArray());

    }
}