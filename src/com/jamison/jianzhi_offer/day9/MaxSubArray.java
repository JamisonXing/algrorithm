package com.jamison.jianzhi_offer.day9;
//https://leetcode.cn/problems/lian-xu-zi-shu-zu-de-zui-da-he-lcof/solution/mian-shi-ti-42-lian-xu-zi-shu-zu-de-zui-da-he-do-2/

public class MaxSubArray {
    public int maxSubArray(int[] nums) {
        int res = nums[0];
        for(int i = 1; i  < nums.length; i++) {
            nums[i] += Math.max(nums[i - 1], 0);
            res = Math.max(nums[i], res);
        }
        return res;
    }
}
