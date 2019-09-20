package 单链表;

/**
 * @Description
 * @Author liugongding
 * @Date 2019-09-19
 */
public class LinkedList {
    private int size;
    private Node first; //头结点
    private Node last;  //尾节点

    public LinkedList() {
    }

    public int getSize() {
        return size;
    }

    /**
     * 查看数据域在那个节点
     *
     * @param index
     * @return
     */
    public Node get(int index) {
        Node temp = first;
        for (int i = 0; i < index; i++) {
            if (temp.getData() == index) {
                return temp;
            }
            temp = temp.getNextNode();
        }
        return temp;
    }

    public Node getNodeByIndex(int index) {
        //创建一个计数器、标识当前节点的位置
        int count = 1;
        Node temp = first;
        while (temp.getNextNode() != null) {
            //查询节点位置等于当前节点位置就输出
            if (index == count++) {
                System.out.println(temp);
            }
            temp = temp.getNextNode();
        }
        return temp;
    }

    public void printElement() {
        Node currentNode = first;
        for (int i = 0; i < size; i++) {
            System.out.println(currentNode.getData());
            currentNode = currentNode.getNextNode();
            if (currentNode == null) {
                break;
            }
        }
    }

    /**
     * 链表插入第一个元素时、头和尾是同一个节点
     *
     * @param element
     */
    private void oneNode(int element) {
        Node newNode = new Node(element);
        newNode.nextNode = first;
        first = newNode;
        last = first;
    }

    /**
     * 链表只剩一个节点
     */
    private void clear() {
        first = null;
        last = null;
        size = 0;
    }

    /**
     * 尾插法
     *
     * @param element
     */
    public void addTail(int element) {
        if (size == 0) {
            oneNode(element);
        } else {
            Node node = new Node();
            node.setData(element);
            last.setNextNode(node);
            last = node;
        }
        size++;
    }

    /**
     * 从中间插入元素
     *
     * @param index   插入的位置
     * @param element 插入的值
     */
    public void addMiddle(int index, int element) {

        if (index < 1 || index > getSize() + 1) {
            throw new RuntimeException("插入位置不合法");
        } else {
            //记录遍历位置
            int count = 1;
            Node newNode = new Node(element);
            Node currentNode = first;
            Node nextNode = first.getNextNode();
            Node previousNode = null;
            while (currentNode.getNextNode() != null) {
                if (index == count++) {
                    //新增节点的后继节点就是当前节点
                    newNode.nextNode = currentNode;
                    //当前节点前驱节点的下一个节点就是新增节点
                    previousNode.nextNode = newNode;
                    size++;
                    return;
                }
                //指针向前移动一位、我们把上一次的当前节点设置为下一个节点的前驱节点
                previousNode = currentNode;
                //把上一次的后继节点的下一个节点设置为指针移动的后继节点
                nextNode = nextNode.getNextNode();
                //指针移动
                currentNode = currentNode.getNextNode();
            }
        }
    }

    public void removeNode(int index) {
        if (index < 1 || index > getSize()) {
            throw new RuntimeException("插入位置不合法");
        } else {
            int count = 1;
            Node currentNode = first;   //头结点
            Node previousNode = null;   //头结点的前驱节点
            Node nextNode = first.getNextNode(); //头结点的后继节点
            while (currentNode.getNextNode() != null) {
                if (index == count++) {
                    //被删除的节点的前驱节点的下一个节点就是被删除节点的后继节点
                    previousNode.nextNode = nextNode;
                    size--;
                    return;
                }
                //指针向前移动一位、我们把上一次的当前节点设置为下一个节点的前驱节点
                previousNode = currentNode;
                //把上一次的后继节点的下一个节点设置为指针移动的后继节点
                nextNode = nextNode.getNextNode();
                currentNode = currentNode.getNextNode();
            }
        }

    }

}
