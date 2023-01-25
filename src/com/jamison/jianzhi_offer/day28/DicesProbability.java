package com.jamison.jianzhi_offer.day28;

import java.util.Arrays;

/**
 * <a href="https://leetcode.cn/problems/nge-tou-zi-de-dian-shu-lcof/solution/jian-zhi-offer-60-n-ge-tou-zi-de-dian-sh-z36d/">...</a>
 * @author jamison
 * 不太懂
 */
class DicesProbability {
    public double[] dicesProbability(int n) {
        double[] dp = new double[6];
        Arrays.fill(dp, 1.0 / 6.0);
        for(int i = 2; i <= n; i++) {
            double[] tmp = new double[5 * i + 1];
            for(int j = 0; j < dp.length; j++) {
                for(int k = 0; k < 6; k++) {
                    tmp[j + k] += dp[j] / 6.0;
                }
            }
            dp = tmp;
        }
        return dp;
    }
}
