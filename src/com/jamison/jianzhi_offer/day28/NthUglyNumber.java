package com.jamison.jianzhi_offer.day28;

/**
 * <a href="https://www.bilibili.com/video/BV1o541177He/?share_source=copy_web&vd_source=72c4cacd7237c3e04c39153a62aed182">...</a>
 * <a href="https://leetcode.cn/problems/chou-shu-lcof/solution/mian-shi-ti-49-chou-shu-dong-tai-gui-hua-qing-xi-t/">...</a>
 * @author jamison
 */
public class NthUglyNumber {
    public int nthUglyNumber(int n) {
        int a = 0, b = 0, c = 0;
        int[] dp = new int[n];
        dp[0] = 1;
        for(int i = 1; i < n; i++) {
            int n2 = dp[a] * 2, n3 = dp[b] * 3, n5 = dp[c] * 5;
            dp[i] = Math.min(Math.min(n2, n3), n5);
            if(dp[i] == n2) {
                a++;
            }
            if(dp[i] == n3) {
                b++;
            }
            if(dp[i] == n5) {
                c++;
            }
        }
        return dp[n - 1];
    }
}
