package leetcode.lc0104_maxdepthBtree;

import leetcode.common.TreeNode;

/**
 * 104. Maximum Depth of Binary Tree <a href="https://leetcode.com/problems/maximum-depth-of-binary-tree/"/>
 * <p>
 * Given the root of a binary tree, return its maximum depth.
 * <p>
 * A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 */
public class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}
