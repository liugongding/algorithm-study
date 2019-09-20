package 单链表;

/**
 * @Description 一个节点
 * @Author liugongding
 * @Date 2019-09-18
 */
public class Node {

    //节点内容,
    int data;
    //下一个节点
    Node nextNode;

    public Node() {

    }

    public Node(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", nextNode=" + nextNode +
                '}';
    }
}
