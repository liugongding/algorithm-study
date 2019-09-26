package 排序算法.冒泡排序;

import java.util.Arrays;

/**
 * @Description 冒泡排序
 * @Author liugongding
 * @Date 2019-09-25
 */
public class BubbleSort {

    /**
     * 5, 7, 2, 9, 4, 1, 0, 5,7
     * 总共比较arr.length-1轮，第一个数自己不和自己比较，比较完之后，最大的数就放到了最后面
     *
     * @param arr
     */
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{5, 7, 2, 9, 4, 1, 0, 5, 7};
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
