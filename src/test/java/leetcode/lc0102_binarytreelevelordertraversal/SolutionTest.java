package leetcode.lc0102_binarytreelevelordertraversal;

import leetcode.common.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {

    @Test
    void example1() {
        TreeNode root = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));

        int[][] expected = {{3}, {9, 20}, {15, 7}};

        List<List<Integer>> output = new Solution().levelOrder(root);

        int[][] outputArray = output.stream()
                .map(l -> l.stream().mapToInt(Integer::intValue).toArray())
                .toArray(int[][]::new);
        assertArrayEquals(expected, outputArray);
    }
}