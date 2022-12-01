package com.jamison.jianzhi_offer.day15;


import java.util.LinkedList;
import java.util.List;

/**
 * @author jamison
 * <a href="https://leetcode.cn/problems/er-cha-shu-zhong-he-wei-mou-yi-zhi-de-lu-jing-lcof/solution/mian-shi-ti-34-er-cha-shu-zhong-he-wei-mou-yi-zh-5/">...</a>
 */
class PathSum {
    LinkedList<List<Integer>> res = new LinkedList<>();
    LinkedList<Integer> path = new LinkedList<>();
    public List<List<Integer>> pathSum(TreeNode root, int target) {
        recur(root, target);
        return res;
    }

    private void recur(TreeNode root, int tar){
        if(root == null) {
            return;
        }
        path.add(root.val);
        tar -= root.val;
        if(tar == 0 && root.left == null && root.right == null) {
            res.add(new LinkedList(path));
        }
        recur(root.left, tar);
        recur(root.right, tar);
        path.removeLast();
    }
}