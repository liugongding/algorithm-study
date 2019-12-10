package src.数组中出现次数超过一半的数字;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author liudingding
 * @ClassName
 * @description
 * 题目描述：
 * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
 * 例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。由于数字2在数组中出现了5次，
 * 超过数组长度的一半，因此输出2。如果不存在则输出0
 *
 * 本人思路：将每个数组中出现的数字放到一个数组计数器里面，可以知道某个数字出现次数是否超过数组
 * 长度的一半，最大值的数组下标就是出现次数最多的那个数。
 * 这里是创建一个二维数组，第一行保存数组计数器，第二行表示输入的数组
 * @date 2019/12/8 21:14
 * Version 1.0
 */
public class Solution {

    public int MoreThanHalfNum_Solution(int[] array) {
        if (array.length == 0 || array.length == 1) {
            return array[0];
        }
        int[][] newArray = new int[2][array.length];
        int newArrayLength = array.length / 2;
        System.out.println("长度 ：" + newArrayLength);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i == 0) {
                    newArray[i][array[j]]++;
                }
                if (i == 1) {
                    newArray[i][j] = array[j];
                }
            }

        }
        Arrays.stream(newArray)
                .map(item -> Arrays.toString(item))
                .forEach(System.out::println);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i == 0) {
                    while (newArray[i][j] > newArrayLength) {
                        return j;
                    }
                }
            }
        }
        return 0;
    }

    @Test
    public void test() {
        int[] array = {1,2,3,2,4,2,5,2,3};
        System.out.println(MoreThanHalfNum_Solution(array));
    }
}
