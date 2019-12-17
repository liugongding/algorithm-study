package src.数字在排序数组中出现的次数;

import org.junit.Test;

/**
 * @author liudingding
 * @ClassName Solution
 * @description
 * 题目描述：
 * 统计一个数字在排序数组中出现的次数
 *
 * 思路一：
 * 暴力解，遍历数组并对比，一个循环，时间复杂度为O(N)
 *
 * 思路二：
 * 由于数组是一个排序过的数组，所以可以用二分查找法，定位k的第一次出现位置和最后一次出现位置
 * 时间复杂度为O(logN)
 * @date 2019/12/17 14:14
 * Version 1.0
 */
public class Solution {

    public int GetNumberOfK(int [] array , int k) {
        int count = 0;
        if (array.length == 0) {
            return 0;
        } else {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == k) {
                    count++;
                }
            }
        }
        return count;
    }

    @Test
    public void test(){
        int[] array = {1, 2, 3, 3, 3, 3, 4, 6};
        System.out.println(GetNumberOfK(array, 3));
    }

}
