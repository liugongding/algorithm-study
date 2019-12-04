package src.复杂链表的复制;

/**
 * @author liudingding
 * @ClassName RandomListNode
 * @description
 * @date 2019/12/3 14:37
 * Version 1.0
 */
public class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return "RandomListNode{" +
                "label=" + label +
                ", next=" + next +
                ", random=" + random +
                '}';
    }
}
