package src.数组中只出现一次的数字;

import org.junit.Test;

/**
 * @author liudingding
 * @ClassName Solution
 * @description
 * 解题思路：
 * 一个整型数组里除了两个数字之外，其他的数字都出现了两次。请写程序找出这两个只出现一次的数字
 * @date 2019/12/17 21:17
 * Version 1.0
 */
public class Solution {
    public void FindNumsAppearOnce(int[] nums, int num1[], int num2[]) {
        int diff = 0;
        for (int num : nums)
            diff ^= num;
        diff &= -diff;
        for (int num : nums) {
            if ((num & diff) == 0)
                num1[0] ^= num;
            else
                num2[0] ^= num;
        }
    }

    @Test
    public void test(){
        
    }
}
