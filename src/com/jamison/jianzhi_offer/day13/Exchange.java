package com.jamison.jianzhi_offer.day13;

/**
 * @author jamison
 * <a href="https://leetcode.cn/problems/diao-zheng-shu-zu-shun-xu-shi-qi-shu-wei-yu-ou-shu-qian-mian-lcof/solution/mian-shi-ti-21-diao-zheng-shu-zu-shun-xu-shi-qi-4/">...</a>
 */
public class Exchange {
    public int[] exchange(int[] nums) {
        int i = 0, j = nums.length - 1;
        while(i < j) {
            while(i < j && (nums[i] & 1) == 1) {
                i++;
            }
            while(i < j && (nums[j] & 1) == 0) {
                j--;
            }
            int tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
        }

        return nums;
    }
}
