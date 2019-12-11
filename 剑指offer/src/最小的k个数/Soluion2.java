package src.最小的k个数;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author liudingding
 * @ClassName Soluion2
 * @description
 * 题目描述：
 * 输入n个整数，找出其中最小的K个数。例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4

 * 解题思路：
 * 将这些数进行从小到大排序，然后将前 K 个元素添加到list
 * @date 2019/12/11 11:26
 * Version 1.0
 */
public class Soluion2 {

    public ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Arrays.sort(input);
//        for (int i = 0; i < input.length - 1; i++) {
//            int key = input[i];
//            for (int j = i; j >= 0; j--) {
//                if (input[j + 1] < input[j]) {
//                    int index = input[j];
//                    input[j] = input[j + 1];
//                    input[j + 1] = index;
//                }
//            }
//        }
        for (int i = 0; i < k; i++) {
            arrayList.add(input[i]);
        }
       return arrayList;
    }

    @Test
    public void test() {
        int[] input = {4, 5, 1, 6, 2, 7, 3, 8};
        GetLeastNumbers_Solution(input, 4);
    }
}
