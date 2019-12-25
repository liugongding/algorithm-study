package src.不使用加减乘除做加法;

import org.junit.Test;

/**
 * @author liudingding
 * @ClassName Solution
 * @description
 *
 * 题目描述：
 * 写一个函数，求两个整数之和，要求在函数体内不得使用+、-、*、/四则运算符号。
 *
 * 首先看十进制是如何做的： 5+7=12，三步走
 * 第一步：相加各位的值，不算进位，得到2。
 * 第二步：计算进位值，得到10. 如果这一步的进位值为0，那么第一步得到的值就是最终结果。
 * 第三步：重复上述两步，只是相加的值变成上述两步的得到的结果2和10，得到12。
 * 同样我们可以用三步走的方式计算二进制值相加： 5-101，7-111 第一步：相加各位的值，不算进位，
 * 得到010，二进制每位相加就相当于各位做异或操作，101^111。
 * 第二步：计算进位值，得到1010，相当于各位做与操作得到101，再向左移一位得到1010，(101&111)<<1。
 * 第三步重复上述两步， 各位相加 010^1010=1000，进位值为100=(010&1010)<<1。
 *      继续重复上述两步：1000^100 = 1100，进位值为0，跳出循环，1100为最终结果
 *
 * 异或运算（^）代表计算结果
 * 与运算（&） 代表进位
 * @date 2019/12/25 18:17
 * Version 1.0
 */
public class Solution {

    public int Add(int num1, int num2) {
        int result = 0;
        int carryBit = 0;
        do {
            result = num1 ^ num2;
            carryBit = (num1 & num2) << 1;
            num1 = result;
            num2 = carryBit;
        } while (carryBit != 0);
        return result;
    }

    @Test
    public void test(){
        int num1 = 5;
        int num2 = 7;
        System.out.println(Add(num1, num2));
    }

}
