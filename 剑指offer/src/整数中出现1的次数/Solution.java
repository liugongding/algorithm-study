package src.整数中出现1的次数;

import org.junit.Test;

/**
 * @author liudingding
 * @ClassName Solution
 * @description
 * 题目描述：
 * 求出1~13的整数中1出现的次数,并算出100~1300的整数中1出现的次数？
 * 为此他特别数了一下1~13中包含1的数字有1、10、11、12、13因此共出现6次,但是对于后面问题他就没辙了。
 * ACMer希望你们帮帮他,并把问题更加普遍化,可以很快的求出任意非负整数区间中1出现的次数（从1 到 n 中1出现的次数）
 *
 * 解题思路：
 * 我们直接从 1-n ,遇到一个1，就将计数器+1
 * 比如 21，我们把它转化为字符数组，第二个字符就是1，将计数器+1
 * @date 2019/12/11 17:23
 * Version 1.0
 */
public class Solution {


    public int NumberOf1Between1AndN_Solution(int n) {
        int count = 0;
        while (n > 0) {
            String str = String.valueOf(n);
            char[] chars = str.toCharArray();
            for (char val : chars) {
                if (val == '1') {
                    count++;
                }
            }
            n--;
        }
        return count;
    }
    @Test
    public void test(){
        System.out.println(NumberOf1Between1AndN_Solution(11));
    }
}
