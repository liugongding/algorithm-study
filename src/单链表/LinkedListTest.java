package 单链表;

import org.junit.Test;

/**
 * @Description
 * @Author liugongding
 * @Date 2019-09-19
 */
public class LinkedListTest {

    @Test
    public void addTail() {
        LinkedList linkedList = new LinkedList();
        linkedList.addTail(1);
        linkedList.addTail(2);
        linkedList.addTail(3);
        linkedList.addTail(4);
        linkedList.addTail(5);

//        linkedList.removeNode(3);
//        linkedList.addMiddle(3,99);
        linkedList.printElement();
    }

    @Test
    public void addHead(){
        LinkedList linkedList = new LinkedList();
        linkedList.addHead(9);
        linkedList.addHead(8);
        linkedList.addHead(7);
        linkedList.printElement();

    }
}
