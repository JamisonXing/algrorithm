package com.jamison.jianzhi_offer.day19;

import com.jamison.jianzhi_offer.day15.TreeNode;

import java.util.HashMap;

/**
 * 没搞懂
 * <a href="https://leetcode.cn/problems/zhong-jian-er-cha-shu-lcof/solution/mian-shi-ti-07-zhong-jian-er-cha-shu-di-gui-fa-qin/">...</a>
 */
class BuildTree {
    int[] preorder;
    HashMap<Integer, Integer> dic = new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        this.preorder = preorder;
        for(int i = 0; i < inorder.length; i++) {
            dic.put(inorder[i], i);
        }
        return recur(0, 0, inorder.length - 1);
    }

    TreeNode recur(int root, int left, int right) {
        if(left > right) {
            return null;
        }
        TreeNode node = new TreeNode(preorder[root]);
        int i = dic.get(preorder[root]);
        node.left = recur(root + 1, left, i - 1);
        node.right = recur(root + i - left + 1, i + 1, right);
        return node;
    }
}