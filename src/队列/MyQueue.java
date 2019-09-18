package 队列;

/**
 * @Description
 * @Author liugongding
 * @Date 2019-09-18
 */
public class MyQueue {
    int[] elements;

    public MyQueue() {
        elements = new int[0];
    }

    //入队
    public void add(int element) {

        int[] newArr = new int[elements.length + 1];
        //将原数组复制到新数组
        for (int i = 0; i < elements.length; i++) {
            newArr[i] = elements[i];
        }
        //将元素添加到新数组
        newArr[elements.length] = element;
        elements = newArr;
    }

    //出队
    public int get() {
        //将数组的第0个元素取出来
        int element = elements[0];
        int[] newArr = new int[elements.length - 1];

        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = elements[i+1];
        }
        //替换数组
        elements = newArr;
        return element;
    }

    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();

        myQueue.add(9);
        myQueue.add(8);
        System.out.println(myQueue.get());
        myQueue.add(7);

        System.out.println(myQueue.get());
        System.out.println(myQueue.get());
    }
}
