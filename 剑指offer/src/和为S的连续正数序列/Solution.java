package src.和为S的连续正数序列;

import org.junit.Test;

import java.util.ArrayList;

/**
 * @author liudingding
 * @ClassName Solution
 * @description
 * 题目描述：
 * 小明很喜欢数学,有一天他在做数学作业时,要求计算出9~16的和,他马上就写出了正确答案是100。
 * 但是他并不满足于此,他在想究竟有多少种连续的正数序列的和为100(至少包括两个数)。
 * 没多久,他就得到另一组连续正数和为100的序列:18,19,20,21,22
 * 现在把问题交给你,你能不能也很快的找出所有和为S的连续正数序列? Good Luck!
 *
 * 输出描述：
 * 输出所有和为S的连续正数序列。序列内按照从小至大的顺序，序列间按照开始数字从小到大的顺序
 *
 * 例如和为 100 的连续序列有：
 * [9, 10, 11, 12, 13, 14, 15, 16]
 * [18, 19, 20, 21, 22]
 *
 * 解题思路:
 * 双指针法，类似于TCP滑动窗口
 * 如果目标值等于入参值，符合条件，把首项+1
 * 如果目标值小于入参值，扩大范围，把尾项+1
 * 如果目标值大于入参值，缩小范围，把首项+1
 * @date 2019/12/19 18:51
 * Version 1.0
 */
public class Solution {
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> arrayLists = new ArrayList<>();
        int firstItem = 1;
        int lastItem = 2;
        while (firstItem < lastItem) {
            int target = (firstItem + lastItem)*(lastItem - firstItem + 1)/2;
            if (target > sum) {
                firstItem++;
            } else if(target < sum){
                lastItem++;
            }else{
                ArrayList<Integer> arrayList = new ArrayList<>();
                for (int i = firstItem; i <= lastItem; i++) {
                    arrayList.add(i);
                }
                arrayLists.add(arrayList);
                firstItem++;
            }
        }
        return arrayLists;
    }

    @Test
    public void test(){
        ArrayList arrayList = FindContinuousSequence(10);
        arrayList.forEach(System.out::println);
    }

}
