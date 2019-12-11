package src.连续子数组的最大和;

import org.junit.Test;

/**
 * @author liudingding
 * @ClassName Solution
 * @description 题目描述：
 * {6, -3, -2, 7, -15, 1, 2, 2}，连续子数组的最大和为 8（从第 0 个开始，到第 3 个为止）
 * <p>
 * 解题思路：
 * 从前往后遍历，最大的连续子序列的和是由当前元素和之前的最大连续子序列的和叠加在一起形成的
 * 如果之前的最大连续子序列的和大于零，我们可以继续累加，如果小于零，则需要舍去之前的子序列，
 * 重新从当前的数字开始累加。时间复杂度为O(n)
 * @date 2019/12/11 14:54
 * Version 1.0
 */
public class Solution {

    public int FindGreatestSumOfSubArray(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int greatestSum = Integer.MIN_VALUE;
        int sum = 0;
        for (int val : nums) {
//            if (sum <= 0) {
//                sum = val;
//            } else {
//                sum = sum + val;
//            }
//            sum = sum <= 0 ? val : sum + val;
            sum = Math.max( val,val+sum);
            //这里其实是为了处理全部为负数的情况
            greatestSum = Math.max(greatestSum, sum);
        }

        return greatestSum;
    }


    @Test
    public void test() {
        int[] nums = {1,2,3,4};
        System.out.println(FindGreatestSumOfSubArray(nums));
    }
}
