package com.jamison.jianzhi_offer.day10;
//https://leetcode.cn/problems/ba-shu-zi-fan-yi-cheng-zi-fu-chuan-lcof/?envType=study-plan&id=lcof&plan=lcof&plan_progress=4j3h5s1
public class TranslateNum {
    public int translateNum(int num) {
        String s = String.valueOf(num);
        int[] dp = new int[s.length()];
        dp[0] = 1;
        for(int i = 1; i < s.length(); i++) {
            if(s.charAt(i - 1) == '1' || (s.charAt(i - 1) == '2' && s.charAt(i) <= '5')) {
                if(i == 1) {
                    dp[i] = 2;
                }else {
                    dp[i] = dp[i - 2] + dp[i - 1];
                }
            }else {
                dp[i] = dp[i - 1];
            }
        }

        return dp[s.length() - 1];
    }
}
