package com.code.链表.删除链表的第K个节点;

import com.code.链表.两数相加.ListNode;

public class DeleteNNode {

    public static Integer removeFromList(ListNode head, int k) {
        if(k == 0){
            return head.val;
        }
        ListNode node = head;
        int len = 0;
        while(node.next !=null){
            len++;
            node = node.next;
        }
        if(k>0){
            int flag = 0;
            while (node.next != null){
                flag++;
                if(k == flag){
                    return node.val;
                }
                node = node.next;
            }
        }else{
            int flag = 0;
            int out = len + k;
            while (node.next != null){
                flag++;
                if(out == flag){
                    return node.val;
                }
                node = node.next;
            }
        }

        return null;
    }
}
