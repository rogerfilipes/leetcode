package leetcode.lc0102_binarytreelevelordertraversal;

import leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.stream.Collectors;

/**
 * 102. Binary Tree Level Order Traversal <a href="https://leetcode.com/problems/binary-tree-level-order-traversal" />
 * <p>
 * Given the root of a binary tree, return the level order traversal of its nodes' values. (i.e., from left to right, level by level).
 */
public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {

        if (root == null)
            return new ArrayList<>(new ArrayList<>());

        Queue<TreeNode> queue = new LinkedList<>();
        Queue<TreeNode> tempQueue = new LinkedList<TreeNode>();

        List<List<Integer>> order = new LinkedList<List<Integer>>();

        queue.add(root);

        List<TreeNode> tempLevel = new ArrayList<>();

        while (!queue.isEmpty()) {

            TreeNode current = queue.poll();

            tempLevel.add(current);

            if (current.left != null) {
                tempQueue.add(current.left);
            }

            if (current.right != null) {
                tempQueue.add(current.right);
            }


            if (queue.isEmpty()) {
                order.add(tempLevel.stream().map(t -> t.val).collect(Collectors.toList()));
                tempLevel.clear();
                queue = new LinkedList<>(tempQueue);
                tempQueue.clear();
            }
        }


        return order;
    }
}
