package src.两个链表的第一个公共节点;

/**
 * @author liudingding
 * @ClassName ListNode
 * @description
 * @date 2019/12/15 17:19
 * Version 1.0
 */
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}
