package com.jamison.jianzhi_offer.day23;

class CuttingRope {
    public int cuttingRope(int n) {
        // dp[i]表示长度为i的绳子被剪成m段，每段乘机的最大值
        int[] dp = new int[n+1];
        // 因为m>1，所以dp[2] = 1而不是2
        dp[2] = 1;
        // i表示绳子长度
        for (int i=3;i<=n;++i){
            // i-j >= 2。j代表第一次剪掉的长度，剪掉1没用，所以从2开始，剩余的长度i-j怎么减直接取dp[i-j]
            for (int j=1;j<=i-2;++j){
                // 这里因为m>1，所以dp[2] = 1而不是2，dp[3]不能是dp[2] * 1，这样答案是1，错误.
                // 因此下面要添加Math.max(dp[i-j], i-j)。
                dp[i] = Math.max(Math.max(dp[i-j], i-j) * j, dp[i]);
            }
        }
        return dp[n];
    }
}