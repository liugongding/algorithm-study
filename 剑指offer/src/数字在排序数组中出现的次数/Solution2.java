package src.数字在排序数组中出现的次数;

import org.junit.Test;

/**
 * @author liudingding
 * @ClassName Solution2
 * @description
 *
 * 除法是向下取整
 * @date 2019/12/17 14:24
 * Version 1.0
 */
public class Solution2 {

    public int GetNumberOfK(int [] array , int k) {
        if (array == null || array.length == 0) {
            return 0;
        }
        int startData = firstIndexOf(array,k);
        int endData = lastIndexOf(array, k);
        if (startData > -1 && endData > -1) {
            return endData - startData + 1;
        }
        return 0;

    }

    public int firstIndexOf(int [] array , int k){
        int start = 0;
        int end = array.length - 1;
        int mid = (start + end) / 2;
        while (start <= end) {
            if (array[mid] == k) {
                if (mid == 0 || array[mid -1 ] != k) {
                    //恰好是一个数而且前面没有与目标元素相同的数
                    //返回数组下标
                    return mid;
                } else {
                    //目标元素前面有与目标元素相同的数
                    end = mid - 1;
                }
            } else if (array[mid] > k) {
                //目标元素在左侧子数组中
                end = mid - 1;
            } else {
                start = mid + 1;
            }
            mid = (start + end) / 2;
        }
        return -1;
    }

    public int lastIndexOf(int [] array , int k){
        int start = 0;
        int end = array.length - 1;
        int mid = (start + end) / 2;
        while (start <= end) {
            if (array[mid] == k) {
                if (mid == array.length - 1 || array[mid + 1] != k) {
                    //恰好是一个数而且后面没有与目标元素相同的数
                    //返回数组下标
                    return mid;
                } else {
                    //目标元素后面有与目标元素相同的数
                    start = mid + 1;
                }
            } else if (array[mid] > k) {
                //目标元素在左侧子数组中
                end = mid - 1;
            } else {
                start = mid + 1;
            }
            mid = (start + end) / 2;
        }
        return -1;
    }


    @Test
    public void test(){
        int[] array = {3,3,3,3,4,5};
        System.out.println(GetNumberOfK(array, 3));

    }
}
