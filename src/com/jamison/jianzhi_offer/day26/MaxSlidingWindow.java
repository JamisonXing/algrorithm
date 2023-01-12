package com.jamison.jianzhi_offer.day26;

import java.util.LinkedList;

/**
 * <a href="https://leetcode.cn/problems/hua-dong-chuang-kou-de-zui-da-zhi-lcof/solution/dong-hua-yan-shi-dan-diao-dui-lie-jian-z-unpy/">...</a>
 */
class MaxSlidingWindow {
    public int[] maxSlidingWindow(int[] nums, int k) {
        //窗口个数
        int[] res = new int[nums.length - k + 1];
        LinkedList<Integer> queue = new LinkedList<>();

        //遍历数组中的元素，right表示滑动窗口右边界
        for(int right = 0; right < nums.length; right++) {
            //如果队列不为空且当前考察元素大于等于队尾元素，则将队尾移除
            //直到，队列为空或者当前考察元素小于新的队尾元素
            while(!queue.isEmpty() && nums[right] >= nums[queue.peekLast()]) {
                queue.removeLast();
            }

            //存储元素下标
            queue.addLast(right);

            //计算窗口左边界
            int left = right - k + 1;
            //当队首元素的下标小于滑动窗口的左边界时
            //表示队首元素已经不再滑动窗口内，因此将其从队首移除
            if(queue.peekFirst() < left) {
                queue.removeFirst();
            }

            //由于数组小标从0开始，因此当窗口右边界right + 1大于等于窗口大小k时
            //意味着窗口形成。此时，队首元素就是该窗口内最大的
            if(right + 1 >= k) {
                res[left] = nums[queue.peekFirst()];
            }
        }
        return res;
    }
}
