package src.求等差数列;

import org.junit.Test;

/**
 * @author liudingding
 * @ClassName Solution
 * @description
 *
 * 题目描述：
 * 求1+2+3+...+n，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）。
 *
 * >> 位运算相当于除以2，将二进制的数字向右移一位
 * @date 2019/12/25 13:00
 * Version 1.0
 */
public class Solution {
    public int Sum_Solution(int n) {
        int result =(int)(Math.pow(n, 2) + n) >> 1;
        return result;
    }

    @Test
    public void test(){
        System.out.println(Sum_Solution(3));
    }
}
