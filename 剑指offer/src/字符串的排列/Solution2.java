package src.字符串的排列;

import org.junit.Test;

import java.util.ArrayList;

/**
 * @author liudingding
 * @ClassName Solution2
 * @description 题目描述：
 * 输入一个字符串,按字典序打印出该字符串中字符的所有排列。
 * 例如输入字符串abc,则打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba
 * <p>
 * 解题思路：
 * 我们先固定第一个字母(如："a")，递归一次让第二个字母追加到第一个字母(此时把2个字母当成一个字母处理,如："a" + "b" = "ab")，
 * 在递归一次("a" + "b" + "c" = "abc") 如果发现一个个字母追加的长度等于输入字符串的长度，我们就添加到list
 * 递归完成之后，我们回溯到上一个字母，将追加形成的字符串的最后一个字母去掉("abc - 1" = "ab"),再往前回溯一次("ab" - 1 = "a")
 * 上一次递归 b 已经固定了，我们现在在固定 c ("a" + "c" = "ac"),再递归一次("ac" + "b" = "acb")...........往后以此类推
 * 不难发现我们要用一个boolean类型的数组来标识那个一个字母用了，哪一个字母没用，用了的话，就不能再固定了。
 * 关于递归：递归的时候我们将那个字母用掉固定，就将那个字母的标识置为true，这个字母就不能用了。
 * 关于回溯：回溯的时候我们，那个字母用了，我们就重置那个字母的标识置为false
 * <p>
 * 注意：我们尽量不要在递归方法里面new对象，这样回频繁的开辟内存
 * @date 2019/12/4 18:03
 * Version 1.0
 */
public class Solution2 {

    //全排列的list
    private ArrayList<String> arrayList = new ArrayList<>();
    //去重的list
    private ArrayList<String> removeDuplicate = new ArrayList<>();
    private StringBuilder strs = new StringBuilder();

    public ArrayList<String> Permutation(String str) {
        //注意边界条件，空字符串就返回空字符串，不要返回null
        if (str.length() == 0) {
            return removeDuplicate;
        }

        char[] chars = str.toCharArray();
        boolean[] isUsed = new boolean[str.length()];
        range(chars, isUsed, str.length());
        //list去重操作
//        arrayList.forEach(item -> {
//            if (!removeDuplicate.contains(item)) {
//                removeDuplicate.add(item);
//            }
//        });
        for (int i = 0; i < arrayList.size(); i++) {
            if (!removeDuplicate.contains(arrayList.get(i))) {
                removeDuplicate.add(arrayList.get(i));
            }
        }
        return removeDuplicate;
    }

    public void range(char[] chars, boolean[] isUsed, int characterLength) {
        if (strs.length() == characterLength) {
            arrayList.add(strs.toString());
            //添加到list之后，该方法就结束
            return;
        }
        for (int i = 0; i < characterLength; i++) {
            if (!isUsed[i]) {
                //该字母标记已经用了
                isUsed[i] = true;
                strs.append(chars[i]);
                range(chars, isUsed, characterLength);
                //Duang ~ 回溯 - 状态重置
                isUsed[i] = false;
                strs.deleteCharAt(strs.length() - 1);
            }
        }
    }

    @Test
    public void test() {
        ArrayList<String> result = Permutation("");
        result.forEach(System.out::println);
    }
}
