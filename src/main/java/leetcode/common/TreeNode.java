package leetcode.common;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode() {
    }

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public int[] toArray() {
        List<TreeNode> array = new ArrayList<>();

        Queue<TreeNode> queue = new LinkedList<>();
        Queue<TreeNode> tempQueue = new LinkedList<>();

        TreeNode current = this;
        queue.add(current);

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            array.add(node);

            if (node.left != null)
                tempQueue.add(node.left);

            if (node.right != null)
                tempQueue.add(node.right);

            if (queue.isEmpty()) {
                queue = new LinkedList<>(tempQueue);
                tempQueue.clear();
            }
        }

        return array.stream().mapToInt(i -> i.val).toArray();

    }
}
