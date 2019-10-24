package src.从尾到头打印链表;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liudingding
 * @ClassName PrintListFromTailToHead
 * @description
 * @date 2019/10/12 20:50
 * Version 1.0
 */
public class PrintListFromTailToHead {

    //链表作为入参
    public  ArrayList<Integer> printListFromTailToHead1(ArrayList<Integer> arrayList) {
        ArrayList<Integer> newArrayList = new ArrayList<>();
//            arrayList.forEach(item -> {
//                newArrayList.add(0,item);
//            });
        for (int i = 0; i < arrayList.size(); i++) {
            newArrayList.add(0,arrayList.get(i));
        }
        newArrayList.forEach(item -> System.out.println(item));
        return newArrayList;
    }

    @Test
    public  void testprintListFromTailToHea1() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
//        arrayList.forEach(item -> System.out.println(item));
        printListFromTailToHead1(arrayList);
    }

    //节点作为入参
    //这里我们没有ListNode的类
//    public  ArrayList<Integer> printListFromTailToHead2(ListNode listNode) {
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        while (listNode != null) {
//            arrayList.add(0, listNode.val);
//            listNode = listNode.next;
//        }
//        return arrayList;
//    }
}
