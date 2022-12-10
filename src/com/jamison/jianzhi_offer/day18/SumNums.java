package com.jamison.jianzhi_offer.day18;

/**
 * @author jamison
 * <a href="https://leetcode.cn/problems/qiu-12n-lcof/solution/mian-shi-ti-64-qiu-1-2-nluo-ji-fu-duan-lu-qing-xi-/">...</a>
 * 利用运算符短路效应
 */
public class SumNums {
    public int sumNums(int n) {
        boolean x = n > 1 && (n += sumNums(n - 1)) > 0;
        return n;
    }
}
