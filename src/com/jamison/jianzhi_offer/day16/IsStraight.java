package com.jamison.jianzhi_offer.day16;

import java.util.HashSet;
import java.util.Set;

/**
 * @author jamison
 * https://leetcode.cn/problems/bu-ke-pai-zhong-de-shun-zi-lcof/solution/mian-shi-ti-61-bu-ke-pai-zhong-de-shun-zi-ji-he-se/
 */
class IsStraight {
    public boolean isStraight(int[] nums) {
        Set<Integer> repeat = new HashSet<>();
        int max = 0, min = 14;
        for(int num : nums) {
            if(num == 0) {continue;}
            max = Math.max(max, num);
            min = Math.min(min, num);
            if(repeat.contains(num)) {return false;}
            repeat.add(num);
        }
        return max - min < 5;

    }
}
