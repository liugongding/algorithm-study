package src.和为S的两个数字;

import org.junit.Test;

import java.util.ArrayList;

/**
 * @author liudingding
 * @ClassName Solution
 * @description
 * 题目描述：
 * 输入一个递增排序的数组和一个数字S，在数组中查找两个数，
 * 使得他们的和正好是S，如果有多对数字的和等于S，输出两个数的乘积最小的
 *
 * 解题思路：
 * 使用双指针，一个指针指向元素较小的值，一个指针指向元素较大的值。指向较小元素的指针从头向尾遍历，指向较大元素的指针从尾向头遍历。
 *
 * 如果两个指针指向元素的和 sum == target，那么得到要求的结果；
 * 如果 sum > target，移动较大的元素，使 sum 变小一些；
 * 如果 sum < target，移动较小的元素，使 sum 变大一些。
 *
 * 第一次添加到集合的肯定是成绩最小的
 * @date 2019/12/19 16:17
 * Version 1.0
 */
public class Solution {

    public ArrayList<Integer> FindNumbersWithSum(int [] array, int sum) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        if (array.length == 0) {
            return arrayList;
        }
        int i = 0;
        int j = array.length - 1;
        while (i < j && j >= 0) {
            int target = array[i] + array[j];
            if (target == sum) {
                arrayList.add(array[i]);
                arrayList.add(array[j]);
                break;
            }
            if (target > sum) {
                j--;
            } else {
                i++;
            }
        }
        return arrayList;
    }

    @Test
    public void test(){
        int[] array = {};
        ArrayList<Integer> arrayList = FindNumbersWithSum(array, 0);

    }



}

