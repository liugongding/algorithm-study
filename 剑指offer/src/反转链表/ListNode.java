package src.反转链表;

/**
 * @author liudingding
 * @ClassName ListNode
 * @description
 * @date 2019/11/18 9:30
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
