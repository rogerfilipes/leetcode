package leetcode.lc0098_validatebst;

import leetcode.common.TreeNode;

/**
 * 98. Validate Binary Search Tree <a href="https://leetcode.com/problems/validate-binary-search-tree"/>
 * <p>
 * Given the root of a binary tree, determine if it is a valid binary search tree (BST).
 * <p>
 * A valid BST is defined as follows:
 * <p>
 * The left subtree of a node contains only nodes with keys less than the node's key.
 * The right subtree of a node contains only nodes with keys greater than the node's key.
 * Both the left and right subtrees must also be binary search trees.
 */
public class Solution {
    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, null, null);
    }

    private boolean isValidBST(TreeNode node, Integer leftLimit, Integer rightLimit) {
        if (node == null)
            return true;

        if ((leftLimit != null && node.val <= leftLimit) || (rightLimit != null && node.val >= rightLimit)) {
            return false;
        }

        return isValidBST(node.left, leftLimit, node.val) && isValidBST(node.right, node.val, rightLimit);
    }
}
