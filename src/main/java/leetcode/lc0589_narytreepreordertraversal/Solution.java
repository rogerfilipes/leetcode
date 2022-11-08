package leetcode.lc0589_narytreepreordertraversal;


import leetcode.common.Node;

import java.util.ArrayList;
import java.util.List;

/**
 * 589. N-ary Tree Preorder Traversal <a href="https://leetcode.com/problems/n-ary-tree-preorder-traversal"/>
 * <p>
 * Given the root of an n-ary tree, return the preorder traversal of its nodes' values.
 * <p>
 * Nary-Tree input serialization is represented in their level order traversal. Each group of children is separated by the null value (See examples)
 */
public class Solution {
    List<Integer> discovered = new ArrayList<>();

    public List<Integer> preorder(Node root) {
        if (root == null)
            return discovered;

        discovered.add(root.val);
        for (Node children : root.children) {
            preorder(children);
        }

        return discovered;
    }


}
