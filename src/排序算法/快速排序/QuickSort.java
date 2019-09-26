package 排序算法.快速排序;

import java.util.Arrays;

/**
 * @Description
 * @Author liugongding
 * @Date 2019-09-25
 */
public class QuickSort {

    /**
     * left表示左边第一个数，right表示右边的第一个数据
     *
     * @param arr
     * @param left
     * @param right
     */
    static void quickSort(int arr[], int left, int right) {
        int i, j, key;
        if (left > right) {
            return;
        }
        //基准数
        key = arr[left];
        //最左边的数
        i = left;
        //最右边的数
        j = right;

        //我们的目的是把右边比基准数小的值与左边比基准数大的值进行交换
        //右边都是比基准数大的数，左边都是比基准数小的数
        while (i != j) {

            //如果右边的值比基准数大，就向左移一位
            while (arr[j] >= key && i < j) {
                j--;
            }
            //如果左边的值比基准数小，就右移一位
            while (arr[i] <= key && i < j) {
                i++;
            }
            //右边比基准数小的值与左边比基准数大的值进行交换
            if (arr[i] > arr[j] && i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        //当 i==j 时，我们交换最左边的数与基准数
        //左边的数都比基准数小，右边的数都比基准数大
        arr[left] = arr[i];
        arr[i] = key;

        quickSort(arr, left, i - 1);
        quickSort(arr, j + 1, right);
    }

    public static void main(String[] args) {
        int[] arr = new int[]{6, 1, 2, 7, 9, 3, 4, 5, 10, 8};
        System.out.println("排序前：" + Arrays.toString(arr));
        quickSort(arr, 0, arr.length - 1);
        System.out.println("排序后：" + Arrays.toString(arr));
    }
}
