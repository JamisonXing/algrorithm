package com.jamison.jianzhi_offer.day13;

/**
 * @author jamison
 * <a href="https://leetcode.cn/problems/he-wei-sde-liang-ge-shu-zi-lcof/solution/mian-shi-ti-57-he-wei-s-de-liang-ge-shu-zi-shuang-/">...</a>
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int i = 0, j = nums.length - 1;
        while(i < j) {
            int s = nums[i] + nums[j];
            if(s > target) {
                j--;
            }else if(s < target) {
                i++;
            }else{
                return new int[]{nums[i], nums[j]};
            }
        }
        return null;
    }
}
