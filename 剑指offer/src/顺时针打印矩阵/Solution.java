package src.顺时针打印矩阵;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

/**
 * @author liudingding
 * @ClassName Solution
 * @description
 * 题目描述：
 * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，
 * 例如，如果输入如下4 X 4矩阵：
 * [1, 2, 3, 4]
 * [5, 6, 7, 8]
 * [9, 10, 11, 12]
 * [13, 14, 15, 16]
 * 则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
 * @date 2019/11/22 13:52
 * Version 1.0
 */
public class Solution {

    public ArrayList<Integer> printMatrix(int[][] matrix) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return arrayList;
        }
        int up = 0;
        //行
        int down = matrix.length - 1;
        int left = 0;
        //列
        int right = matrix[0].length - 1;
        //遍历二维数组
        Arrays.stream(matrix).flatMap(c -> Stream.of(c)).map(c -> Arrays.toString(c)).forEach(System.out::println);
        while (up <= down && left <= right) {
            //最上面一行
            for (int i = left; i <= right; i++) {
                arrayList.add(matrix[up][i]);
            }
            //向下逼近
            up++;
            //判断是否越界
            if (up > down) {
                break;
            }
            //最右边一行
            for (int i = up; i <= down; i++) {
                arrayList.add(matrix[i][right]);
            }
            //向左逼近
            right--;
            //判断是否越界
            if (left > right) {
                break;
            }
            //最下面一行
            for (int i = right; i >= left; i--) {
                arrayList.add(matrix[down][i]);
            }

            //向上逼近
            down--;
            //判断是否越界
            if (up > down) {
                break;
            }
            //最左边一行
            for (int i = down; i >= up; i--) {
                arrayList.add(matrix[i][left]);
            }
            //往右逼近
            left++;
            //判断是否越界
            if (left > right) {
                break;
            }

        }
        return arrayList;
    }

    @Test
    public void test() {
        int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}, {17, 18, 19, 20}};
        int[][] matrix1 = {{1}, {2}, {3}, {4}};
        System.out.println(printMatrix(matrix));
    }
}
