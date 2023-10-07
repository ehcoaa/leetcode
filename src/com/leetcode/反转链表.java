package com.leetcode;

import java.util.List;

public class 反转链表 {
    public ListNode reverseList(ListNode head) {

        ListNode pre = null;
        ListNode curr = head;

        while (curr!=null){
            ListNode node = curr.next;

            curr.next = pre;
            //向前移动
            pre = curr;
            curr = node;
        }
        return curr;
    }
}
