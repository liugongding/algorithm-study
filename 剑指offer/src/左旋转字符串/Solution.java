package src.左旋转字符串;

import org.junit.Test;

/**
 * @author liudingding
 * @ClassName Solution
 * @description
 * 题目描述:
 *
 * 汇编语言中有一种移位指令叫做循环左移（ROL），现在有个简单的任务，就是用字符串模拟这个指令的运算结果。
 * 对于一个给定的字符序列S，请你把其循环左移K位后的序列输出。
 * 例如，字符序列S=”abcXYZdef”,要求输出循环左移3位后的结果，即“XYZdefabc”。是不是很简单？OK，搞定它！
 * @date 2019/12/23 19:59
 * Version 1.0
 */
public class Solution {
    public String LeftRotateString(String str,int n) {
        if (str.length() == 0) {
            return str;
        } else {
            str = str.substring(n) + str.substring(0,n);
        }
        return str;
    }


    @Test
    public void test(){
        String a = "liugongding";
        System.out.println(a.substring(3));
        System.out.println(a.substring(0,3));
        System.out.println(LeftRotateString(a, 2));
    }
}
