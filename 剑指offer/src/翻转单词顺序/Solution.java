package src.翻转单词顺序;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author liudingding
 * @ClassName Solution
 * @description
 * 题目描述
 * Input:
 * "I am a student."
 *
 * Output:
 * "student. a am I"
 *
 * 解题思路：
 * 从空格开始分割转化为String数组，然后逆序遍历每一个单词，添加一个空格
 * 最后一个单词就不添加空格了
 * @date 2019/12/24 10:44
 * Version 1.0
 */
public class Solution {

    public String ReverseSentence(String str) {
        //遇到空字符串直接返回
        if (str.length() == 0){
            return str;
        }
        String[] strings = str.split("\\s+");
        //遇到字符串都是空格的，也直接返回
        if (strings.length == 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = strings.length - 1; i >=0 ; i--) {
            if (i == 0) {
                sb.append(strings[i]);
            } else {
                sb.append(strings[i]+" ");
            }

        }
        String index = sb + "";
        return index;
    }


    @Test
    public void test(){
        String str = "  ";
        String result = ReverseSentence(str);
        char[] chars = result.toCharArray();
        System.out.println(Arrays.toString(chars));
        System.out.println(result);
    }
}
