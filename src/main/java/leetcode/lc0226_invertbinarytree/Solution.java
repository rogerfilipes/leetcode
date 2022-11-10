package leetcode.lc0226_invertbinarytree;

import leetcode.common.TreeNode;

/**
 * 226. Invert Binary Tree <a href="https://leetcode.com/problems/invert-binary-tree/"/>
 * <p>
 * Given the root of a binary tree, invert the tree, and return its root.
 */
public class Solution {

    public TreeNode invertTree(TreeNode node) {
        if (node == null)
            return null;

        return new TreeNode(node.val, invertTree(node.right), invertTree(node.left));
    }


}
