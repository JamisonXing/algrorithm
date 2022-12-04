package com.jamison.carl.bilibili;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

/**
 * @author jamison
 * leetcode 347
 * https://leetcode.cn/problems/top-k-frequent-elements/solution/by-carlsun-2-hybi/
 */
class TopKFrequent {
    public int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
        //根据value的值，建立大顶堆
        PriorityQueue<Map.Entry<Integer, Integer>> queue = new PriorityQueue<>(
                (o1, o2) -> o2.getValue() - o1.getValue()
        );
        for(Map.Entry<Integer, Integer> entry : entries) {
            queue.offer(entry);
        }


        for(int i = k - 1; i >= 0; i--) {
            result[i] = queue.poll().getKey();
        }

        return result;
    }
}
