package src.两个栈实现一个队列;

import org.junit.Test;

import java.util.Stack;

/**
 * @author liudingding
 * @ClassName Solution
 * @description
 * 将元素入栈stack1
 * 将stack1的元素出栈后再入栈stack2
 * 然后stack2元素出栈后就还是stack1的入栈顺序，实现了一个先进先出的队列
 * @date 2019/10/24 13:58
 * Version 1.0
 */
public class Solution {

    //将元素入栈stack1
    Stack<Integer> stack1 = new Stack<>();
    //将stack1的元素出栈后再入栈stack2
    Stack<Integer> stack2 = new Stack<>();

    /**
     * 入栈操作
     * @param node
     */
    public void push(int node) {
        stack1.push(node);
    }

    /**
     * 出栈操作
     */
    public void pop() {
        if(stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                //把stack1的出栈顺序作为stack2的入栈顺序
                stack2.push(stack1.pop());
            }
        }
        while (!stack2.isEmpty()) {
            System.out.println(stack2.pop());
        }
    }

    @Test
    public void test(){
        //入栈顺序是 1,2
        for (int i = 1; i < 3; i++) {
            push(i);
        }
        pop();
    }
}
