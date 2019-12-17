package src.两个链表的第一个公共节点;

import org.junit.Test;

/**
 * @author liudingding
 * @ClassName Solution
 * @description
 * 题目描述：
 * 输入两个链表，找出它们的第一个公共结点

 * 解题思路；
 * 将链表A依次访问到尾部，然后从头再开始访问
 * 将链表B依次访问到尾部，然后从头再开始访问
 * 如果他们存在公共结点，必然在有限时间内能找到公共结点
 *
 * 缺点：如果链表太长，时间复杂度太高
 * @date 2019/12/15 17:19
 * Version 1.0
 */
public class Solution {

    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        ListNode l1 = pHead1, l2 = pHead2;
        while (l1 != l2) {
            l1 = l1.next;
            l2 = l2.next;
            if (l1 != l2) {
                if (l1 == null) {
                    l1 = pHead1;
                }
                if (l2 == null) {
                    l2 = pHead2;
                }
            }
        }
        return l1;
    }

    @Test
    public  void test(){
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = new ListNode(5);
        ListNode listNode6 = new ListNode(6);
        ListNode listNode7 = new ListNode(7);
        ListNode listNode8 = new ListNode(8);

        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;

        listNode5.next = listNode6;
        listNode6.next = listNode7;
        listNode7.next = listNode8;
        listNode8.next = listNode3;
        System.out.println(FindFirstCommonNode(listNode1, listNode5));

    }
}
