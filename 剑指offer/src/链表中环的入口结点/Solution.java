package src.链表中环的入口结点;

import org.junit.Test;


/**
 * @author liudingding
 * @ClassName Solution
 * @description
 * 题目描述：
 * 给一个链表，若其中包含环，请找出该链表的环的入口结点，否则，输出null
 *
 * 解题思路
 * 使用双指针，一个指针 fast 每次移动两个节点，一个指针 slow 每次移动一个节点。因为存在环，所以两个指针必定相遇在环中的某个节点上。
 * 假设相遇点在下图的 z1 位置，此时 fast 移动的节点数为 x+2y+z，slow 为 x+y，由于 fast 速度比 slow 快一倍，因此 x+2y+z=2(x+y)，
 * 得到 x=z。在相遇点，slow 要到环的入口点还需要移动 z 个节点，如果让 fast 重新从头开始移动，并且速度变为每次移动一个节点，
 * 那么它到环入口点还需要移动 x 个节点。在上面已经推导出 x=z，因此 fast 和 slow 将在环入口点相遇。
 *
 * 如何判断有环的存在？
 * 在追及问题中，我们可以用两个速度不同的物体从同一地点出发，如果相遇则证明存在环（可用反证法证明，若不存在环，则速度不同的物体从同一地点出发则一定不会相遇），因此可以类比过来，定义两个指针fast、slow，令两指针以不同速度向后指，则相遇时证明有环存在，若fast指向NULL，则不存在环。
 *
 * 怎么找到环的入口结点？
 * 首先说方法：在问题一中两指针相遇后，让一个指针从头结点开始，另一个从相遇结点开始，并以相同速度向后指，再次相遇时就是环的入口结点。
 * @date 2019/12/25 20:24
 * Version 1.0
 */
public class Solution {

    public ListNode EntryNodeOfLoop(ListNode pHead) {
        if (pHead == null|| pHead.next == null) {
            return null;
        }
        ListNode fast = pHead;
        ListNode slow = pHead;
        do {
            fast = fast.next.next.next;
            slow = slow.next;
        } while (fast.val != slow.val);
        fast = pHead;
        while (fast.val != slow.val){
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }

    public ListNode EntryNodeOfLoop1(ListNode pHead) {
        if (pHead == null || pHead.next == null)
            return null;
        ListNode slow = pHead, fast = pHead;
        do {
            fast = fast.next.next;
            slow = slow.next;
        } while (slow != fast);
        fast = pHead;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
    @Test
    public void test(){
        ListNode x1 = new ListNode(1);
        ListNode x2 = new ListNode(2);
        ListNode y1 = new ListNode(3);
        ListNode y2 = new ListNode(4);
        ListNode y3 = new ListNode(5);
        ListNode y4 = new ListNode(6);
        ListNode z1 = new ListNode(7);
        ListNode z2 = new ListNode(8);

        x1.next = x2;
        x2.next = y1;
        y1.next = y2;
        y2.next = y3;
        y3.next = y4;
        y4.next = z1;
        z1.next = z2;
        z2.next = y1;

        ListNode a = EntryNodeOfLoop1(x1);
        System.out.println(a);
    }
}
