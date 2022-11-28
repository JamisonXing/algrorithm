package com.jamison.jianzhi_offer.day7;

public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        return root == null ? true: recur(root.left, root.right);
    }

    private boolean recur(TreeNode l, TreeNode r) {
        if(l == null && r == null) return true;
        if(l == null || r == null || l.val != r.val) return false;
        return recur(l.left, r.right) && recur(l.right, r.left);
    }
}
