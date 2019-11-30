package src.包含min函数的栈;

import org.junit.Test;
import java.util.Stack;

/**
 * @author liudingding
 * @ClassName Solution
 * @description
 *
 * 题目描述：
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈中所含最小元素的min函数（时间复杂度应为O（1））
 * 函数介绍：
 * stack.peek();返回栈顶元素但不删除它
 * stack.push();将元素添加到栈中
 * 解题思路：
 * dataStack里面存入新添加的元素
 * 当新来的元素添加进dataStack之后，比较新来的元素和minStack的栈顶元素，将较小的元素
 * 继续添加进minStack
 * @date 2019/11/30 10:30
 * Version 1.0
 */
public class Solution {

    //存所有元素
    private Stack<Integer> dataStack = new Stack<>();
    //存加入新元素后，当前dataStack中对应的最小值
    private Stack<Integer> minStack = new Stack<>();

    /**
     * 添加和删除元素都是在栈顶
     * @param node
     */
    public void push(int node) {
        dataStack.push(node);
        minStack.push(minStack.isEmpty() ? node : Math.min(minStack.peek(), node));
    }

    /**
     * 删除栈顶元素
     */
    public void pop() {
        dataStack.pop();
        minStack.pop();
    }

    /**
     * 取出栈顶元素
     * @return
     */
    public int top() {
        return dataStack.peek();
    }

    /**
     * 找到栈中最小的元素
     * @return
     */
    public int min() {
        return minStack.peek();
    }

    @Test
    public void test(){
        //添加元素
        push(2);
        push(3);
        push(4);
        push(8);


        //找到栈中最小元素
        System.out.println(min());
    }
}
