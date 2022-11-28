package com.jamison.jianzhi_offer.day11;
//https://leetcode.cn/problems/shan-chu-lian-biao-de-jie-dian-lcof/?envType=study-plan&id=lcof&plan=lcof&plan_progress=4j3h5s1
public class DeleteNode {
    public ListNode deleteNode(ListNode head, int val) {
        if(head.val == val) return head.next;
        ListNode pre = head, cur = head.next;

        while(cur.next != null && cur.val != val) {
            pre = cur;
            cur = cur.next;
        }

        if(cur != null) {
            pre.next = cur.next;
        }

        return head;
    }
}
