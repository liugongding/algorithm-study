package 排序算法.插入排序;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author liudingding
 * @ClassName InsertSort2
 * @description
 * @date 2019/12/11 11:12
 * Version 1.0
 */
public class InsertSort2 {

    public void insertSort(int[] array) {

        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
        System.out.println(Arrays.toString(array));
    }

    @Test
    public void test() {
        int[] array = {9, 3, 1, 5, 2, 4, 33, 6, 8, 7, 0};
        insertSort(array);
    }
}
