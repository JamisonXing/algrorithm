package com.jamison.jianzhi_offer.day13;

/**
 * @author jamison
 * <a href="https://leetcode.cn/problems/fan-zhuan-dan-ci-shun-xu-lcof/solution/mian-shi-ti-58-i-fan-zhuan-dan-ci-shun-xu-shuang-z/">...</a>
 */
public class ReverseWords {
    /**
     * 方法1：双指针
     * @param s
     * @return
     */
    public String reverseWords(String s) {
        //去掉首位空格
        s = s.trim();
        int j = s.length() - 1, i = j;
        StringBuilder res = new StringBuilder();
        while(i >= 0) {
            //搜索第一个空格
            while(i >= 0 && s.charAt(i) != ' '){
                i--;
            }
            res.append(s.substring(i + 1, j + 1) + " ");
            //跳过单词间的空格
            while(i >= 0 && s.charAt(i) == ' '){
                i--;
            }
            j = i;
        }
        return res.toString().trim();
    }
}

