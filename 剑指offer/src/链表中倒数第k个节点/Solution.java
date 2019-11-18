package src.链表中倒数第k个节点;

import org.junit.Test;

/**
 * @author liudingding
 * @ClassName Solution
 * @description
 * 题目描述：
 * 输入一个链表，输出该链表中倒数第k个结点
 * 解题思路：
 * 设链表的长度为 N。设置两个指针 P1 和 P2，先让 P1 移动 K 个节点，则还有 N - K 个节点可以移动。
 * 此时让 P1 和 P2 同时移动，可以知道当 P1 移动到链表结尾时，P2 移动到第 N - K 个节点处，
 * 该位置就是倒数第 K 个节点。
 * @date 2019/11/18 8:50
 * Version 1.0
 */
public class Solution {

    public ListNode FindKthToTail(ListNode head,int k) {
        if (head == null) {
            return null;
        }
        ListNode p1 = head;
        while (k-- > 0 && p1 != null) {
            p1 = p1.next;
        }
        //考虑边界情况，当快指针一定要移动到链表的最后一个节点即空节点
        //后面的循环判断 p1!=null 就不会移动p2直接将p2返回出去。
        if (k >= 0) {
            return null;
        }
        ListNode p2 = head;
        while (p1 != null) {
            p1 = p1.next;
            p2 = p2.next;
        }
        return p2;
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
        System.out.println(listNode1);
        System.out.println(FindKthToTail(listNode1, 6));
    }
}
