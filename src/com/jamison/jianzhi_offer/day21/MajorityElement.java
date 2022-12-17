package com.jamison.jianzhi_offer.day21;

/**
 * <a href="https://leetcode.cn/problems/shu-zu-zhong-chu-xian-ci-shu-chao-guo-yi-ban-de-shu-zi-lcof/solution/mian-shi-ti-39-shu-zu-zhong-chu-xian-ci-shu-chao-3/">...</a>
 */
class MajorityElement {
    public int majorityElement(int[] nums) {
        int x = 0, votes = 0;
        for(int num : nums) {
            if(votes == 0) {
                x = num;
            }
            votes += num == x ? 1 : -1;
        }
        return x;
    }
}