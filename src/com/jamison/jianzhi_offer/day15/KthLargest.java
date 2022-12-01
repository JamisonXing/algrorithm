package com.jamison.jianzhi_offer.day15;

/**
 * @@author jamison
 * <a href="https://leetcode.cn/problems/er-cha-sou-suo-shu-de-di-kda-jie-dian-lcof/solution/mian-shi-ti-54-er-cha-sou-suo-shu-de-di-k-da-jie-d/">...</a>
 */
class KthLargest {
    int k = 0, res = 0;
    public int kthLargest(TreeNode root, int k) {
        if(root == null) {
            return 0;
        }
        this.k = k;
        TreeNode cur = root;
        dfs(cur);
        return res;
    }

    private void dfs(TreeNode cur) {
        if(cur == null) {
            return;
        }
        dfs(cur.right);
        if(k == 0){return;}
        if(--k == 0) {
            res = cur.val;
        };
        dfs(cur.left);
    }
}