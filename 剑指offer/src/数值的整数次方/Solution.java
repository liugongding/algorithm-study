package src.数值的整数次方;

import org.junit.Test;

/**
 * @author liudingding
 * @ClassName Solution
 * @description
 * 题目描述
 * 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。保证base和exponent不同时为0
 * 题目分析：
 * base >= 0; exponent是整型的，考虑正负零的情况；
 * 指数运算的本质就是累乘
 * @date 2019/10/30 10:26
 * Version 1.0
 */
public class Solution {

    public double Power(double base, int exponent) {
        if (base == 0.0) {
            return base;
        }
        //当exponent为0的时候的返回结果
        double result = 1.0;
        //获取exponent的绝对值
        int e = exponent > 0 ? exponent : -exponent;
        //指数运算的本质是累乘
        for (int i = 0; i < e; i++) {
            result  = result * base;
        }
        return exponent > 0 ? result : 1/result;
    }

    @Test
    public void test(){
        System.out.println(Power(2, -3));
    }
}
