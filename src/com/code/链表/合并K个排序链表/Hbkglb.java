package com.code.链表.合并K个排序链表;

import com.code.链表.合并K个排序链表.ListNode;

public class Hbkglb {

    public ListNode mergeKLists(ListNode[] lists) {
        ListNode list = null;
        for(ListNode listNode : lists){
            list = mergeTwoLists(list,listNode);
        }
        return list;
    }

    public ListNode mergeTwoLists(ListNode a, ListNode b){
        if(a == null || b ==null){
            return a == null ? b : a;
        }

        ListNode head = new ListNode(0);
        ListNode tail = head,aPtr = a,bPtr = b;
        while (aPtr != null && bPtr != null){
            if(aPtr.val < bPtr.val){
                tail.next = aPtr;
                aPtr = aPtr.next;
            }else{
                tail.next = bPtr;
                bPtr = bPtr.next;
            }
            tail = tail.next;
        }
        tail.next = (aPtr != null ? aPtr : bPtr);
        return  head.next;
    }
}
