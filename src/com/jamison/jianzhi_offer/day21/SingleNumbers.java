package com.jamison.jianzhi_offer.day21;

/**
 * 没看懂
 * https://leetcode.cn/problems/shu-zu-zhong-shu-zi-chu-xian-de-ci-shu-lcof/solution/jian-zhi-offer-56-i-shu-zu-zhong-shu-zi-tykom/
 */
class SingleNumbers {
    public int[] singleNumbers(int[] nums) {
        int x = 0, y = 0, n = 0, m = 1;
        // 1. 遍历异或
        for(int num : nums)
            n ^= num;
        // 2. 循环左移，计算 m
        while((n & m) == 0)
            m <<= 1;
        // 3. 遍历 nums 分组
        for(int num: nums) {
            // 4. 当 num & m != 0
            if((num & m) != 0) x ^= num;
                // 4. 当 num & m == 0
            else y ^= num;
        }
        // 5. 返回出现一次的数字
        return new int[] {x, y};
    }
}