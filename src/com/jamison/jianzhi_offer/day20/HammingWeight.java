package com.jamison.jianzhi_offer.day20;

/**
 * @author jamison
 * <a href="https://leetcode.cn/problems/er-jin-zhi-zhong-1de-ge-shu-lcof/solution/mian-shi-ti-15-er-jin-zhi-zhong-1de-ge-shu-wei-yun/">...</a>
 */
public class HammingWeight {
    /**
     * you need to treat n as an unsigned value
     */
    public int hammingWeight(int n) {
        //逐位判断
        int res = 0;
        while(n != 0) {
            n = n & (n - 1);
            res++;
        }
        return res;
    }
}
