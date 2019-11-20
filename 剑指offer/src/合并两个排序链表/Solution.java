package src.合并两个排序链表;

import org.junit.Test;

/**
 * @author liudingding
 * @ClassName Solution
 * @description
 * 题目描述：
 * 输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则
 * 例如：输入
 * 1 -> 3 -> 5
 * 2 -> 4 -> 6
 * 输出：
 * 1 -> 2 -> 3 -> 4 -> 5 -> 6
 * 解题思路：
 * 将两个链表结点挨个进行比较，插入到一个新表中
 * @date 2019/11/20 14:29
 * Version 1.0
 */
public class Solution {

    /**
     * 说明：
     * 当比较5和6之后，5放在了新的链表中，但1 -> 3 -> 5的下一个节点为空
     * 也就是6是无法比较的，但之后的数字是依次单调递增的了，直接让新的链表的当前节点的下一个
     * 节点指向后面的节点
     *
     * 另外之所以把新链表的引用在复制一遍是因为需要一个临时节点表示当前节点
     * 也就是说当前节点会一直往后移动，最终变为null
     * @param list1
     * @param list2
     * @return
     */
    public ListNode Merge(ListNode list1,ListNode list2) {
        ListNode newList = new ListNode(-1);
        ListNode cur = newList;
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                cur.next = list1;
                list1 = list1.next;
            } else {
                cur.next = list2;
                list2 = list2.next;
            }
            cur = cur.next;
        }
        if (list1 != null) {
            cur.next = list1;
        }
        if (list2 != null) {
            cur.next = list2;
        }
        return newList.next;
    }


    @Test
    public void test(){
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(3);
        ListNode listNode3 = new ListNode(5);

        listNode1.next = listNode2;
        listNode2.next = listNode3;

        ListNode listNode4 = new ListNode(2);
        ListNode listNode5 = new ListNode(4);
        ListNode listNode6 = new ListNode(6);
        listNode4.next = listNode5;
        listNode5.next = listNode6;
        System.out.println(Merge(listNode1, listNode4));
    }
}
