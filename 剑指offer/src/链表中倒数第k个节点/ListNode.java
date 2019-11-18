package src.链表中倒数第k个节点;

/**
 * @author liudingding
 * @ClassName ListNode
 * @description
 * @date 2019/11/18 8:51
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
