package src.合并两个排序链表;

import org.junit.Test;

/**
 * @author liudingding
 * @ClassName Solution2
 * @description
 * 把list2往list1里面插
 * 1、比较list1与list2的值，当list2的值小于等于list1的值，插在list1的前面
 * 并让list2的值指向下一个节点，否则不进行插入，list1指向下一个节点
 * 2、重复上述操作，知道有一个链表为空
 * 3、判断是哪个链表空了，如果是list2则说明list2已经全部插入到list1，直接返回list1的头结点
 * 即可。如果是list1空了，将剩下的list2的节点直接连到list1的尾部。
 * @date 2019/11/20 16:32
 * Version 1.0
 */
public class Solution2 {

    public ListNode Merge(ListNode list1,ListNode list2) {
        //这是最后一次递归调用返回的结果
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        if (list1.val <= list2.val) {
            //当我们第二次递归调用的时候list1 = "ListNode{val=3, next=null}"
            //当我们第三次递归调用的时候list1 = null,
            //第三次递归调用的结果是list2 = ListNode{val=4, next=ListNode{val=5, next=ListNode{val=6, next=null}}}
            list1.next = Merge(list1.next, list2);
            //这是每一次递归调用返回的结果(除开最后一次)
            return list1;
        } else {
            list2.next = Merge(list1, list2.next);
            //这是每一次递归调用返回的结果(除开最后一次)
            return list2;
        }
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
