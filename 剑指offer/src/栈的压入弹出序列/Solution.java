package src.栈的压入弹出序列;

import org.junit.Test;

import java.util.Stack;

/**
 * @author liudingding
 * @ClassName Solution
 * @description
 * 题目描述：
 * 输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否可能为该栈的弹出顺序。假设压入栈的所有数字均不相等。
 * 例如序列1,2,3,4,5是某栈的压入顺序，序列4,5,3,2,1是该压栈序列对应的一个弹出序列，
 * 但4,3,5,1,2就不可能是该压栈序列的弹出序列。（注意：这两个序列的长度是相等的）

 * 解题思路：
 * 我们新建一个栈，将pushA入栈，当栈顶元素等于popB的时候，我们就将栈顶元素删除
 * 循环结束时，判断栈是否为空，若空则返回ture
 * @date 2019/11/30 12:51
 * Version 1.0
 */
public class Solution {

    /**
     * pushA是入栈序列
     * popA 是出栈序列
     * @param pushA
     * @param popA
     * @return
     */
    public boolean IsPopOrder(int[] pushA, int[] popA) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0,index = 0; i < pushA.length; i++) {
            stack.push(pushA[i]);
            while (!stack.isEmpty() && stack.peek() == popA[index]){
                stack.pop();
                index++;
            }
        }
        return stack.isEmpty();
    }

    @Test
    public void test(){
        int[] pushA = {1,2,3,4,5};
        int[] popA = { 4,3,5,1,2};
        System.out.println(IsPopOrder(pushA, popA));
    }
}
