package src.变态跳台阶;

/**
 * @author liudingding
 * @ClassName Solution
 * @description 题目描述：
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法
 * ============================================================================================
 * <p>
 * 解题思路：
 * 跳到 n-1 的台阶上，可以从 n-2 级向上跳一级，一种跳法；跳到 n-2 的台阶上，可以从 n-3 级向上跳一级，一种跳法
 * f(n-1) = f(n-2) + f(n-3) + ... + f(n-n)
 * 同样，跳上 n 级台阶，可以从 n-1 级跳 1 级上去，也可以从 n-2 级跳 2 级上去... ，那么
 * f(n) = f(n-1) + f(n-2) + ... + f(n-n)
 * 我们可以看出是一个等比数列，错位相减的：f(n)/f(n-1) = 2
 *
 * 介绍函数：
 * Math.pow(x,y) -> x 的 y 次方
 *
 * @date 2019/10/30 8:57
 * Version 1.0
 */
public class Solution {

    public int JumpFloorII(int target) {
        return (int) Math.pow(2, target - 1);
    }


}
