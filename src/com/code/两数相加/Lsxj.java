package com.code.两数相加;

public class Lsxj {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode sumListNode = new ListNode(0);
        ListNode p = l1, q = l2, curr = sumListNode;
        int carry = 0;
        while (p != null || q != null || carry != 0){
            int x = (p != null) ? p.val:0;
            int y = (q != null) ? q.val:0;
            int sum = carry + x + y;
            carry = sum / 10 ;
            curr.next = new ListNode(sum % 10 );
            curr = curr.next;
            if( p != null){
                p = p.next;
            }
            if( q != null){
                q = q.next;
            }
        }
        return sumListNode.next;
    }

    public static void main(String[] args) {
        ListNode p = new ListNode(1);
        p.next = new ListNode(1);
        ListNode q = new ListNode(8);
        q.next = new ListNode(3);
        ListNode listNode = addTwoNumbers(p, q);
        while (listNode != null){
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }

}
