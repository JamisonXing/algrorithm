package com.jamison.jianzhi_offer.day18;

import com.jamison.jianzhi_offer.day15.TreeNode;

/**
 * @author jamison
 * <a href="https://leetcode.cn/problems/er-cha-shu-de-zui-jin-gong-gong-zu-xian-lcof/solution/mian-shi-ti-68-ii-er-cha-shu-de-zui-jin-gong-gon-7/">...</a>
 */
public class LowestCommonAncestor2 {
    public TreeNode lowestCommonAncestor2(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || root == p || root == q) {
            return root;
        }
        TreeNode left = lowestCommonAncestor2(root.left, p, q);
        TreeNode right = lowestCommonAncestor2(root.right, p, q);
        if(left == null) {
            return right;
        }
        if(right == null) {
          return left;
        }
        return root;
    }
}
