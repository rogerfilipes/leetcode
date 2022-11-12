package leetcode.lc0543_diameterbtree;

import leetcode.common.TreeNode;

/**
 * 543. Diameter of Binary Tree <a href="https://leetcode.com/problems/diameter-of-binary-tree/"/>
 * <p>
 * Given the root of a binary tree, return the length of the diameter of the tree.
 * <p>
 * The diameter of a binary tree is the length of the longest path between any two nodes in a tree. This path may or may not pass through the root.
 * <p>
 * The length of a path between two nodes is represented by the number of edges between them.
 */
public class Solution {

    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null)
            return 0;

        int leftD = diameterOfBinaryTree(root.left);
        int rightD = diameterOfBinaryTree(root.right);

        int selfD = height(root.left) + height(root.right);
        return Math.max(selfD, Math.max(leftD, rightD));

    }

    private int height(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(height(root.left), height(root.right)) + 1;
    }


}
