package 排序算法.插入排序;

import org.junit.Test;

import java.sql.SQLOutput;
import java.util.Arrays;

/**
 * @author liudingding
 * @ClassName InsertSort
 * @description
 * ①. 从第一个元素开始，该元素可以认为已经被排序
 *
 * ②. 取出下一个元素，在已经排序的元素序列中从后向前扫描
 *
 * ③. 如果该元素（已排序）大于新元素，将该元素移到下一位置
 *
 * ④. 重复步骤3，直到找到已排序的元素小于或者等于新元素的位置
 *
 * ⑤. 将新元素插入到该位置后
 *
 * ⑥. 重复步骤②~⑤
 * @date 2019/12/10 20:50
 * Version 1.0
 */
public class InsertSort {

    public void insertSort(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i ; j>=0; j--) {
                if (array[j + 1] < array[j]) {
                    int index = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = index;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }


    @Test
    public void test() {
        int[] array = {9, 3, 1, 5, 2, 4, 6, 8,7};
        insertSort(array);
    }
}
