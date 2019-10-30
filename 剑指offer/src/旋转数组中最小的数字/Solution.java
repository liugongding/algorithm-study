package src.旋转数组中最小的数字;

import org.junit.Test;

/**
 * @author liudingding
 * @ClassName Solution
 * @description
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 * 输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
 * 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
 *
 * 解题思路：
 * 既然是旋转数组，那么前面一段时递增的，后面一段是递减的
 * 我们只要用暴力法把找到分界点就行，array[i] > array[i+1]
 * @date 2019/10/24 19:22
 * Version 1.0
 */
public class Solution {

    public int minNumberInRotateArray(int [] array) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > array[i+1]) {
                result = array[i+1];
                return result;
            }

        }
        return result;
    }

    @Test
    public void test(){
        int[] array = {3,4,5,1,2};
        System.out.println(minNumberInRotateArray(array));

        System.out.println((1+8)/2);
    }
}
