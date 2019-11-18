package src.反转链表;

import org.junit.Test;

/**
 * @author liudingding
 * @ClassName Solution
 * @description
 * 题目秒速：
 * 输入一个链表，反转链表后，输出新链表的表头
 * 解题思路：
 * 链接：https://www.nowcoder.com/questionTerminal/75e878df47f24fdc9dc3e400ec6058ca?answerType=1&f=discussion
 * 来源：牛客网
 * 以3个节点为例：
 * 用pre记录当前节点的前一个节点
 * 用next记录当前节点的后一个节点
 * 1、当前节点a不为空，进入循环，先记录a的下一个节点位置next = b;再让a的指针指向pre
 * 2、移动pre和head的位置，正因为刚才记录了下一个节点的位置，所以该链表没有断，我们让head走向b的位置。
 * 3、当前节点为b不为空，先记录下一个节点的位置，让b指向pre的位置即a的位置，同时移动pre和head
 * 4、当前节点c不为空，记录下一个节点的位置，让c指向b，同时移动pre和head，此时head为空，跳出，返回pre。
 * @date 2019/11/18 9:30
 * Version 1.0
 */
public class Solution {
    public ListNode ReverseList(ListNode head) {
        //考虑链表为空或只有一个节点的情况
        if (head == null || head.next == null){
            return head;
        }
        //记录当前节点的上一个节点
        ListNode pre = null;
        //记录当前节点的下一个节点
        ListNode next = null;
        while (head != null) {
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
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
        System.out.println(ReverseList(listNode1));
    }
}
