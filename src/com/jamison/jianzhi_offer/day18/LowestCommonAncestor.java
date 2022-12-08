package com.jamison.jianzhi_offer.day18;

import com.jamison.jianzhi_offer.day15.TreeNode;

class LowestCommonAncestor {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        while(root != null) {
            //都在右子树中
            if(root.val < p.val && root.val < q.val) {
                root = root.right;
            }else if(root.val > p.val && root.val > q.val) {
                root = root.left;
            }else {
                break;
            }
        }

        return root;
    }
}