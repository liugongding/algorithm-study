package 排序算法.基数排序;

import java.util.Arrays;

/**
 * @Description
 * @Author liugongding
 * @Date 2019-09-26
 */
public class RadixSort {


    public static void radixSort(int[] arrays) {

        //数组中的最大数字
        int max = arrays[0];
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] > max) {
                max = arrays[i];
            }
        }
        //最大数的位数
        int maxLength = (max + "").length();
        //把各个数存到桶里面
        int[][] temp = new int[10][arrays.length];
        //记录在每个桶temp里面的元素数量
        int [] counts = new int[10];
        //根据最大长度的数决定比较次数
        for (int i = 0, n = 1; i < maxLength; i++, n *= 10) {
            //将每一个数字取余分别放到捅里
            //循环每一个数放到哪一个桶里
            for (int j = 0; j < arrays.length; j++) {
                int remainder = (arrays[j] / n) % 10;
                temp[remainder][counts[remainder]] = arrays[j];
                counts[remainder]++;
            }

            //第几次放桶
//            if (i == 0) {
//                for (int[] nums : temp) {
//                    System.out.println(Arrays.toString(nums));
//                }
//            }
            int index = 0;
            //遍历10个桶
            for (int j = 0; j < counts.length; j++) {
                if (counts[j] != 0) {
                    //遍历每个桶里面的元素
                    for (int k = 0; k < counts[j]; k++) {
                        arrays[index++] = temp[j][k];
                    }
                    //初始化桶
                    counts[j] = 0;
                }
            }
            System.out.println("第"+i+"次排序："+Arrays.toString(arrays));
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{23, 6, 189, 45, 9, 287, 56, 1, 789, 34, 65, 652, 5,88};
        System.out.println("未排序：" + Arrays.toString(arr));
        radixSort(arr);
    }
}
