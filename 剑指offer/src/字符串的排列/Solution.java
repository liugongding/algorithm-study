package src.字符串的排列;

import org.junit.Test;

import java.util.*;

/**
 * @author liudingding
 * @ClassName Solution
 * @description
 * 题目描述：
 * 输入一个字符串,按字典序打印出该字符串中字符的所有排列。
 * 例如输入字符串abc,则打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba
 * @date 2019/12/3 19:35
 * Version 1.0
 */
public class Solution {

    //去重的list
    private ArrayList<String> res = new ArrayList<>();
    //全排列的list
    private ArrayList<String> paths = new ArrayList<>();

    private StringBuilder path = new StringBuilder();
    private boolean[] visited;

    public ArrayList<String> Permutation(String str) {
        if (str == null || str.equals("")) {
            return res;
        }
        char[] strs = str.toCharArray();
        Arrays.sort(strs);
        visited = new boolean[strs.length];
        combination(strs, 0);
        //list去重操作
//        paths.forEach(item -> {
//            if (!res.contains(item)) {
//                res.add(item);
//            }
//        });
        for (int i = 0; i < paths.size(); i++) {
            if (!res.contains(paths.get(i))){
                res.add(paths.get(i));
            }
        }
        return res;
    }

    private void combination(char[] strs, int len) {
        if (len == strs.length) {
            paths.add(path.toString());
            return;
        }
        for (int i = 0; i < strs.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                path.append(strs[i]);
                combination(strs, len + 1);
                //Duang ~ 回溯 - 状态重置
                visited[i] = false;
                path.deleteCharAt(path.length() - 1);
            }
        }
    }
    @Test
    public void test(){
        ArrayList<String> result = Permutation("abc");
        result.forEach(System.out::println);
        System.out.println(result.size());
    }

}
