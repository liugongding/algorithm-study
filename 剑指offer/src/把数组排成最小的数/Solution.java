package src.把数组排成最小的数;

import org.junit.Test;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * @author liudingding
 * @ClassName Solution
 * @description 题目描述：
 * 输入一个正整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个
 * 例如输入数组{3，32，321}，则打印出这三个数字能排成的最小数字为321323
 * <p>
 * 解题思路：
 * 可以看成是一个排序问题，在比较两个字符串 S1 和 S2 的大小时，应该比较的是 S1+S2 和 S2+S1 的大小，
 * 如果 S1+S2 < S2+S1，那么应该把 S1 排在前面，否则应该把 S2 排在前面。
 * @date 2019/12/11 21:07
 * Version 1.0
 */
public class Solution {


    public String PrintMinNumber(int [] numbers) {

        String[] strings = Arrays.stream(numbers)
                .mapToObj(item -> String.valueOf(item))
                .collect(Collectors.toList())
                .toArray(new String[]{});
        //这个本来就是升序的方法
        Arrays.sort(strings,(s1, s2) -> (s1+s2).compareTo(s2+s1));
        String result = Arrays.stream(strings).collect(Collectors.joining());
        return result;
    }

    @Test
    public void test() {
        int[] numbers = {3,32,321};
        System.out.println(PrintMinNumber(numbers));
    }

}
