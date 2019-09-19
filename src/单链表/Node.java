package 单链表;

/**
 * @Description 一个节点
 * @Author liugongding
 * @Date 2019-09-18
 */
public class Node {

    //节点内容
    int data;
    //下一个节点
    Node nextNode;

    public Node(int value) {
        this.data = value;
    }
    public int getData() {
        return data;
    }

    public Node append(Node node) {
        Node currentNode = this;
        while (true) {
            //判断当前节点有没有下一个节点
            Node next = currentNode.nextNode;
            if (next == null) {
                break;
            }
            //如果有，把引用向前一位
            currentNode = next;
        }
        //当前节点保存着下一个节点的地址
        currentNode.nextNode = node;
        //返回当前节点
        return this;
    }

    public Node getNextNode() {
        return this.nextNode;
    }


    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        //把node2的地址添加到node1
        node1.append(node2);
        //把node3的地址添加到node2
        node2.append(node3);
        System.out.println(node1.getData());
        System.out.println(node1);
        System.out.println(node1.getNextNode().getNextNode().getData());

        System.out.println("================");
        node1.append(node2).append(node3);
        System.out.println(node3.getNextNode());
    }
}
