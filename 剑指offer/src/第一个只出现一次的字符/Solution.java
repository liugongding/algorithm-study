package src.第一个只出现一次的字符;

import org.junit.Test;


/**
 * @author liudingding
 * @ClassName Solution
 * @description
 * 题目描述：
 * 在一个字符串(0<=字符串长度<=10000，全部由字母组成)中找到第一个只出现一次的字符，
 * 并返回它的位置,如果没有则返回 -1（需要区分大小写）.
 *
 * 解题思路：
 * 我们用hash的思想在做，我们用一个计数器数组来保存字符出现的次数
 * 索引就是每个字符的ASCII码（就代表那个字符），内容就是每个字符出现的次数
 *
 *
 * 一个字符2个字节
 * char只能存储2个字节
 * ASCII总共有128
 * 10000个字符总共20000个字节
 * @date 2019/12/13 20:59
 * Version 1.0
 */
public class Solution {


    public int FirstNotRepeatingChar(String str) {
        if (str.length() == 0) {
            return -1;
        }
        int[] count = new int[256];
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }
        for (int i = 0; i < count.length; i++) {
            if (count[str.charAt(i)] == 1) {
                return i;
            }
        }
        return -1;
    }

    @Test
    public void test(){
        String str = "googlez";
        System.out.println(FirstNotRepeatingChar(str));
    }
}
