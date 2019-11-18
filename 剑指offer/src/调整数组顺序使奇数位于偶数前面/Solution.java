package src.调整数组顺序使奇数位于偶数前面;

import org.junit.Test;

/**
 * @author liudingding
 * @ClassName Solution
 * @description
 * 题目描述：
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
 * 使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 * Input:{1,2,3,4,5,6,7}
 * Output:{1,3,5,7,2,4}
 * 解题思路：
 * 创建一个新数组、将旧数组从头开始遍历先把奇数依次存入，在存入偶数
 * @date 2019/10/30 20:16
 * Version 1.0
 */
public class Solution {

    public void reOrderArray(int[] nums) {
        // 奇数个数
        int oddCnt = 0;
        for (int x : nums)
            if (!isEven(x))
                oddCnt++;
        int[] copy = nums.clone();
        int i = 0, j = oddCnt;
        for (int num : copy) {
            if (num % 2 == 1)
                nums[i++] = num;
            else
                nums[j++] = num;
        }
    }


    public void reOrderArray1(int [] array) {
        int oddCnt = 0;
        for (int x : array) {
            if (!isEven(x)) {
                oddCnt++;
            }
        }
        int[] newArray = array.clone();
        int j = oddCnt;int i = 0;
        for (int a : array) {
            if (a % 2 == 1) {
                newArray[i++] = a;
            }else {
                newArray[j++] = a;
             }
        }

    }
    private boolean isEven(int x) {
        return x % 2 == 0;
    }
    @Test
    public void test(){
        int[] array = {1,2,3,4,5,6,7};
        reOrderArray1(array);
    }
}
