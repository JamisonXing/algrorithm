package com.jamison.jianzhi_offer.day17;

import com.jamison.jianzhi_offer.day15.TreeNode;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class MaxDepth {
    public int maxDepth(TreeNode root) {
        if(root == null) {return 0;}
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}