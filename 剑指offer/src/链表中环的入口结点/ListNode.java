package src.链表中环的入口结点;

/**
 * @author liudingding
 * @ClassName ListNode
 * @description
 * @date 2019/12/25 20:24
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
