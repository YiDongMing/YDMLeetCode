package com.code.链表.反向打印链表;

import com.code.链表.两数相加.ListNode;

import java.util.ArrayList;

public class FXLBDI {

    //链表反转
    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ListNode pre = null;
        while (listNode != null){
            ListNode next = listNode.next;
            listNode.next = pre;
            pre = listNode;
            listNode = next;
        }
        ArrayList list = new ArrayList();
        while (pre != null){
            list.add(pre.val);
            pre = pre.next;
        }
        return list;
    }

    public static void main(String[] args) {

    }
}
