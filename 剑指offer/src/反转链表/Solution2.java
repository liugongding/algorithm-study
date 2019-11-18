package src.反转链表;

import org.junit.Test;

/**
 * @author liudingding
 * @ClassName Solution2
 * @description
 * @date 2019/11/18 16:56
 * Version 1.0
 */
public class Solution2 {

    /**
     * 头插法
     * @param head
     * @return
     */
    public ListNode ReverseList1(ListNode head) {
        ListNode newList = new ListNode(-1);
        while (head != null) {
            ListNode next = head.next;
            //这里并不是说head的下一个节点等于多少
            //而是newList的下一个节点赋值给head的下一个节点
            head.next = newList.next;
            //newList的下一个节点始终是头结点
            //因为链表中我们没有定义一个头结点，所以我们始终把 newList 的下一个节点定义为头结点
            newList.next = head;
            head = next;
        }
        return newList.next;
    }

    @Test
    public void test(){
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = new ListNode(5);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
        System.out.println(ReverseList1(listNode1));
    }
}
