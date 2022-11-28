package com.jamison.jianzhi_offer.day11;
//https://leetcode.cn/problems/lian-biao-zhong-dao-shu-di-kge-jie-dian-lcof/?envType=study-plan&id=lcof&plan=lcof&plan_progress=4j3h5s1
public class GetKthFromEnd {
    //双指针
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode fast = head, slow = head;
        int t = 0;
        while(fast != null) {
            if(t >= k) slow = slow.next;
            fast = fast.next;
            t++;
        }
        if(t < k) {
            return head;
        }
        return slow;
    }
}
