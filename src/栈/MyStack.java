package 栈;

/**
 * @Description
 * @Author liugongding
 * @Date 2019-09-18
 */
public class MyStack {

    //栈的底层用数组来实现
    int[] elements;

    public MyStack() {
        this.elements = new int[0];
    }

    //压入栈底
    public void push(int element) {
        int[] newArr = new int[elements.length + 1];
        for (int i = 0; i < elements.length; i++) {
            newArr[i] = elements[i];
        }
        newArr[elements.length] = element;
        elements = newArr;
    }

    //取出栈顶元素
    public int get(){
        if (elements.length == 0) {
            throw new RuntimeException("stack is empty");
        }
        //取出数组最后一个元素
        int element = elements[elements.length - 1];
        //创建一个新数组
        int[] newArr = new int[elements.length - 1];
        //原数组中除了最后一个元素，其他元素都放入新数组中
        for (int i = 0; i < elements.length - 1; i++) {
            newArr[i] = elements[i];
        }
        //将原来的引用指向新的
        elements = newArr;
        return element;
    }

    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);

        System.out.println(myStack.get());
//        System.out.println(myStack.get());
//        System.out.println(myStack.get());
    }
}
