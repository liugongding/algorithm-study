package src.青蛙跳台阶;

import org.junit.Test;

/**
 * @author liudingding
 * @ClassName Solution
 * @description
 * 题目描述：一只青蛙一次可以跳上 1 级台阶，也可以跳上 2 级。求该青蛙跳上一个 n 级的台阶总共有多少种跳法。
 * 解题思路： 如图、本质上是一个递归操作
 *
 * @date 2019/10/24 20:25
 * Version 1.0
 */
public class Solution {
    /**
     * 我们相当于把前两式计算结果存起来了
     * @param target
     * @return
     */
    public int JumpFloor(int target) {
        if (target <= 2) {
            return target;
        }

        int f1 = 1;
        int f2 = 2;
        int result = 0;
        for (int i = 3; i <= target; i++) {
            result = f1 + f2;
            f1 = f2;
            f2 = result;
        }
        return result;
    }

    @Test
    public void test() {
        System.out.println(JumpFloor(6));
    }
}
